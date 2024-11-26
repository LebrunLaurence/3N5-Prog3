package org.example

fun isValidZipCode(zippy:String):Boolean{
    var twoPartsSpace = zippy.split(" ")
    var twoPartsTiret = zippy.split("-")
    if(twoPartsTiret.count() == 2){
        var lenghtOne = twoPartsTiret[0].length
        var lenghtTwo = twoPartsTiret[1].length
        if(lenghtOne != 3 || lenghtTwo != 3){
            throw Exception("Code isn't 6 character long")
        }
    }else if (twoPartsSpace.count() == 2){
        var lenghtOne = twoPartsSpace[0].length
        var lenghtTwo = twoPartsSpace[1].length
        if(lenghtOne != 3 || lenghtTwo != 3){
            throw Exception("Code isn't 6 character long")
        }
    }else{
        var lenght = zippy.length
        if(lenght != 6){
            throw Exception("Code isn't 6 character long")
        }
    }
    return true
}