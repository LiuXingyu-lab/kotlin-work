// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("hello ,there are 4 types: a, b, c, d")
    println("please enter what you wanrt: ")
    val userinput = readln().lowercase()
    //应为userinput是string 后面那个就要【0】
    if (userinput.length == 1 && userinput[0] in 'a'..'d') {
        println("Order accepted")
    }
    else {
        println("Invalid choice!")
    }
}
