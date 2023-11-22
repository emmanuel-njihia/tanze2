package com.tanze.app.modules.activities.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.activities.`data`.model.ActivitiesModel
import org.koin.core.KoinComponent

class ActivitiesVM : ViewModel(), KoinComponent {
  val activitiesModel: MutableLiveData<ActivitiesModel> = MutableLiveData(ActivitiesModel())

  var navArguments: Bundle? = null
}
