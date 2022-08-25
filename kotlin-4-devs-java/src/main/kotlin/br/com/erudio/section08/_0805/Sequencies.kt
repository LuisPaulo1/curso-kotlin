package br.com.erudio.section08._0805

fun main() {

    var students = getStudents()

    val sqStudents = students.drop(2).take(3).toList() // apaga os 2 primeiros valores e retorna os próximos 3
    println("Sequenced students: $sqStudents")

    val numbers = generateSequence(100) { it + 1 } // cria uma sequence iniciando em 100 e soma + 1 a cada valor
    println("Numbers: ${numbers.drop(5).take(20).toList()}") // apaga os 5 primeiros valores e retorna os próximos 20

    val squares = generateSequence(1) { it + 1  }.map{ it * it} // cria uma sequence iniciando em 1, soma + 1 a cada valor e multiplica cada valor por ele mesmo
    val evenSquares = squares.filter { it % 2 == 0} // retorna apenas os valores pares
    println("Even Squares: ${evenSquares.take(5).toList()}") // retorna os 5 primeiros valores

    val fibonacci = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: ${ fibonacci.take(15).toList() }")
}