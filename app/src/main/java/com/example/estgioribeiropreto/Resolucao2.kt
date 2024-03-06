package com.example.estgioribeiropreto

fun main() {
    val numero = 35
    if (verificaFibonacci(numero)) {
        println("O número $numero pertence à sequência de Fibonacci.")
    } else {
        println("O número $numero não pertence à sequência de Fibonacci.")
    }
}

fun verificaFibonacci(num: Int): Boolean {
    var a = 0
    var b = 1
    while (a < num) {
        val temp = a
        a = b
        b += temp
    }
    return a == num
}


