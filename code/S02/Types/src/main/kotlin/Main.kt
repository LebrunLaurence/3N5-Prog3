package org.lebrun

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    val a = 1                                   // type est int
    val aa = 1L                                 // type est long
    val aaa = a * 25 + aa * 100                 // type est long
    val b = 1.0                                 // type est double
    val c = "1"                                 // type est string
    val d = true                                // type est bool
    val laChose = c + b                         // type est char
    val k = listOf("1", "2", "3")               // type est list<string>
    val l = mutableListOf(true, false, true)    // type est list<bool>
}