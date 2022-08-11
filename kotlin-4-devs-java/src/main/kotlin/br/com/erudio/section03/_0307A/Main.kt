package br.com.erudio.section03

fun main(args: Array<String>){
    val nome = if(args.isNotEmpty()) args[0] else "Kotlin World"
    println("Hello, $nome!!")
}

