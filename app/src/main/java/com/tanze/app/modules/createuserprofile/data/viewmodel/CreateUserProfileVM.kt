package com.tanze.app.modules.createuserprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.createuserprofile.`data`.model.CreateUserProfileModel
import org.koin.core.KoinComponent

class CreateUserProfileVM : ViewModel(), KoinComponent {
  val createUserProfileModel: MutableLiveData<CreateUserProfileModel> =
      MutableLiveData(CreateUserProfileModel())

  var navArguments: Bundle? = null
}
