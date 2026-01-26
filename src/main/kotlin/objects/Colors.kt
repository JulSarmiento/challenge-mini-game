package org.example.objects

/**
 * Objeto Colors que define constantes para códigos de colores ANSI utilizados en la consola.
 * @usage Se utiliza para dar formato y color a la salida de texto en la consola.
 */
object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val CYAN = "\u001B[36m"
    const val BOLD = "\u001B[1m"
}