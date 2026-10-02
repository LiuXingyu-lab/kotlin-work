// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    //判断是不是三个args
    if(args.size < 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    //3 edges (tranlate data type)
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    //公式计算
    val s = (a + b + c) / 2
    val x = s * (s - a) * (s - b) * (s - c)
    val area = sqrt(x)

    //putput and 5位小数
    println("Area = %.5f".format(area))


    
}
