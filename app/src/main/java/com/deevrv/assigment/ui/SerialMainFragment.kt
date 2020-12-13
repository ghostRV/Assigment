package com.deevrv.assigment.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.deevrv.assigment.R
import com.deevrv.assigment.ui.Detail.*
import kotlinx.android.synthetic.main.fragment_serial_main.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SerialMainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SerialMainFragment : Fragment(R.layout.fragment_serial_main) {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SerialMainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SerialMainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToTheBoys.setOnClickListener(){
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, TheBoysFragment())
                .addToBackStack("TheBoysFragment")
                .commit()
        }
        btnToAlteredCarbon.setOnClickListener(){
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, AlteredCarbonFragment())
                .addToBackStack("AlteredCarbonFragment")
                .commit()
        }
        btnToQueensGambit.setOnClickListener(){
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,QueensGambitFragment())
                .addToBackStack("QueensGambitFragment")
                .commit()
        }
        btnToUmbrellaAcademy.setOnClickListener(){
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,UmbrellaAcademyFragment())
                .addToBackStack("UmbrellaAcademyFragment")
                .commit()
        }
        btnToSearch.setOnClickListener(){
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("SearchFragment")
                .commit()
        }
    }
}