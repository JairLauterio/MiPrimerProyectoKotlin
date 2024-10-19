fun main(){
    var nombre : String ? = null
//    nombre!!.length
//    nombre?.length
//    println(nombre?.length)
    try {
//        nombre!!.length
        throw  NullPointerException("HA ocurrido un error")
    }catch (exception: NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finaalmente ha ocurrido un error..cerrando aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor} catch (exception: Exception) { 0 }
    println(resultado)
}