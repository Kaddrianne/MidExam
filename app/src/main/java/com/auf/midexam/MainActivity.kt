package com.auf.midexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.auf.midexam.databinding.ActivityMainBinding
import com.auf.midexam.databinding.Fragment2textBinding
import com.example.midtermexam.TextFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment2text = fragment_2text();
        val fragmanager = supportFragmentManager;
        fragmanager.beginTransaction().replace(R.id.topfrag,fragment2text).commit()

        val textFragment = TextFragment();
        fragmanager.beginTransaction().replace(R.id.botfrag,textFragment).commit()
    }
}