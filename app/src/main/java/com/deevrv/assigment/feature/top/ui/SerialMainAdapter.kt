package com.deevrv.assigment.feature.top.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.deevrv.assigment.R
import com.deevrv.assigment.Serial
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.serial_main_item.*

class SerialMainAdapter (private val onSerialClick:(Serial) -> Unit):RecyclerView.Adapter<SerialMainAdapter.ViewHolder>(){

    private var serials:MutableList<Serial> = mutableListOf()

    fun setData(serial: List<Serial>){
        this.serials.clear()
        this.serials.addAll(serial)
        notifyDataSetChanged()
    }
//    fun deleteItem(serial:Serial) {
//        notifyItemRemoved(serials.indexOf(serial))
//        this.serials.remove(serial)
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.serial_main_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = serials[position]
        holder.containerView.setOnClickListener{
            onSerialClick(item)
        }
        holder.serialMainName.text = item.name
        holder.serialMainYear.text = item.year
    }

    override fun getItemCount(): Int = serials.size
    class ViewHolder(override val containerView: View):RecyclerView.ViewHolder(containerView), LayoutContainer
}