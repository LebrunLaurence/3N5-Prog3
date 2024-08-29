package org.lebrun

fun main() {
    for (i : Int in 1..1) {
        for (j : Int in 1..2) {
            for (k : String in listOf(" pif", "") ) {
                val b = .1 + .1 + .1
                val z = (i + j * b / k.length * j).toString() + k
                println(z + " " + b)
            }
        }
    }
}