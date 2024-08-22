package atividades_kotlin

fun main() {
    print("Digite um numero inteiro: ")
    val n = readLine()?.toIntOrNull()

    if (n != null) {
        var fatorial = 1

        for (i in 1..n) {
            fatorial *= i
        }

        println("O fatorial de $n e $fatorial")
    } else {
        println("Numero invalido. Por favor, insira um numero inteiro valido.")
    }
}
