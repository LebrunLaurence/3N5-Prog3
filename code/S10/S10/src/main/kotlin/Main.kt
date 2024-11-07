package org.example

import java.io.File
import java.io.FileNotFoundException

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var list = arrayOf("1","2","3","4","5")
    try {
        trouveru(list,"7")
    }catch (e:ValeurPasDansList){
        println(e.message)
    }


    try {
        trouveru(list,"6")
    }catch (e:ValeurPasDansList){
        println(e.message)
    }

    lireDesFichiersForTry()
    println(" - ")
    lireDesFichiersTryFor()
}

fun trouveru(array:Array<String>,valeur:String):Int{
    if(array.contains(valeur)){
        println(array.indexOf(valeur))
        return array.indexOf(valeur)
    }
    throw ValeurPasDansList()
}

fun lireDesFichiersForTry() {
    for (i in 1 until 10) {
        try {
            lireFichier("$i.txt")
        } catch (e: FileNotFoundException) {
            println("fichier n'existe pas")
        }
    }
}

fun lireDesFichiersTryFor() {
    try {
        for (i in 1 until 10) {
            lireFichier("$i.txt")
        }
    } catch (e: FileNotFoundException) {
        println("fichier n'existe pas")
    }
}

fun lireFichier(value:String){
     var file = File(value)

    file.readLines()
}