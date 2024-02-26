fun obtenerCalificaciones(notas: List<Int>): List<String> {
    return notas.map { nota ->
        when (nota) {
            in 95..100 -> "Excelente"
            in 85..94 -> "Notable"
            in 75..84 -> "Bueno"
            in 70..74 -> "Suficiente"
            else -> "Desempeño insuficiente"
        }
    }
}

fun main() {
    val notas = listOf(85, 92, 65, 78, 100, 72)
    val calificaciones = obtenerCalificaciones(notas)
    println("Calificaciones correspondientes a las notas: $calificaciones")
}
