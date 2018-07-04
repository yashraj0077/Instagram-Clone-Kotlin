package com.alexbezhan.instagram.screens

import android.os.Bundle
import android.util.Log
import com.alexbezhan.instagram.R
import com.alexbezhan.instagram.screens.common.BaseActivity
import com.alexbezhan.instagram.screens.common.setupAuthGuard
import com.alexbezhan.instagram.screens.common.setupBottomNavigation

class LikesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation(3)
        Log.d(TAG, "onCreate")
        setupAuthGuard {  }
    }

    companion object {
        const val TAG = "LikesActivity"
    }
}
