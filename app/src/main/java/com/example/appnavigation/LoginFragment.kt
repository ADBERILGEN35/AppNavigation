package com.example.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.appnavigation.databinding.FragmentLoginBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class LoginFragment : Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //fragmentLoginBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLoginBinding.apply {
            /* button.setOnClickListener {
                 findNavController().navigate(R.id.action_loginFragment_to_forgetPasswordFragment)*/
        }

    }
}


