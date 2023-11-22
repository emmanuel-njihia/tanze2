package com.tanze.app.modules.landingpagemain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.landingpagemain.`data`.model.LandingPageMainModel
import org.koin.core.KoinComponent

class LandingPageMainVM : ViewModel(), KoinComponent {
  val landingPageMainModel: MutableLiveData<LandingPageMainModel> =
      MutableLiveData(LandingPageMainModel())

  var navArguments: Bundle? = null
}
