package atividades_kotlin

fun main() {

    print("Digite um numero inteiro positivo: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        var soma = 0.0

        for (i in 1..n) {
            soma += i.toDouble() / (n - i + 1)
        }

        println("O valor da soma f($n) é $soma")
    } else {
        println("Numero inválido. Por favor, insira um numero inteiro positivo.")
    }
}