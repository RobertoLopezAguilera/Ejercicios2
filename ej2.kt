fun filterList(predicate: (Int) -> Boolean, list: List<Int>): List<Int> {
    return list.filter { predicate(it) }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Función para verificar si un número es par
    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    val filteredList = filterList(isEven, numbers)
    println("Elementos de la lista que son pares: $filteredList")
}
