package com.example.iteradmin.getphoneinfo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)
        val tpm:TelephonyManager = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager

        var s:String = "Device network = "+tpm.networkCountryIso.toString()+" phone type = "+tpm.phoneType.toString()

        text.setText(s.toString())


    }
}
