package com.deevrv.assigment.ui.Detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.deevrv.assigment.R
import com.deevrv.assigment.Serial
import kotlinx.android.synthetic.main.fragment_serial_details.*


class SerialDetailsFragment : Fragment(R.layout.fragment_serial_details) {

    companion object {
        private const val SERIAL = "SERIAL"

        fun newInstance (serial:Serial) =
            SerialDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(SERIAL, serial)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let{
            val serial = it.getParcelable<Serial>(SERIAL)

            tvName.text = "Сериал: ${serial?.name}"
            tvYearCreation.text = "Год: ${serial?.year}"
        }
    }

}