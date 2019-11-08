package com.example.greenie.ui.recycle_center_locations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.greenie.R

class RecycleCenterLocationsFragment : Fragment() {

    private lateinit var recycleCenterLocationsViewModel: RecycleCenterLocationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recycleCenterLocationsViewModel =
            ViewModelProviders.of(this).get(RecycleCenterLocationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_recycle_center_locations, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        recycleCenterLocationsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}