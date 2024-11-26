package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var list = listOf("111","50","H1H H7H","444444","555 55","hhh    hhh")
    for(element in list){
        try{
            isValidZipCode(element)
        }catch (e:Exception){
            println(element + " : " + e.message)
        }

    }
}

