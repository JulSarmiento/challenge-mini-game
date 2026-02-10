package org.example

import org.example.classes.Army
import org.example.classes.Job
import org.example.objects.UI

/**
 * Funcion principal del programa que simula una pelea entre un guerrero y un caballero.
 * Crea instancias de Warrior y Knight, las presenta y luego inicia una pelea entre ellas.
 */
fun main() {

    val army1 = Army(
        "Ejercito 1",
        size = 10
    )

    val army2 = Army(
        "Ejercito 2",
        size = 10
    )

    val listOfArmy = listOf(army1, army2).shuffled()

    fight(listOfArmy, army1, army2)
}


/**
 * Función que simula una pelea entre dos ejércitos, alternando ataques entre ellos hasta que uno de los ejércitos muere.
 * @param listOfArmy Lista de los dos ejércitos que participarán en la pelea, ordenados aleatoriamente para determinar quién ataca primero.
 * @param myArmyOne Primer ejército participante en la pelea.
 * @param myArmyTwo Segundo ejército participante en la pelea.
 * @usage Se llama desde la función main para iniciar la simulación de la pelea entre los dos ejércitos.
 */
fun fight(
    listOfArmy: List<Army>,
    myArmyOne: Army,
    myArmyTwo: Army
) {
    var attacker = listOfArmy[0]
    var defender = listOfArmy[1]

    var counter = 1
    val maxHpOne = myArmyOne.totalHp
    val maxHpTwo = myArmyTwo.totalHp

    UI.title("Comienza la pelea!")
    UI.action("${attacker.name} ataca primero a ${defender.name}")

    while (myArmyOne.isAlive && myArmyTwo.isAlive) {
        UI.round(counter++)

        val attackerJob = attacker.army.firstOrNull { it.isAlive }
        val defenderJob = defender.army.firstOrNull { it.isAlive }

        if (attackerJob != null && defenderJob != null) {
            UI.action(attackerJob.attack(defenderJob))
            UI.damage(defenderJob.updateHealth())
        }

        UI.bar(
            myArmyOne.name,
            hp = myArmyOne.totalHp,
            max = maxHpOne
        )

        UI.bar(
            myArmyTwo.name,
            hp = myArmyTwo.totalHp,
            max = maxHpTwo
        )

        attacker = defender.also { defender = attacker }
        UI.pause()
    }

    val winner = if (myArmyOne.isAlive) myArmyOne else myArmyTwo
    UI.title("FIN DEL COMBATE")
    UI.status("${winner.name} gana")
}

