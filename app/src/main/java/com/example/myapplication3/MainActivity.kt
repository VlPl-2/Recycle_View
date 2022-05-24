package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding;
    private val adapter = PacientAdapter();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        init()
    }

    val PList = listOf(
        Pacient("Романов Ярослав Матвеевич","Мужской", 1977u, "Москва", "Коронавирус"),
        Pacient("Нефедов Артемий Давидович","Мужской", 1956u, "Тамбов", "Грипп"),
        Pacient("Иванова Александра Андреевна","Женский", 1970u, "Москва", "Простуда"),
        Pacient("Митрофанова Анастасия Георгиевна","Женский", 1960u, "Симферополь", "Простуда"),
        Pacient("Ермолаева Злата Михайловна","Женский", 2000u, "Таганрог", "Коронавирус"),
        Pacient("Волков Глеб Львович","Мужской", 1950u, "Москва", "Коронавирус"),
        Pacient("Ильина Анастасия Платоновна","Женский", 1980u, "Пенза", "Грипп"),
        Pacient("Поликарпова Валерия Дмитриевна","Женский", 1994u, "Абакан", "Синдром ВПВ"),
        Pacient("Иванов Михаил Максимович","Мужской", 1949u, "Москва", "Грипп")
    )

    private fun init() = with(binding){
        rcView.layoutManager = LinearLayoutManager(this@MainActivity);
        rcView.adapter = adapter;
        for (item in PList){
            adapter.addPac(item);
        }

    }
}