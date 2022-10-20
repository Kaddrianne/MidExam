package com.auf.midexam

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.SharedMemory
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.auf.midexam.databinding.Fragment2textBinding
import java.util.prefs.AbstractPreferences


class fragment_2text : Fragment(), View.OnClickListener {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var binding: Fragment2textBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sharedPreferences = requireActivity().getSharedPreferences(PREFERENCE,Context.MODE_PRIVATE)
        binding = Fragment2textBinding.inflate(layoutInflater)
        val view = binding.root
        binding.button.setOnClickListener(this)
        return view
    }

    override fun onClick(p0: View?) {
        val edit = sharedPreferences.edit()
        when(p0!!.id){
            (R.id.button)->{
                if(binding.editTextTextPersonName.text.toString() == ""){
                    binding.editTextTextPersonName.error = "Required!"
                }
                else if(binding.editTextTextPersonName.text.length <6){
                    binding.editTextTextPersonName.error = "SHOULD BE MORE THAN 6 CHARS"
                }
                else{
                    edit.putString(USERNAME,binding.editTextTextPersonName.text.toString())
                    edit.apply()
                }
            }
        }
    }


}