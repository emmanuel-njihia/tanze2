package com.tanze.app.modules.countryselection.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.countryselection.`data`.model.CountrySelectionModel
import org.koin.core.KoinComponent

class CountrySelectionVM : ViewModel(), KoinComponent {
  val countrySelectionModel: MutableLiveData<CountrySelectionModel> =
      MutableLiveData(CountrySelectionModel())

  var navArguments: Bundle? = null
}
