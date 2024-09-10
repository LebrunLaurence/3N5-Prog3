package org.example

fun main(){
    println(repete(4,2))
    println(repete(7,5))
    println(repete(1,3))
    println(repete(4,8))

}

fun repete(n:Int, nombreFois:Int):MutableList<Int>{
    var list: MutableList<Int> = mutableListOf();
    for(i in 1..n){
        repeat(nombreFois){
            list.add(i)
        }
    }

    return list
}