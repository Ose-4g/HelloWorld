package com.ose4g.helloworld

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel()
{
    private var _number = MutableLiveData<Int>(0)
    val number:LiveData<Int>
            get() = _number

    fun increment()
    {
        _number.value = _number.value!! +1
    }
}