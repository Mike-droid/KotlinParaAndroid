package com.platzi.conf.view.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.platzi.conf.R
import com.platzi.conf.model.Speaker

class SpeakerAdapter(val speakerListener: SpeakerListener): RecyclerView.Adapter<SpeakerAdapter.ViewHolder>() {

    private var listSpeakers = ArrayList<Speaker>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_speaker,parent,false))

    override fun onBindViewHolder(holder: SpeakerAdapter.ViewHolder, position: Int) {
        val speaker = listSpeakers[position] //as Speaker

        holder.tvSpeakerName.text = speaker.name
        holder.speakerWork.text = speaker.workPlace

        Glide.with(holder.itemView.context) //Contexto
            .load(speaker.image) //Donde está la URL de la imagen
            .apply(RequestOptions.circleCropTransform()) //Hacer imagen circular
            .into(holder.speakerImage) //Donde la vamos a colocar

        holder.itemView.setOnClickListener {
            speakerListener.onSpeakerClicked(speaker,position)
        }

    }

    fun updateData(data:List<Speaker>){
        listSpeakers.clear()
        listSpeakers.addAll(data)
        notifyDataSetChanged()
    }

    override fun getItemCount() = listSpeakers.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvSpeakerName = itemView.findViewById<TextView>(R.id.tvSpeakerName)
        val speakerWork = itemView.findViewById<TextView>(R.id.tvSpeakerJob)
        val speakerImage = itemView.findViewById<ImageView>(R.id.speakerImage)
    }
}