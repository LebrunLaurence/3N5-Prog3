package org.lebrun

fun main(args:Array<String>){
    if(args.count() >0){
        val num = args[0].toInt()

        println(Integer.toBinaryString(num))
    } else {
        println("Veuillez inclure une chaine de charactère")
    }
}