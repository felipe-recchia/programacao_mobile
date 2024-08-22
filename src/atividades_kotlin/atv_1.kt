package atividades_kotlin

fun main() {
    // Solicita ao usuário que insira o nome
    print("Digite seu nome: ")
    val nome = readLine()

    // Solicita ao usuário que insira o sobrenome
    print("Digite seu sobrenome: ")
    val sobrenome = readLine()

    // Verifica se ambos os valores não são nulos e imprime o nome completo
    if (nome != null && sobrenome != null) {
        println("Seu nome completo e: $nome $sobrenome")
    } else {
        println("Erro ao ler o nome ou sobrenome.")
    }
}
