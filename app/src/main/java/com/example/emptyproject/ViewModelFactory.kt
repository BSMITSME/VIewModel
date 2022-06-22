package com.example.emptyproject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val counter : Int) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java)) //특정 Class가 어떤 클래스/인터페이스를 상속/구현했는지 체크
        return MyViewModel(counter) as T
        throw IllegalArgumentException("view model class not found")
    }
}