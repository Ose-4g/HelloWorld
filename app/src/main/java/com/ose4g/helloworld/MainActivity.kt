package com.ose4g.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Viewmodel to hold data
        var viewModel:MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        //increment the value on click
        findViewById<FloatingActionButton>(R.id.increment_button)
            .setOnClickListener {
                viewModel.increment()
            }

        //make the textview observe the live data
        viewModel.number.observe(this, Observer {
            findViewById<TextView>(R.id.textView).text = it.toString()
        })
    }
}