fun main(){
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
//    val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)
//    println(randomCase(fraseAleatoria))
//    imprimirFrase(randomCase(fraseAleatoria))
    imprimirFrase(fraseAleatoria)
}


fun imprimirFrase(frase: String): Unit{
    println("Tu frase es: $frase")
}

fun String.randomCase(/*frase: String*/) : String{ //La funcion se convierte en de extension 
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2)==0){
        this.uppercase()
    }else{
        this.lowercase()
    }
}