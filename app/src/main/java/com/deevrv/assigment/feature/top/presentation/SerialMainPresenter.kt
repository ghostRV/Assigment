package com.deevrv.assigment.feature.top.presentation

import com.deevrv.assigment.Serial
import moxy.MvpPresenter
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

class SerialMainPresenter : MvpPresenter<SerialMainView>() {
    private val serials = mutableListOf(
        Serial("Пацаны", "2019"),
        Serial("Видоизменённый углерод", "2018"),
        Serial("Убивая Еву", "2018"),
        Serial("Тьма", "2017"),
        Serial("Ход королевы", "2020"),
        Serial("Рик и Морти", "2014")
    )

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showSerial(serials)
    }
    fun onSerialClick(serial:Serial){
//        serials.remove(serial)
        //viewState.deleteItem(serial)
        viewState.openDetailScreen(serial)
    }

}

interface SerialMainView:MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showSerial (serial: List<Serial>)

    @StateStrategyType (OneExecutionStateStrategy::class)
    fun openDetailScreen(serial: Serial)

//    @StateStrategyType (AddToEndStrategy::class)
//    fun deleteItem(serial: Serial)
}
