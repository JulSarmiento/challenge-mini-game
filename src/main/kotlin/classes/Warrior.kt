package org.example.classes

/**
 * Clase Warrior que hereda de la clase Job.
 * Representa a un guerrero con atributos específicos.
 * @constructor Crea una instancia de Warrior con valores predeterminados para job, health y strength.
 * @usage Se utiliza para representar a un guerrero en el juego.
 */
open class Warrior: Job(
    "Warrior",
    50,
    5,
)