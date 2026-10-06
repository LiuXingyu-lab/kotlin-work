// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    fun main(args: Array<String>) {
    val initial = args[0].toDouble()
    val maximum = args[1].toDouble()
    val increment = args[2].toDouble()

    var current = initial

    while (current <= maximum) {
        val fahrenheit = (current * 9) / 5 + 32

        println("%.1f %.1f".format(current, fahrenheit))

        current += increment
    }
}
}
