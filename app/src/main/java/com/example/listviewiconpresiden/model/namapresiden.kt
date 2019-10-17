package com.example.listviewiconpresiden.model

import com.example.listviewiconpresiden.R

object namapresiden {

    private val presidenName = arrayOf(
        "soekaro",
        "suharto",
        "bj habibie",
        "abdulrahman wahid",
        "megaawati",
        "susilo bambang yudoyono",
        "jokowi"
    )

    private val detail = arrayOf(
        "Presiden ke-1",
        "Presiden ke-2",
        "Presiden ke-3",
        "Presiden ke-4",
        "Presiden ke-5",
        "Presiden ke-6",
        "Presiden ke-7"
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.suharto,
        R.drawable.bj,
        R.drawable.abdul,
        R.drawable.mega,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listPresiden: ArrayList<presiden>
        get() {
            val list = arrayListOf<presiden>()
            for (position in presidenName.indices) {
                val presiden = presiden()
                presiden.name = presidenName[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
}}