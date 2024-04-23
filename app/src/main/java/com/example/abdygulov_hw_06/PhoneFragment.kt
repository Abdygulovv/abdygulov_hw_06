package com.example.abdygulov_hw_06

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.abdygulov_hw_06.databinding.FragmentPhoneBinding

class PhoneFragment : Fragment() {

    private lateinit var binding: FragmentPhoneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPhoneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PhoneAdapter(
            arrayListOf(
                Phone(
                    "https://w7.pngwing.com/pngs/784/361/png-transparent-samsung-galaxy-s9-samsung-galaxy-s8-2018-mobile-world-congress-huawei-p20-samsung-thumbnail.png",
                    "Samsung"
                ),
                Phone(
                    "https://png.pngtree.com/png-clipart/20230825/original/pngtree-redmi-10c-internet-user-interface-picture-image_8672186.png",
                    "Redmi"
                ),
                Phone(
                    "https://w7.pngwing.com/pngs/770/457/png-transparent-iphone-8-plus-iphone-x-apple-4g-telephone-iphone8-gadget-mobile-phone-mobile-phones-thumbnail.png",
                    "Iphone 8"
                ),
                Phone(
                    "https://png.klev.club/uploads/posts/2024-04/png-klev-club-piym-p-aifon-11-png-10.png",
                    "Iphone 11pro"
                ),
                Phone(
                    "https://e7.pngegg.com/pngimages/828/1022/png-clipart-samsung-galaxy-note-5-telephone-android-smartphone-pink-series-purple-gadget.png",
                    "Samsung S5"
                )
            )
        )
        binding.rvPhone.adapter = adapter
    }
}