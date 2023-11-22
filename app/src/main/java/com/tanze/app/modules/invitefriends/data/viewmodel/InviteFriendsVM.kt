package com.tanze.app.modules.invitefriends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.invitefriends.`data`.model.InviteFriendsModel
import org.koin.core.KoinComponent

class InviteFriendsVM : ViewModel(), KoinComponent {
  val inviteFriendsModel: MutableLiveData<InviteFriendsModel> =
      MutableLiveData(InviteFriendsModel())

  var navArguments: Bundle? = null
}
