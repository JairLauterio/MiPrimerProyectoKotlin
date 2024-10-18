const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    /* var dinero  : Int = 10 ; Formas de declarar*/
    var dinero  = 10
    println("Valor 1: " + dinero)
    dinero = 5
    println("Valor 2: " + dinero)
    val nombre = "Jair" //Es solo lectura VAL
    println("Nombre: "+nombre)
    println("Valor PI: " + PI)

    val boolean : Boolean = true // val boolean = true
    val numeroLargo : Long = 3L  //3000000000 - val numeroLargo = 3L
    val double : Double = 2.7182 // val double = 2.7182
    val float : Float = 1.1f // val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor =  primerValor - segundoValor
    println("Resultado final : "+tercerValor)

    val apellido = "Lauterio"
    val Jair = "Jair";
    val nombreCompleto = "Mi nombre es $Jair $apellido"//"$Jair $apellido" - Jair +" " + apellido
    println( nombreCompleto)

}