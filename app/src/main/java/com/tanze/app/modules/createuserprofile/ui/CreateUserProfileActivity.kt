package com.tanze.app.modules.createuserprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityCreateUserProfileBinding
import com.tanze.app.modules.createuserprofile.`data`.viewmodel.CreateUserProfileVM
import com.tanze.app.modules.createuserprofileone.ui.CreateUserProfileOneActivity
import com.tanze.app.modules.invitefriends.ui.InviteFriendsActivity
import com.tanze.app.modules.leaderboard.ui.LeaderboardActivity
import kotlin.String
import kotlin.Unit

class CreateUserProfileActivity :
    BaseActivity<ActivityCreateUserProfileBinding>(R.layout.activity_create_user_profile) {
  private val viewModel: CreateUserProfileVM by viewModels<CreateUserProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createUserProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleSeventySeven.setOnClickListener {
      val destIntent = LeaderboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcurrentpoints.setOnClickListener {
      val destIntent = LeaderboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = CreateUserProfileOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowadd.setOnClickListener {
      val destIntent = InviteFriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_USER_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateUserProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
