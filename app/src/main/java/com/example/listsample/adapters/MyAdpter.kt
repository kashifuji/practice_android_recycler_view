package com.example.listsample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil.bind
import androidx.recyclerview.widget.RecyclerView
import com.example.listsample.R

import kotlinx.android.synthetic.main.activity_main.*




class MyAdapter(private val myDataset: Array<String>, private val myDataset2: Array<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView1 = view.findViewById<TextView>(R.id.itemTextView1)
        val textView2 = view.findViewById<TextView>(R.id.itemTextView2)
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {

        val myView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false)

        return MyViewHolder(myView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.let {
            it.textView1.text = myDataset[position]
            it.textView2.text = myDataset2[position]
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}