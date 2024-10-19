fun main () {
    val listaDeNombres = listOf("Juan", "Enrique", "Camila")
    println(listaDeNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Jair")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUSandoOperador = listaVacia[0]
    println(valorUSandoOperador)

    val primerValor: String?= listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf{caracteres -> caracteres.length>3}
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro array $myArray")
    print("Array como lista ${myArray.toList()}")
}