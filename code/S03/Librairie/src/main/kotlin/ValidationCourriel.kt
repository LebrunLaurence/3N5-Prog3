package org.example

import org.apache.commons.mail.Email
import org.jsoup.helper.Validate
import org.apache.commons.validator.Validator
import org.apache.commons.validator.routines.EmailValidator

fun main(args:Array<String>){
    if (args.count() >0){
        for(a in args){
            val validator = EmailValidator.getInstance()

            if(validator.isValid((a))){
                println("OK : " + a)
            }else {
                println("KO : " + a)
            }
        }
    }
}