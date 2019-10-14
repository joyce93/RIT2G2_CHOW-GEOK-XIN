package com.example.myexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okButton.setOnClickListener (){
            var name = inputName.text
            //messageView.text = "$name,how r u"

            //pop up mesg
            Toast.makeText(this, "$name,how r u",
                Toast.LENGTH_LONG).show()
        }
    }
}
