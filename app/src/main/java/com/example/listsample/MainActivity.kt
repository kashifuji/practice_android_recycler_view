package com.example.listsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listsample.adapters.MyAdapter

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myDataset =  Array(20, { i -> (i * i).toString() })
    private val myDataset2 =  Array(20, { i -> (i + i).toString() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_recyclerview.setHasFixedSize(true)
        my_recyclerview.layoutManager = LinearLayoutManager(this)
        my_recyclerview.adapter = MyAdapter(myDataset, myDataset2)

    }
}
