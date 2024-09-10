package org.example

fun main(args:Array<String>){
    var list = args.toList().toSet()
    var map:MutableMap<String,Int> = mutableMapOf()

    for(s: String in list){
        map[s] = args.count { it.equals(s) }
    }

    println(map)
}