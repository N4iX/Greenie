package com.example.greenie.ui.news_and_events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.greenie.R

class NewsAndEventsFragment : Fragment() {

    private lateinit var newsAndEventsViewModel: NewsAndEventsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newsAndEventsViewModel =
            ViewModelProviders.of(this).get(NewsAndEventsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_news_and_events, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        newsAndEventsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}