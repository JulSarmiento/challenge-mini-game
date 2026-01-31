package org.example.objects

/**
 * Objeto UI que proporciona funciones para mostrar mensajes formateados en la consola.
 * Incluye métodos para mostrar títulos, rondas, acciones, daños, estados y barras de salud.
 * @usage Se utiliza para mejorar la experiencia visual en la consola durante la simulación de peleas.
 */
object UI {

    /**
     * Función para mostrar un título formateado.
     * @param t El texto del título a mostrar.
     * @usage Se utiliza para destacar secciones importantes en la consola.
     */
    fun title(t: String) {
        println("${Colors.BOLD}${Colors.BLUE}\n=== $t ===${Colors.RESET}")
    }

    /**
     * Función para mostrar el número de ronda.
     * @param n El número de la ronda.
     * @usage Se utiliza para indicar el inicio de una nueva ronda en la simulación.
     */
    fun round(n: Int) {
        println("${Colors.YELLOW}\nRONDA $n${Colors.RESET}")
    }

    /**
     * Función para mostrar una acción formateada.
     * @param t El texto de la acción a mostrar.
     * @usage Se utiliza para describir las acciones realizadas durante la simulación.
     */
    fun action(t: String) {
        println("${Colors.CYAN}$t${Colors.RESET}")
    }

    /**
     * Función para mostrar un mensaje de daño formateado.
     * @param t El texto del daño a mostrar.
     * @usage Se utiliza para resaltar los daños sufridos durante la simulación.
     */
    fun damage(t: String) {
        println("${Colors.RED}$t${Colors.RESET}")
    }

    /**
     * Función para mostrar un estado formateado.
     * @param t El texto del estado a mostrar.
     * @usage Se utiliza para indicar estados importantes durante la simulación.
     */
    fun status(t: String) {
        println("${Colors.GREEN}$t${Colors.RESET}")
    }

    /**
     * Función para mostrar una barra de salud.
     * @param name El nombre del personaje.
     * @param hp La salud actual del personaje.
     * @param max La salud máxima del personaje.
     * @usage Se utiliza para visualizar la salud del personaje de manera gráfica en la consola.
     */
    fun bar(name: String, hp: Int, max: Int) {
        val size = 50
        val filled = (hp * size) / max
        val bar = "|".repeat(filled) + " ".repeat(size - filled)
        println("${Colors.BLUE}$name HP [$bar] $hp/$max${Colors.RESET}")
    }

    /**
     * Función para pausar la ejecución durante un tiempo determinado.
     * @param ms El tiempo en milisegundos para pausar la ejecución (por defecto 500 ms).
     * @usage Se utiliza para crear pausas entre acciones en la simulación.
     */
    fun pause(ms: Long = 500) {
        Thread.sleep(ms)
    }
}