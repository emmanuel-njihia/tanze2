package com.tanze.app.modules.invitefriends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityInviteFriendsBinding
import com.tanze.app.modules.invitefriends.`data`.viewmodel.InviteFriendsVM
import com.tanze.app.modules.leaderboard.ui.LeaderboardActivity
import kotlin.String
import kotlin.Unit

class InviteFriendsActivity :
    BaseActivity<ActivityInviteFriendsBinding>(R.layout.activity_invite_friends) {
  private val viewModel: InviteFriendsVM by viewModels<InviteFriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.inviteFriendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroupThirtyOne.setOnClickListener {
      val destIntent = LeaderboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INVITE_FRIENDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InviteFriendsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
