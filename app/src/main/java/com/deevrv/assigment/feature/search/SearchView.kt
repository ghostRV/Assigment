package com.deevrv.assigment.feature.search

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd


@AddToEnd
interface SearchView : MvpView {


    fun showRatingFromError()
    fun showRatingToError()
    fun showYearFromError()
    fun showYearToError()
}