// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val path = Path("text.txt")
    path.writeText("hihihi")
    path.appendText("goodbye")

    val content = path.readText()
    println(content)
}
