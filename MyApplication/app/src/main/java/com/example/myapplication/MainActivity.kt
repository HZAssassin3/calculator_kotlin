package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var sayi1 :Int? = null
    var sayi2 :Int? = null
    var sonuc : Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        }
    fun topla(v: View?){

        sayi1 = binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if (sayi1 == null){
            binding.sonuc.text = "Birinci Sayıyı Girmediniz"
        }else if (sayi2 == null){
            binding.sonuc.text = "İkinci Sayıyı Girmediniz"
        }else{
            sonuc = sayi1!! + sayi2!!
            binding.sonuc.text = "Sonuç: $sonuc "

        }
    }

    fun cıkart(v: View?){
        sayi1 = binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (sayi1==null){
            binding.sonuc.text="Birinci Sayıyı Girmediniz"
        }else if (sayi2==null){
            binding.sonuc.text="İkinci Sayıyı Girmediniz"
        }else{
            sonuc= sayi1!! - sayi2!!
            binding.sonuc.text="Sonuç: $sonuc"
        }
    }

    fun bol(view: View){
        sayi1 = binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (sayi1==null){
            binding.sonuc.text="Birinci Sayıyı Girmediniz"
        }else if (sayi2==null){
            binding.sonuc.text="İkinci Sayıyı Girmediniz"
        }else{
            sonuc= sayi1!! / sayi2!!
            binding.sonuc.text="Sonuç: $sonuc"
        }
    }

    fun carp(view: View){
        sayi1 = binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber2.text.toString().toIntOrNull()
        if (sayi1==null){
            binding.sonuc.text="Birinci Sayıyı Girmediniz"
        }else if (sayi2==null){
            binding.sonuc.text="İkinci Sayıyı Girmediniz"
        }else{
            sonuc= sayi1!! * sayi2!!
            binding.sonuc.text="Sonuç: $sonuc"
        }
    }

    }
