package com.deevrv.assigment

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val delfin = Animals("fish", "sea", 200)
    val tigr = Animals("antilopa", "savana", 100)
    val cow = Animals("trava", "pole", 600)

    val myAnimals = mutableListOf(delfin, tigr, cow)

    @Test
    fun start() {
        println(myAnimals)
        myAnimals.sort()
        println(myAnimals)
    }

    fun MutableList<Animals>.sort():
            MutableList<Animals> {
        sortBy { it.weit }
        return this
    }
}




