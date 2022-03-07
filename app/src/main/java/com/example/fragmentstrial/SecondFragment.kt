package com.example.fragmentstrial

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment(R.layout.fragment_second) {
    val Message2 = "Activity 2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Message2,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Message2,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Message2,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Message2,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Message2,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Message2,"onDestroy")
    }












}