package com.tanze.app.modules.countryselection.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityCountrySelectionBinding
import com.tanze.app.modules.countryselection.`data`.viewmodel.CountrySelectionVM
import com.tanze.app.modules.selectlanguage.ui.SelectLanguageActivity
import com.tanze.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class CountrySelectionActivity :
    BaseActivity<ActivityCountrySelectionBinding>(R.layout.activity_country_selection) {
  private val viewModel: CountrySelectionVM by viewModels<CountrySelectionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.countrySelectionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = SelectLanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearKenya.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COUNTRY_SELECTION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CountrySelectionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
