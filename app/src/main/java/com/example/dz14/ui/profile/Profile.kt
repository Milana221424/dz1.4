package com.example.dz14.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz14.R
import com.example.dz14.databinding.FragmentProfileBinding

class Profile : Fragment() {
private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding=FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

}