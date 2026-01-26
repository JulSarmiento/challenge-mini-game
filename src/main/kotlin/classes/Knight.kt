package org.example.classes

/**
 * Clase Knight que hereda de la clase Warrior.
 * Representa a un caballero con atributos específicos.
 * @constructor Crea una instancia de Knight con valores predeterminados para job y strength.
 * @usage Se utiliza para representar a un caballero en el juego.
 */
class Knight: Warrior() {

    init {
        job = "Knight"
        strength = 7
    }

    /**
     * Método que presenta al caballero.
     * @return Una cadena que describe el trabajo y la fuerza del caballero.
     */
    override fun presentation(): String {
        return "Este es un $job y su fuerza es $strength"
    }
}