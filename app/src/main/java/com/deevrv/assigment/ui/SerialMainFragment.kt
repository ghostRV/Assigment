package com.deevrv.assigment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.deevrv.assigment.R
import com.deevrv.assigment.feature.search.SearchFragment
import com.deevrv.assigment.ui.Detail.*
import kotlinx.android.synthetic.main.fragment_serial_main.*

class SerialMainFragment : Fragment(R.layout.fragment_serial_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToTheBoys.setOnClickListener() {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, TheBoysFragment())
                .addToBackStack("TheBoysFragment")
                .commit()
        }
        btnToAlteredCarbon.setOnClickListener() {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, AlteredCarbonFragment())
                .addToBackStack("AlteredCarbonFragment")
                .commit()
        }
        btnToQueensGambit.setOnClickListener() {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, QueensGambitFragment())
                .addToBackStack("QueensGambitFragment")
                .commit()
        }
        btnToUmbrellaAcademy.setOnClickListener() {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, UmbrellaAcademyFragment())
                .addToBackStack("UmbrellaAcademyFragment")
                .commit()
        }
        btnToSearch.setOnClickListener() {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("SearchFragment")
                .commit()
        }
    }
}