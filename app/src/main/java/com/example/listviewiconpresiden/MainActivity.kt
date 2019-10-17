package com.example.listviewiconpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewiconpresiden.model.namapresiden
import com.example.listviewiconpresiden.model.presiden

class MainActivity : AppCompatActivity() {
    private lateinit var rvpress: RecyclerView
    private var list: ArrayList<presiden> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvpress = findViewById(R.id.rv_presiden)
        rvpress.setHasFixedSize(true)
        list.addAll(namapresiden.listPresiden)
        showPresidenList()

    }

    private fun showPresidenList() {
        rvpress.layoutManager = LinearLayoutManager(this)
        val listPresidenAdapter = ListPresidenAdapter(list)
        rvpress.adapter = listPresidenAdapter

    }
}
