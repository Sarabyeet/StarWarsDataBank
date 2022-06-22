package com.sarabyeet.limitless.ui

import androidx.fragment.app.Fragment
import com.sarabyeet.limitless.ui.MainActivity

abstract class BaseMainActivityFragment(private val layoutId: Int): Fragment(layoutId) {

    val mainActivity: MainActivity by lazy { activity as MainActivity }
}