package org.lebrun

fun main(args: Array<String>){
    if(args.count() > 0){
        for(i in 0..args.count() -1){
            val num = args[i].toInt()
            println(num.toString() + ":")
            pyramide(num)
        }
    } else {
        println("Veuillez fournir des chiffres")
    }
}

fun pyramide(hauteur : Int){
    repeat(hauteur){
        print(" ")
    }
    print("*")
    println()
        for(i in 1..hauteur -1){
            repeat(hauteur -i){
                print(" ")
            }
            repeat(hauteur-(hauteur-i) + i){
                print("*")
            }
            println()
        }
}