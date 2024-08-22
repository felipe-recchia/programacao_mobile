package atividades_kotlin

fun main() {
    print("Digite o primeiro numero inteiro: ")
    val n1 = readLine()?.toIntOrNull()

    print("Digite o segundo numero inteiro: ")
    val n2 = readLine()?.toIntOrNull()

    print("Digite o terceiro numero inteiro: ")
    val n3 = readLine()?.toIntOrNull()

    if (n1 != null && n2 != null && n3 != null) {
        val maior = maxOf(n1, n2, n3)
        println("O maior numero e: $maior")
    } else {
        println("Por favor, insira numeros inteiros validos.")
    }
}
