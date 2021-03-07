package com.kia.a11

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.frafment_login.*
import kotlinx.android.synthetic.main.fragment_home.*

class LoginFragment: Fragment(R.layout.frafment_login) {

    private val args:LoginFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var usernameDeepLink = args.username
        edit_text_username.setText(usernameDeepLink)

        button_confirm.setOnClickListener {
            val username = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()
            val action= LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
    }

}


