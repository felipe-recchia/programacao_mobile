package atividades_kotlin

fun main() {
    fun fatorial(n: Int): Long {
        var resultado = 1L
        for (i in 1..n) {
            resultado *= i
        }
        return resultado
    }

    for (i in 1..15) {
        println("O fatorial de $i e ${fatorial(i)}")
    }
}
