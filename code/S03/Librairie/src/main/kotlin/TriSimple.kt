package org.example

fun main(){
    var list:List<Double> = listOf(0.1,12.34,-0.1234,3.1416)
    println(list)
    println(triInverseALaMain(list))
    println(triInverse(list))
}

fun triInverse(liste: List<Double>):List<Double>{
    return liste.sorted()
}

fun  triInverseALaMain(liste: List<Double>):MutableList<Double>{
    var listInverse:MutableList<Double> = liste.map { it.toDouble() }.toMutableList()
    for(i in 0..listInverse.count()-1){
        var numero1 = listInverse[i]
        for (j in 0..listInverse.count()-1){
            var numero2 = listInverse[j]
            if(numero1 < numero2){
                listInverse.add(j,numero1)
            }
        }
    }
    return listInverse
}