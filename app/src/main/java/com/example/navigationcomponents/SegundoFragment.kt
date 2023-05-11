package com.example.navigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponents.databinding.FragmentPrimerBinding
import com.example.navigationcomponents.databinding.FragmentSegundoBinding


class SegundoFragment : Fragment() {

    private lateinit var mBinding: FragmentSegundoBinding
    private var  nombre: String? = ""
    private var  edad : Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{bundle ->
            nombre = bundle.getString(MI_NOMBRE)
            edad = bundle.getInt(MI_EDAD)

        }
    }
    companion object{
        private const val  MI_NOMBRE = "nombre"
        private  const val  MI_EDAD = "edad"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSegundoBinding.inflate(inflater, container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = mBinding.tvSegudoFragment

        mBinding.btnRegresarFragment1.setOnClickListener {
            findNavController().navigate(R.id.primerFragment)
        }
        text.text = "$nombre $edad"
    }

}