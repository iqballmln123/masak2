package com.iqballmln0143.masak2.ui.screen.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iqballmln0143.gabung.util.SharedUtil

class AppViewModel : ViewModel () {
    val userFlow = SharedUtil.getUserFlow(viewModelScope)
}