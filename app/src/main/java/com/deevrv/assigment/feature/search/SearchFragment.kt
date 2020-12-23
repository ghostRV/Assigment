package com.deevrv.assigment.feature.search

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.util.rangeTo
import androidx.fragment.app.Fragment
import com.deevrv.assigment.R
import kotlinx.android.synthetic.main.fragment_search.*

enum class TYPE { ALL, Fantasy, Comics, Drama }
class SearchFragment : Fragment(R.layout.fragment_search), SearchView {

    private val presenter = SearchPresenter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.attachView(this)

        initListeners()
    }

    private fun initListeners() {
        rgType.setOnCheckedChangeListener { group: RadioGroup?, checkedId: Int ->
            val selectedType = when (checkedId) {
                R.id.rbComics -> TYPE.Comics
                R.id.rbDrama -> TYPE.Drama
                R.id.rbFantasy -> TYPE.Fantasy
                else -> TYPE.ALL
            }
            presenter.setType(selectedType)
        }
        btnSearch.setOnClickListener {
            presenter.validate(
                etRatingFrom.text.toString(),
                etRatingTo.text.toString(),
                etYearFrom.text.toString(),
                etYearTo.text.toString()

            )
        }


    }

    override fun showRatingFromError() {
        showError("Рейтинг от")

    }

    override fun showRatingToError() {
        showError("Рейтинг до")

    }

    override fun showYearFromError() {
        showError("Год от")

    }

    override fun showYearToError() {
        showError("Год до")

    }

    private fun showError(name: String) {
        Toast.makeText(requireContext(), "Ошибка в поле $name", Toast.LENGTH_LONG).show()
    }
}