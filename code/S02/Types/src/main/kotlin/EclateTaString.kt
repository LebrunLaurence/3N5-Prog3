package org.lebrun

fun main(args : Array<String>){
    if(args.count() > 0){
        val nom = args[0]
        for(i in 0..nom.length-1){
            println(nom[i])
        }
    } else {
        println("Veuillez fournir une chaine de charactère")
    }

}