fun main (){
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    for (fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")

    listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva llamada $fruta") }

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length  }
    println(caracteresDeFruta)

    val listaFiltrada = caracteresDeFruta.filter { largoDefruta -> largoDefruta> 5 }
    println(listaFiltrada)
}