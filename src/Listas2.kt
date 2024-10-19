fun main (){
    val numeroDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numeroDeLoteria.sorted()//Ordenar
    println("Ordenados descendiente")
    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numeroDeLoteria.sortedDescending()//Ordenar descendiente
    println("Ordenados descendiente")
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numeroDeLoteria.sortedBy { numero -> numero < 50 }
    println("Ordenados por mayor de 50")
    println(ordenarPorMultiplos)

    val numerosAleatorios = numeroDeLoteria.shuffled()
    println("Numeros aleatorios en posicion")
    println(numerosAleatorios)

    val numerosEnReversa = numeroDeLoteria.reversed()
    println("Ordenados al reves")
    println(numerosEnReversa)

    val mensajesDeNumeros = numeroDeLoteria.map { numero -> "Tu numero de loteria es $numero" }
    println("Ordenados con un texto añadido")
    println(mensajesDeNumeros)

    val numerosFiltrados = numeroDeLoteria.filter { numero -> numero >50 }
    println("Ordenados con condicion o filtrados")
    println(numerosFiltrados)
}