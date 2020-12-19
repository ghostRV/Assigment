package com.deevrv.assigment.feature.search

import moxy.MvpPresenter
import java.lang.Exception

class SearchPresenter : MvpPresenter<SearchView>() {

    var selectedType = TYPE.ALL

    fun setType(selectedType: TYPE) {
        this.selectedType = selectedType

    }

    fun validate(ratingFrom: String, ratingTo: String, yearFrom: String, yearTo: String) {
        when {
            !ratingIsCorrect(ratingFrom) -> viewState.showRatingFromError()
            !ratingIsCorrect(ratingTo) -> viewState.showRatingToError()
            !yearIsCorrect(yearFrom) -> viewState.showYearFromError()
            !yearIsCorrect(yearTo) -> viewState.showYearToError()
        }

    }

    private fun ratingIsCorrect(ratingText: String): Boolean {
        if (ratingText.isEmpty()) return false
        return try {
            val rating = ratingText.toInt()
            rating in 5..10
        } catch (e: Exception) {
            false
        }
    }

    private fun yearIsCorrect(yearText: String): Boolean {
        if (yearText.isEmpty()) return false
        return try {
            val year = yearText.toInt()
            year in 2010..2020
        } catch (e: Exception) {
            false
        }

    }
}