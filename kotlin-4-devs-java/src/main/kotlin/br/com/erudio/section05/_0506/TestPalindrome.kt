package br.com.erudio.section05._0506

import java.util.Arrays
import java.util.Collections

fun main() {
    val result = isPalindrome("civic")
    if(result) println("true") else println("false")
}

fun isPalindrome(palavra: String): Boolean {
    return palavra == palavra.reversed()
}