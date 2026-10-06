// Task 5.1.1: main program
fun main(args: Array<String>) {
    val result = anagrams(args[0], args[1])

    if (result) {
        println("${args[0]} and ${args[1]} are anagrams")
    } else {
        println("${args[0]} and ${args[1]} are not anagrams")
    }
}