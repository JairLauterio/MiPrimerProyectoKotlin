fun main(){
    val moviles = mutableListOf("Google pixel 2XL","Google pixel 4a","Huawei redmi 9","Xiaomi mi a3")
        .run{
            removeIf{movil -> movil.contains("Google")}
            this
        }
    println(moviles)
}