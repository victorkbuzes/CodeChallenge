package com.example.jettip.codechallenge

fun main(args: Array<String>) {

    val num = 5
    var factorial: Long = 1
    for (i in 1..num) {
        // factorial = factorial * i;
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}