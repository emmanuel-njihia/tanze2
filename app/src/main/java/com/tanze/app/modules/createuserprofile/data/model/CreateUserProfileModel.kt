package com.tanze.app.modules.createuserprofile.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class CreateUserProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeginnerBadge: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_beginner_badge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourNameHere: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_name_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentPoints: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_current_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0FriendsInvit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_0_friends_invit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddFriends: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_friends)

)
