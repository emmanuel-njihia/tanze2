package com.tanze.app.modules.quizlevelone.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class QuizLevelOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKnowTreesinK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_know_trees_in_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureat10Po: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_re_at_10_po)

)
