package com.initishbhatt.kotilnjnisample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var nativeStore: NativeStore
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nativeStore = NativeStore()

        // Example of a call to a native method
        sample_text.text = nativeStore.stringFromJNI()
    }

}
