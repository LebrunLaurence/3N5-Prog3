package org.lebrun

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import java.rmi.server.LogStream.log

fun main() {
    // Connect to the Wikipedia page and get the Document
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()

    // Log the title of the document
    println(doc.title())

    // Select the elements that match the CSS query "#mp-itn b a"
    val newsHeadlines: Elements = doc.select("#mp-itn b a")

    // Iterate over each headline element
    for (headline in newsHeadlines) {
        // Log the title attribute and the absolute URL of the href attribute
        println("${headline.attr("title")}\n\t${headline.absUrl("href")}")
    }
}


