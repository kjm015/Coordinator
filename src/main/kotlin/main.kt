import java.util.*
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    var play: Boolean
    do {
        println("Enter coordinate x1")
        val x1 = scanner.nextInt()

        println("Enter coordinate y1")
        val y1 = scanner.nextInt()

        println("Enter coordinate x2")
        val x2 = scanner.nextInt()

        println("Enter coordinate y2")
        val y2 = scanner.nextInt()

        println("Calculating distance between coordinates ($x1, $y1) and ($x2, $y2)...")

        val distX = abs(x2 - x1).toDouble()
        val distY = abs(y2 - y1).toDouble()
        val distance = sqrt(distX.pow(2) + distY.pow(2))

        println("The distance is roughly ${distance.roundToInt()} units.")

        println("Do you wish to enter more coordinates? Y/N")
        val resp = scanner.next().uppercase()

        play = resp == "Y" || resp == "YES"
    } while (play)
}
