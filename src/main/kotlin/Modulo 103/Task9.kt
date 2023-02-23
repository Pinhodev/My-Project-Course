package lms_129
import kotlin.math.roundToInt

fun task9(temperature: String): String {
    val temp = temperature.dropLast(1).toInt()

    val result = when (temperature.last().toString().uppercase()) {
        "C" -> { ((1.8 * temp + 32).roundToInt()).toString() +"F"}
        "F" -> { ((temp - 32) * 0.5556).roundToInt().toString()+"C" }
    else -> "Temperature Invalid "
    }
    return (result)
    }
fun main (){
    val temperature= "-30C" // Tests = -30C && 50f && -100c && 20a
    println("Assume that")
    println("¤ temperature is $temperature")
    println("Then")
    println("¤ result is " + task9(temperature))
}

