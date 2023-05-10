package com.example.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponents.databinding.FragmentPrimerBinding
import com.example.navigationcomponents.databinding.FragmentSegundoBinding


class SegundoFragment : Fragment() {

    private lateinit var mBinding: FragmentSegundoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSegundoBinding.inflate(inflater, container,false)
        return mBinding.root
    }

}