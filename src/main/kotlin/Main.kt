package org.example

import org.example.classes.Job
import org.example.classes.Knight
import org.example.classes.Warrior
import org.example.objects.UI

/**
 * Funcion principal del programa que simula una pelea entre un guerrero y un caballero.
 * Crea instancias de Warrior y Knight, las presenta y luego inicia una pelea entre ellas.
 */
fun main() {
    val warrior = Warrior()
    val knight = Knight()
    val fighters = listOf(warrior, knight).shuffled()

    println(warrior.presentation())
    println(knight.presentation())

    fight(fighters, warrior, knight)
}

/**
 * Simula una pelea entre dos luchadores hasta que uno de ellos pierde toda su salud.
 * @param fighters Lista de luchadores que participarán en la pelea.
 * @param warrior Instancia del guerrero.
 * @param knight Instancia del caballero.
 */
fun fight(fighters: List<Job>, warrior: Job, knight: Job) {
    var attacker = fighters[0]
    var defender = fighters[1]
    var counter = 1
    val maxHp = 50

    UI.title("Comienza la pelea!")
    UI.action("${attacker.job} ataca primero a ${defender.job}")

    while (knight.health > 0 && warrior.health > 0){
        UI.round(counter++)
        UI.action(attacker.attack(defender))
        UI.damage(defender.updateHealth())
        UI.bar(warrior.job, warrior.health, maxHp)
        UI.bar(knight.job, knight.health, maxHp)

        attacker = defender.also { defender = attacker }
        UI.pause()
    }

    UI.title("FIN DEL COMBATE")
    UI.status("${attacker.job} gana")
}

