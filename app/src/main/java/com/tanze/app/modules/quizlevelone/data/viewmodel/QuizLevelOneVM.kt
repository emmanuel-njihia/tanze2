package com.tanze.app.modules.quizlevelone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.quizlevelone.`data`.model.QuizLevelOneModel
import com.tanze.app.modules.quizlevelone.`data`.model.QuizLevelOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class QuizLevelOneVM : ViewModel(), KoinComponent {
  val quizLevelOneModel: MutableLiveData<QuizLevelOneModel> = MutableLiveData(QuizLevelOneModel())

  var navArguments: Bundle? = null

  val quizLevelOneList: MutableLiveData<MutableList<QuizLevelOneRowModel>> =
      MutableLiveData(mutableListOf())
}
