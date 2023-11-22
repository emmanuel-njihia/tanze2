package com.tanze.app.modules.createuserprofileone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityCreateUserProfileOneBinding
import com.tanze.app.modules.createuserprofile.ui.CreateUserProfileActivity
import com.tanze.app.modules.createuserprofileone.`data`.viewmodel.CreateUserProfileOneVM
import com.tanze.app.modules.quizlevelone.ui.QuizLevelOneActivity
import kotlin.String
import kotlin.Unit

class CreateUserProfileOneActivity :
    BaseActivity<ActivityCreateUserProfileOneBinding>(R.layout.activity_create_user_profile_one) {
  private val viewModel: CreateUserProfileOneVM by viewModels<CreateUserProfileOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createUserProfileOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = CreateUserProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = QuizLevelOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CREATE_USER_PROFILE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateUserProfileOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
