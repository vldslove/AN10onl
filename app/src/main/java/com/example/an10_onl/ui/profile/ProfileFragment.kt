package com.example.an10_onl.ui.profile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.an10_onl.R
import com.example.an10_onl.ui.login.LoginFragment
import com.example.an10_onl.databinding.FragmentProfileBinding
import com.example.an10_onl.repositories.NoteRepository

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private var note = " note"
    private val viewModel: ProfileViewModel by viewModels()
    private val repository = NoteRepository()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n", "ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.deleteProfile.setOnClickListener {

        }
        binding.profileName.text = viewModel.getUser()
        binding.notesCount.text = viewModel.getSize().toString() + note

        binding.deleteNotes.setOnClickListener {
            viewModel.deleteNotes()
            binding.notesCount.text = ProfileViewModel.none

        }
        binding.profileLogout.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment())
                .commit()

        }
    }

}