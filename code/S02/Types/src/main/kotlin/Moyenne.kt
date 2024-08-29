package org.lebrun

import kotlin.random.Random

fun main(){
    var tab = CreeTableau(3)
    PrintTableau(tab)
}

fun CreeTableau(n: Int):Array<Int>{
    var list = Array<Int>(n) { 0 }

    for (i in 0..list.count()-1){
        list[i] = Random.nextInt(0,100)
    }

    return list
}

fun PrintTableau(array:Array<Int>){
    println(array.sum())
    println(array.average())
    println(array.min())
    println(array.max())
}



