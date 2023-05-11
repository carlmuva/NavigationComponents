package com.example.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponents.databinding.FragmentPrimerBinding


class PrimerFragment : Fragment() {

    private lateinit var mBinding: FragmentPrimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentPrimerBinding.inflate(inflater, container,false)
        // Inflate the layout for this fragment
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.btnIrFragment2.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment,
                bundleOf("nombre" to "Carlos", "edad" to 29)
            )
        }

    }





}