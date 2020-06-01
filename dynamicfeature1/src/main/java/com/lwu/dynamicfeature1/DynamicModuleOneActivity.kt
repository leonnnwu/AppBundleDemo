package com.lwu.dynamicfeature1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lwu.dynamicfeature1.ui.main.DynamicModuleOneFragment

class DynamicModuleOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dynamic_module_one_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DynamicModuleOneFragment.newInstance())
                .commitNow()
        }
    }
}