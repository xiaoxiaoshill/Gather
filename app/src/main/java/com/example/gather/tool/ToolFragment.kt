package com.example.gather.tool

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.gather.MainActivity
import com.example.gather.R
import com.example.gather.tool.yuanshen.YuanShenActivity

class ToolFragment : Fragment() {

    companion object {
        fun newInstance() = ToolFragment()
    }

    private lateinit var viewModel: ToolViewModel
    private lateinit var yuanshen:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.tool_fragment, container, false)
        yuanshen = view.findViewById(R.id.yuanshen)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ToolViewModel::class.java)
        val activity = activity as MainActivity
        yuanshen.setOnClickListener {
            val intent = Intent(activity,YuanShenActivity::class.java)
            startActivity(intent)
        }
    }

}