package com.tanze.app.modules.quizleveloneone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.quizleveloneone.`data`.model.GridlockThreeRowModel
import com.tanze.app.modules.quizleveloneone.`data`.model.QuizLevelOneOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class QuizLevelOneOneVM : ViewModel(), KoinComponent {
  val quizLevelOneOneModel: MutableLiveData<QuizLevelOneOneModel> =
      MutableLiveData(QuizLevelOneOneModel())

  var navArguments: Bundle? = null

  val gridlockThreeList: MutableLiveData<MutableList<GridlockThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
