package com.lwu.appbundledemo.ui.main

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lwu.appbundledemo.R
import com.lwu.appbundledemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var databinding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        databinding = DataBindingUtil.inflate(layoutInflater, R.layout.main_fragment, container, false)
        return databinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        databinding.button0.setOnClickListener {
            activity?.let {
                Intent().setClassName(it.packageName, "com.lwu.dynamicfeature1.DynamicModuleOneActivity")
                    .also {
                        startActivity(it)
                    }
            }
        }

        databinding.button1.setOnClickListener {
            activity?.let {
                Intent().setClassName(it.packageName, "com.lwu.dynamicfeature2.OnDemandActivity")
                    .also {
                        startActivity(it)
                    }
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}