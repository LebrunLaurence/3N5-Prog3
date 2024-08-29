package org.lebrun

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(args: Array<String>){
    if(args.count() > 0){
        val doc: Document = Jsoup.connect(args[0]).get()

        var list = doc.allElements
        for(i in 0..list.count()-1){
            println(Jsoup.parseBodyFragment(list[i].toString()))
        }
    }else {
        println("Veuillez fournir une address web")
    }
}

