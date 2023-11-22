package com.tanze.app.modules.billoninitiativeactivity.ui

import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityBillonInitiativeActivityBinding
import com.tanze.app.modules.billoninitiativeactivity.`data`.viewmodel.BillonInitiativeVMVM
import com.tanze.app.modules.leaderboard.ui.LeaderboardActivity
import kotlin.String
import kotlin.Unit

class BillonInitiativeActivityActivity :
    BaseActivity<ActivityBillonInitiativeActivityBinding>(R.layout.activity_billon_initiative_activity)
    {
  private val viewModel: BillonInitiativeVMVM by viewModels<BillonInitiativeVMVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billonInitiativeVMVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGroupThirtyNine.setOnClickListener {
      val destIntent = LeaderboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BILLON_INITIATIVE_ACTIVITY_ACTIVITY"

  }
}
