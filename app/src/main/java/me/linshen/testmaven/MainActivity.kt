package me.linshen.testmaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.linshen.testmaven.library.MySDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MySDK.init()
    }
}