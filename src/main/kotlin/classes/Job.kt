package org.example.classes

/**
 * Clase abstracta que define el objeto Job (trabajo) con propiedades y métodos comunes para diferentes tipos de trabajos.
 * @param job Nombre del trabajo.
 * @param health Salud del personaje.
 * @param strength Fuerza del personaje.
 * @usage Se utiliza como clase base para crear diferentes tipos de trabajos como Warrior y Knight.
 */
abstract class Job(
    var job: String,
    var health: Int,
    var strength: Int,
) {

    val isAlive: Boolean
        get() = health > 0

    override fun toString(): String {
        return "Job(job='$job', health=$health, strength=$strength)"
    }

    /**
     * Método que permite atacar a otro Job, reduciendo su salud en función de la fuerza del atacante.
     * @param opponent El Job que será atacado.
     * @return Una cadena que describe el ataque realizado.
     */
    fun attack(opponent: Job): String {
        opponent.health = (opponent.health - this.strength).coerceAtLeast(0)
        return "${this.job}, ataco a ${opponent.job}"
    }

    /**
     * Método que actualiza y devuelve el estado de salud del Job.
     * @return Una cadena que describe la salud actual o si el Job ha muerto.
     */
    fun updateHealth(): String {
        return if(isAlive) "Vida actual de ${this.job} es ${this.health}" else "${this.job}, haz muerto"
    }
}