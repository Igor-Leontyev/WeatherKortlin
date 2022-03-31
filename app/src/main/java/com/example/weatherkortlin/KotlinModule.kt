package com.example.weatherkortlin

import com.example.weatherkortlin.ui.main.MainViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


val appModule = module {
    //ViewModel
    viewModel{MainViewModel}
}
