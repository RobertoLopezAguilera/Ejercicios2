fun obtenerCalificacionesAprobadas(asignaturas: Map<String, Int>): Map<String, String> {
    val calificacionesAprobadas = mutableMapOf<String, String>()
    for ((asignatura, nota) in asignaturas) {
        val calificacion = when (nota) {
            in 95..100 -> "Excelente"
            in 85..94 -> "Notable"
            in 75..84 -> "Bueno"
            in 70..74 -> "Suficiente"
            else -> "Desempeño insuficiente"
        }
        if (calificacion != "Desempeño insuficiente") {
            calificacionesAprobadas[asignatura.toUpperCase()] = calificacion
        }
    }
    return calificacionesAprobadas
}

fun main() {
    val notas = mapOf("Redes" to 90, "Poo" to 65, "Ing.Software" to 78, "Web" to 100)
    val calificacionesAprobadas = obtenerCalificacionesAprobadas(notas)
    println("Calificaciones aprobadas:")
    calificacionesAprobadas.forEach { (asignatura, calificacion) ->
        println("$asignatura: $calificacion")
    }
}
