package atividades_kotlin

fun main() {
    print("Digite um numero inteiro positivo: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        var soma = 0.0

        for (i in 1..n) {
            val numerador = i * i + 1
            val denominador = i + 3
            soma += numerador.toDouble() / denominador
        }

        println("O valor da soma f($n) e $soma")
    } else {
        println("Numero invalido. Por favor, insira um numero inteiro positivo.")
    }
}
