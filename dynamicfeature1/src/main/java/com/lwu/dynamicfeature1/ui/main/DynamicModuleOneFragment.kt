package com.lwu.dynamicfeature1.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lwu.dynamicfeature1.R

class DynamicModuleOneFragment : Fragment() {

    companion object {
        fun newInstance() = DynamicModuleOneFragment()
    }

    private lateinit var viewModel: DynamicModuleOneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.dynamic_module_one__fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DynamicModuleOneViewModel::class.java)
        // TODO: Use the ViewModel
    }

}