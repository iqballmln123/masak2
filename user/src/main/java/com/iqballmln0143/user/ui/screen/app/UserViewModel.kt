package com.iqballmln0143.user.ui.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iqballmln0143.gabung.util.SharedUtil

class UserViewModel : ViewModel () {
     val userFlow = SharedUtil.getUserFlow(viewModelScope)
}