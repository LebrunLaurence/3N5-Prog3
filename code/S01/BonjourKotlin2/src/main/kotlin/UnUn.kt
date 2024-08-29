package org.lebrun

fun main(){
    println(unUn("1112133362"))
}

fun unUn(source: String): String{
    var result = "";
    val sourceLength = source.length;
    for(i in 0..sourceLength -1){
        var thisnum = source[i].digitToInt()
        if (i == 0 || thisnum != source[i -1].digitToInt()){
            var num = 1;
            for (j in i+1..sourceLength -1){
                var othernum = source[j].digitToInt()
                if(othernum == thisnum){
                    num++;
                } else {
                    break;
                }
            }
            result+= num;
            result+= thisnum;
        }
    }
    return result;
}