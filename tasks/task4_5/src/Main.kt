// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val limit = args[0].toLong()
    var sum = 0L
    for ( n in 1..limit step 2) {
        sum += n
    }
    println(sum)
}
