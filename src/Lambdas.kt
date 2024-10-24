fun main (){
    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada = myLambda("Hola Platzi")
    println(lambdaEjecutada)

    val saludos = listOf("Hola","Hello","Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)
}