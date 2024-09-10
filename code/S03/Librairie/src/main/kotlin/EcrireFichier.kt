package org.example

import java.io.File
import java.io.FileWriter

fun main(){
    val writerVide = FileWriter("vide.txt")
    writerVide.write("")
    writerVide.close()

    val writerNom = FileWriter("nom.txt")
    writerNom.write("Lebrun Laurence")
    writerNom.close()
}