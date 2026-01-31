package org.example.classes



class Army (
    val warrios: List<Warrior>,
    val knights: List<Knight>
){

    val randomSizeNum = (1..10).random()

    fun randomList(randomSizeNum: Int): List<Job> {
        val warriors = List(randomSizeNum) { Warrior() }
        val knights = List(randomSizeNum) { Knight() }
        return warriors + knights
    }

    fun createArmy (): List<Job> {
        return warrios + knights
    }

}