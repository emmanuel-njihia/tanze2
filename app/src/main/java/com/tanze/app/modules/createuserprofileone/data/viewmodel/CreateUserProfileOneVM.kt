package com.tanze.app.modules.createuserprofileone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.createuserprofileone.`data`.model.CreateUserProfileOneModel
import org.koin.core.KoinComponent

class CreateUserProfileOneVM : ViewModel(), KoinComponent {
  val createUserProfileOneModel: MutableLiveData<CreateUserProfileOneModel> =
      MutableLiveData(CreateUserProfileOneModel())

  var navArguments: Bundle? = null
}
