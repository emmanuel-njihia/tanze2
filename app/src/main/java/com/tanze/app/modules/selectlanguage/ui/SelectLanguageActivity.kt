package com.tanze.app.modules.selectlanguage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivitySelectLanguageBinding
import com.tanze.app.modules.countryselection.ui.CountrySelectionActivity
import com.tanze.app.modules.homepage.ui.HomepageActivity
import com.tanze.app.modules.selectlanguage.`data`.viewmodel.SelectLanguageVM
import kotlin.String
import kotlin.Unit

class SelectLanguageActivity :
    BaseActivity<ActivitySelectLanguageBinding>(R.layout.activity_select_language) {
  private val viewModel: SelectLanguageVM by viewModels<SelectLanguageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectLanguageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnJambo.setOnClickListener {
      val destIntent = CountrySelectionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHello.setOnClickListener {
      val destIntent = CountrySelectionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnProceed.setOnClickListener {
      val destIntent = CountrySelectionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackButton.setOnClickListener {
      val destIntent = HomepageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SELECT_LANGUAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectLanguageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
