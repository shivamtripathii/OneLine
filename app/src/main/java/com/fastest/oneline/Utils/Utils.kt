package com.fastest.oneline.Utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import de.mateware.snacky.Snacky

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

fun snackbar(activity: Activity, text:String, type:Int){
    if(type == 0)
        Snacky.builder().setActivity(activity).setDuration(3000).setText(text).info().show()
    if(type == 1)
        Snacky.builder().setActivity(activity).setDuration(3000).setText(text).success().show()
    if(type == -1)
        Snacky.builder().setActivity(activity).setDuration(3000).setText(text).error().show()
}

var c = -1
var s = -1
class Check {
    companion object {
        fun getInfo():Int { return c }
        fun setInfo(value:Int) { c=value }
        fun getSearchInfo():Int { return s }
        fun setSearchInfo(value:Int) { s=value }
    }
}