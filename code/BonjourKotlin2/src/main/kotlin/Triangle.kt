package org.lebrun

fun triangle(hauteur : Int){
    for (i in 1..hauteur) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        repeat(i){
            print("*")
        }
        println()
    }
    println()
}

fun main(){
    triangle(4)
    triangle(8)
    triangle(10)
    triangle(100)
}