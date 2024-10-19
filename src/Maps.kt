fun main(){
    val edadDeSuperHeroes = mapOf( //No se pueden editar los datos, solo lectura
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadDeSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf( //Se editan y leen los datos
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Wolwerine",45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["Storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronman = edadSuperHeroesMutable["Ironman"]
    println(edadIronman)

    edadSuperHeroesMutable.remove("Wolwerine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)


}