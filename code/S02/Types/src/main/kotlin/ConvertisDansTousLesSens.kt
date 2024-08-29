package org.lebrun

fun main(){
    var int:Int = 1
    var double:Double = 2.67
    var string:String = "3"
    var float:Float = 4.7F

    float = int.toFloat()
    int = double.toInt()
    int = string.toInt()
    string = int.toString()
    double = float.toDouble()
}