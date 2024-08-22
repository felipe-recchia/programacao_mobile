package atividades_kotlin

fun main() {

    print("Digite o primeiro numero inteiro: ")
    val n1 = readLine()?.toIntOrNull()

    print("Digite o segundo numero inteiro: ")
    val n2 = readLine()?.toIntOrNull()

    if (n1 != null && n2 != null) {
        val maior = if (n1 > n2) n1 else n2
        println("O maior numero e: $maior")
    } else {
        println("Por favor, insira numeros inteiros validos.")
    }
}
