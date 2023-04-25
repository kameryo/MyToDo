package com.example.mytodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytodo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            androidContext(this@MainActivity)
            modules(appModule)
        }
        setContentView(R.layout.activity_main)
    }
}
