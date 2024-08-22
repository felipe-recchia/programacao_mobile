package atividades_kotlin

fun main() {
    print("Digite um numero inteiro: ")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        if (numero % 3 == 0 && numero % 4 == 0) {
            println("O numero $numero e multiplo de 3 e 4.")
        } else {
            println("O numero $numero nao e multiplo de 3 e 4.")
        }
    } else {
        println("Numero invalido. Por favor, insira um numero inteiro valido.")
    }
}
