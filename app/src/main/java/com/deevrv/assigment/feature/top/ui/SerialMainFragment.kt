package com.deevrv.assigment.feature.top.ui

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.deevrv.assigment.R
import com.deevrv.assigment.Serial
import com.deevrv.assigment.feature.search.SearchFragment
import com.deevrv.assigment.feature.top.presentation.SerialMainPresenter
import com.deevrv.assigment.feature.top.presentation.SerialMainView
import com.deevrv.assigment.ui.Detail.SerialDetailsFragment
import kotlinx.android.synthetic.main.fragment_serial_main.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class SerialMainFragment : MvpAppCompatFragment(R.layout.fragment_serial_main), SerialMainView {

    private val presenter: SerialMainPresenter by moxyPresenter {
        SerialMainPresenter()
    }

    private var serialAdapter: SerialMainAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnToSearch.setOnClickListener {
            requireFragmentManager().beginTransaction()
                    .replace(R.id.container, SearchFragment())
                    .addToBackStack("Search fragment")
                    .commit()
        }

        with(rvSerialMains) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = SerialMainAdapter(onSerialClick = { presenter.onSerialClick(it) }).also {
                serialAdapter = it
            }

        }

    }

//    override fun deleteItem(serial: Serial) {
//        serialAdapter?.deleteItem(serial)
//    }

    override fun openDetailScreen(serial: Serial) {
        requireFragmentManager().beginTransaction()
                .replace(R.id.container, SerialDetailsFragment.newInstance(serial))
                .addToBackStack("fragment_serial_details")
                .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        serialAdapter = null
    }
    override fun showSerial (serial: List<Serial>){
        serialAdapter?.setData(serial)
    }
}

