package com.example.fragmentstrial

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment(R.layout.fragment_first) {
    val Message1 = "Activity 1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Message1,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(Message1,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Message1,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Message1,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Message1,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Message1,"onDestroy")
    }








}
