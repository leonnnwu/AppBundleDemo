package com.lwu.dynamicfeature2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lwu.dynamicfeature2.ui.main.OnDemandFragment

class OnDemandActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_demand_activity)
        title = "On-Demand Module"
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, OnDemandFragment.newInstance())
                .commitNow()
        }
    }
}