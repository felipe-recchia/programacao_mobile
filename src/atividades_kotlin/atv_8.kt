package atividades_kotlin

fun main() {
    print("Digite um numero entre 1 e 7: ")
    val dia = readLine()?.toIntOrNull()

    if (dia != null && dia in 1..7) {
        val nomeDoDia = when (dia) {
            1 -> "Domingo"
            2 -> "Segunda"
            3 -> "Terca"
            4 -> "Quarta"
            5 -> "Quinta"
            6 -> "Sexta"
            7 -> "Sabado"
            else -> "Dia invalido"
        }
        println("O dia correspondente ao numero $dia é $nomeDoDia.")
    } else {
        println("Numero invalido. Por favor, insira um numero entre 1 e 7.")
    }
}
