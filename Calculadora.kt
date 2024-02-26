import kotlin.math.*

fun applyFunction(f: (Double) -> Double, n: Int): Map<Int, Double> {
    val result = mutableMapOf<Int, Double>()
    for (i in 1..n) {
        result[i] = f(i.toDouble())
    }
    return result
}

fun calculator() {
    print("Introduce la función a aplicar (sin, cos, tan, exp, log): ")
    val functionInput = readLine()
    print("Introduce un entero positivo: ")
    val n = readLine()?.toIntOrNull() ?: return

    val function: (Double) -> Double = when (functionInput) {
        "sin" -> ::sin
        "cos" -> ::cos
        "tan" -> ::tan
        "exp" -> ::exp
        "log" -> ::ln
        else -> {
            println("Función no válida.")
            return
        }
    }

    val result = applyFunction(function, n)
    println("Tabla de valores:")
    result.forEach { (i, j) -> println("$i\t$j") }
}

fun main() {
    calculator()
}
