package com.example.an10_onl.ui.appInfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.an10_onl.R
import com.example.an10_onl.ui.login.LoginFragment
import com.example.an10_onl.databinding.FragmentFirststartBinding

class FirstStartFragment : Fragment() {
    private lateinit var binding: FragmentFirststartBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirststartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.discoverThePlatform.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, WorldProjectsFragment())
                .commit()
        }
        binding.login.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment())
                .commit()
        }
    }



//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_firststart)
//        val button = findViewById<Button>(R.id.discover_the_platform)
//        button.setOnClickListener() {
//            val intent = Intent(this, WorldProjectsFragment::class.java)
//            startActivity(intent)
//        }
//        val login = findViewById<TextView>(R.id.login)
//        login.setOnClickListener() {
//            val intent = Intent(this, LoginFragment::class.java)
//            startActivity(intent)
//
//        }
//
//    }
}