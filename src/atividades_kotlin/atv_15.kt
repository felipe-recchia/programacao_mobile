package atividades_kotlin

fun max(a: Double, b: Double): Double {
    return if (a > b) a else b
}

fun min(a: Double, b: Double): Double {
    return if (a < b) a else b
}

fun media(a: Double, b: Double): Double {
    return (a + b) / 2
}

fun main() {

    val a = 7.5
    val b = 3.8

    println("O maior valor entre $a e $b é: ${max(a, b)}")
    println("O menor valor entre $a e $b é: ${min(a, b)}")
    println("A media entre $a e $b é: ${media(a, b)}")
}
