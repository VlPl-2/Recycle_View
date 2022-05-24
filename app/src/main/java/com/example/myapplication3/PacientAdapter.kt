package com.example.myapplication3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication3.databinding.PacientItemBinding

class PacientAdapter: RecyclerView.Adapter<PacientAdapter.PacientHolder>() {
    val pacList = ArrayList<Pacient>();

    class PacientHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = PacientItemBinding.bind(item)
        fun bind(pacient: Pacient) = with(binding){
            FIO.text = pacient.FIO;
            CityV.text = pacient.City;
            BirdthV.text = pacient.Birth.toString();
            DiagnosisV.text = pacient.Diagnosis;
            GenderV.text = pacient.Gender;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PacientHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pacient_item, parent, false)
        return PacientHolder(view);
    }

    override fun onBindViewHolder(holder: PacientHolder, position: Int) {
        holder.bind(pacList[position]);
    }

    override fun getItemCount(): Int {
        return pacList.size;
    }

    fun addPac(pacient: Pacient){
        pacList.add(pacient);
        notifyDataSetChanged();
    }

}