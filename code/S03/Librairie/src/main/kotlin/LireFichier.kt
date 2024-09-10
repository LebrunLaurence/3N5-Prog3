package org.example

import java.io.File
import java.io.FileNotFoundException

fun main(args:Array<String>){
    if(args.count() > 0){
        for(i in 0..args.count()-1){
            var text = args[i]
            var fichier = File(text)

            try {
                fichier.readLines()
            } catch(e:FileNotFoundException){
                println(fichier.name + " n'existe pas ou n'est pas accessible")
                return
            }

            println(fichier.readLines())
            println("-------------")
        }
    } else {
        println("Veuillez entrer vos fichiers")
    }
}