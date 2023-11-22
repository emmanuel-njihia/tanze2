package com.tanze.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityHomepageBinding
import com.tanze.app.modules.homepage.`data`.viewmodel.HomepageVM
import com.tanze.app.modules.landingpagemain.ui.LandingPageMainActivity
import com.tanze.app.modules.selectlanguage.ui.SelectLanguageActivity
import kotlin.String
import kotlin.Unit

class HomepageActivity : BaseActivity<ActivityHomepageBinding>(R.layout.activity_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LandingPageMainActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnJoinIn.setOnClickListener {
        val destIntent = SelectLanguageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "HOMEPAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomepageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
