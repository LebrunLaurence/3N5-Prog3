package org.example

import javax.lang.model.element.Element
import kotlin.coroutines.CoroutineContext

fun main(){
    var list:List<Int> = listOf(1,4,7,4,8,2,5)
    println(trouveALaMain(7,list))
    println(trouveALaMain(56,list))
    println(trouve(7,list))
    println(trouve(56,list))
    println(compteALaMain(4,list))
    println(compte(0, list))
}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean{
    for (i in 0..liste.count()-1){
        if(liste[i] == element){
            return true
        }
    }
    return false
}
fun trouve(element: Int, liste: List<Int>): Boolean{
    return liste.contains(element)
}

fun compteALaMain(element: Int, liste: List<Int>): Int{
    var nombre = 0
    for (i in 0.. liste.count() -1){
        if(liste[i] == element){
            nombre++
        }
    }

    return nombre
}

fun compte(element: Int, liste: List<Int>): Int{
    return liste.count { it.equals(element) }
}

