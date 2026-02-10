package org.example.classes


/**
 * Clase Army que representa un ejército compuesto por una lista de trabajos (Warriors y Knights).
 * @param name Nombre del ejército.
 * @param size Tamaño del ejército, que determina cuántos trabajos tendrá.
 * @param army Lista mutable de trabajos que conforman el ejército
 * @constructor Crea una instancia de Army con un nombre, tamaño y una lista de trabajos generada automáticamente.
 * @usage Se utiliza para representar un ejército en el juego, permitiendo simular peleas entre diferentes ejércitos.
 */
class Army(
    val name: String,
    val size: Int = 10,
    var army: MutableList<Job> = mutableListOf()
) {

    init {
        require(size > 0) { "El tamaño del ejército debe ser mayor que cero." }

        val warriors = List((1 until size).random()) { Warrior() }
        val knights = List((size - warriors.size)) { Knight() }
        army = (warriors + knights).toMutableList()
    }

    val isAlive: Boolean
        get() = this.army.any { it.isAlive }

    val totalHp : Int
        get() = this.army.sumOf { it.health }

}