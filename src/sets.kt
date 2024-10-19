fun main(){
    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)

    println(numerosFavoritos)
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val valorSelSet: Int? = numerosFavoritos.firstOrNull() { numero -> numero > 2 }
    println(valorSelSet)

}