package com.example.abdygulov_hw_06

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.abdygulov_hw_06.databinding.ItemPhoneBinding

class PhoneAdapter(private val dataList: List<Phone>) :
    RecyclerView.Adapter<PhoneAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPhoneBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    class ViewHolder(private val binding: ItemPhoneBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(phone: Phone) {
            binding.imgPhone.loadImage(phone.image)
            binding.tvPhone.text = phone.name

        }
    }
}
