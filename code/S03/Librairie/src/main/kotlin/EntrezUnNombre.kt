package org.example

fun main(){
    println("Veuillez entrer un nombre :")
    while (true){
        var nombre:String = readln()

        if(nombre.toIntOrNull() != null){
            println("Merci, votre nombre est " + nombre)
            return
        } else {
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
    }
}