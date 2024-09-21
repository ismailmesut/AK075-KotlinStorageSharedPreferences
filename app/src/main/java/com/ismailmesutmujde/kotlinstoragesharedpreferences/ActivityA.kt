package com.ismailmesutmujde.kotlinstoragesharedpreferences

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinstoragesharedpreferences.databinding.ActivityABinding


class ActivityA : AppCompatActivity() {

    private lateinit var bindingA : ActivityABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingA = ActivityABinding.inflate(layoutInflater)
        val view = bindingA.root
        setContentView(view)

        val sharedPreferences = getSharedPreferences("PersonalInfo", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        // deleting
        editor.remove("name")
        editor.commit()

        /*
        editor.putString("name", "Ahmet")
        editor.putInt("age", 18)
        editor.putFloat("height", 1.78f)
        editor.putBoolean("areYouSingle", true)

        val friendList = HashSet<String>()
        friendList.add("Zeynep")
        friendList.add("Ece")
        friendList.add("Ali")

        editor.putStringSet("friendList", friendList)

        editor.commit()
         */

        bindingA.buttonGoToB.setOnClickListener {
            val intentAToB = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(intentAToB)
        }

    }
}