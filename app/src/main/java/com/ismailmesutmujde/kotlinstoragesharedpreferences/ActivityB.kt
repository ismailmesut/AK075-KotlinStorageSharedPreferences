package com.ismailmesutmujde.kotlinstoragesharedpreferences

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinstoragesharedpreferences.databinding.ActivityBBinding


class ActivityB : AppCompatActivity() {

    private lateinit var bindingB : ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingB = ActivityBBinding.inflate(layoutInflater)
        val view = bindingB.root
        setContentView(view)

        val sharedPreferences = getSharedPreferences("PersonalInfo", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("name","no name")
        val age = sharedPreferences.getInt("age",0)
        val height = sharedPreferences.getFloat("height", 0.0f)
        val areYouSingle = sharedPreferences.getBoolean("areYouSingle", false)

        val friendList = sharedPreferences.getStringSet("friendList", null)

        Log.e("Name", name.toString())
        Log.e("Age", age.toString())
        Log.e("Height", height.toString())
        Log.e("AreYouSingle?", areYouSingle.toString())
        Log.e("FriendList", friendList.toString())

        if (friendList != null) {
            for (f in friendList) {
                Log.e("Friend", f)
            }
        }


    }
}