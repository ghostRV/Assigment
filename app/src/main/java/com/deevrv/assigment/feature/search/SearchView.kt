package com.deevrv.assigment.feature.search

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEnd
import moxy.viewstate.strategy.alias.Skip


interface SearchView : MvpView {

    @Skip
    fun showRatingFromError()
    @Skip
    fun showRatingToError()
    @Skip
    fun showYearFromError()
    @Skip
    fun showYearToError()
}