package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var list = arrayOf("1","2","3","4","5")
    try {
        trouveru(list,"5")
    }catch (e:ValeurPasDansList){
        println(e.message)
    }
}

fun trouveru(array:Array<String>,valeur:String):Int{
    if(array.contains(valeur)){
        println(array.indexOf(valeur))
        return array.indexOf(valeur)
    }
    throw ValeurPasDansList()
}