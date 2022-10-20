package com.example.midtermexam

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.auf.midexam.PREFERENCE
import com.auf.midexam.R
import com.auf.midexam.USERNAME
import com.auf.midexam.databinding.ActivityMainBinding.inflate
import com.auf.midexam.databinding.Fragment2textBinding
import com.auf.midexam.databinding.FragmentTextBinding


class TextFragment : Fragment() {

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: FragmentTextBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        sharedPreferences = requireActivity().getSharedPreferences(PREFERENCE, Context.MODE_PRIVATE)
        binding = FragmentTextBinding.inflate(layoutInflater)
        val view = binding.root
        val username = sharedPreferences.getString(USERNAME,"")
        binding.textView.text = "USERNAME: "+username
        return view

    }
}
