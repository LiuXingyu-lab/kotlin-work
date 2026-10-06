// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //判断是不是三个参数输入
    if (args.size != 3) {
        println("Error: integer required on command line")
        exitProcess(1)
    }

    val mean = ((args[0].toInt() + args[1].toInt() + args[2].toInt()) / 3.0).roundToInt()
    val grade = when (mean) {
        in 70..100 -> "Distinction"
        in 40..69 -> "Pass"
        in 0..39 -> "Fail"
        else -> "invalid"
    }

    println(grade)
}