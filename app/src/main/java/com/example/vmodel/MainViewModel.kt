package com.example.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var mContador = MutableLiveData<String>().apply { value = contador.toString() }

    private var contador: Int = 0

    private fun setmContador() {
        mContador.value = contador.toString()
    }
    private fun validateContador() {
        contador++
        if (contador > 50){
            contador = 0
        }
        setmContador()
    }
    fun Contador() {
        validateContador()
    }
}