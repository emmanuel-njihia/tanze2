package com.tanze.app.modules.billoninitiativeactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.billoninitiativeactivity.`data`.model.BillonInitiativeModelModel
import org.koin.core.KoinComponent

class BillonInitiativeVMVM : ViewModel(), KoinComponent {
  val billonInitiativeModelModel: MutableLiveData<BillonInitiativeModelModel> =
      MutableLiveData(BillonInitiativeModelModel())

  var navArguments: Bundle? = null
}
