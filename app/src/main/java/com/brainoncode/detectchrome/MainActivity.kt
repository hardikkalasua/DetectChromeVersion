package com.brainoncode.detectchrome

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val versionTextView:TextView = findViewById(R.id.version_text)

        val version = try{
            val packageInfo = applicationContext.packageManager
                    .getPackageInfo("com.android.chrome", 0)
            packageInfo.versionName
        }catch (e: PackageManager.NameNotFoundException){
            "Chrome Not Installed"
        }

        versionTextView.text = version
    }

}