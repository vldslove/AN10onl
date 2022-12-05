package com.example.an10_onl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MakeMoneyActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_makemoney, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.skip3).setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, ChatAndDevelopFragment())
                .commit()
        }
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_makemoney)
//        val skip2 = findViewById<TextView>(R.id.skip3)
//        skip2.setOnClickListener() {
//            val intent = Intent(this, ChatAndDevelopFragment::class.java)
//            startActivity(intent)
//        }
////        Handler().postDelayed({
////            val intent = Intent(this, FourthPage::class.java)
////            startActivity(intent)
////        }, 2000)
//    }
}