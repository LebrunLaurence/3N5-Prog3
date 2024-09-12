package org.example

import org.jsoup.HttpStatusException
import org.jsoup.Jsoup
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.coroutines.CoroutineContext

fun main(args:Array<String>){
    if (args.count() > 0){
        val url = Jsoup.connect(args[0]).get()

        var hrefs = url.select("a[href]")

        val urls = mutableMapOf<String,String>()

        for(e in hrefs){
            urls[e.attr("href")] = e.attr("abs:href")
        }

        for(e in urls){
            println(e)
        }
    }
}