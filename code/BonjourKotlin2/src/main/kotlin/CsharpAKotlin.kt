package org.lebrun

fun main(args: Array<String>) {
    
    if (args.isNotEmpty()) {
        val nom = args[0]
        afficher(nom)
    } else {
        println("SVP veuillez fournir un nom!")
    }
}

fun afficher(nom: String) {
    println("Bonjour $nom!")
}
