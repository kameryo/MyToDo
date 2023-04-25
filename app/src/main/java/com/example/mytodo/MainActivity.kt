package com.example.mytodo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        startKoin {
//            androidContext(this@MainActivity)
//            modules(appModule)
//        }
        setContentView(R.layout.activity_main)
    }
}
