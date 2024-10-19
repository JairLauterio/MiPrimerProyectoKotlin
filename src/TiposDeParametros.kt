fun main(){
    imprimirNombre(nombre="Jair", apellido = "Lauterio")
}

fun imprimirNombre(nombre:String,segundoNombre: String= "Alejandro", apellido: String){
    println("Mi nombre es $nombre $segundoNombre y mi apellido es $apellido")
}