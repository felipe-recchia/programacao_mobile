package atividades_kotlin

fun main() {
    print("Digite um numero entre 1 e 12: ")
    val mes = readLine()?.toIntOrNull()

    if (mes != null && mes in 1..12) {
        val nomeDoMes = when (mes) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "Mes inválido"
        }
        println("O mes correspondente ao numero $mes é $nomeDoMes.")
    } else {
        println("Numero invalido. Por favor, insira um numero entre 1 e 12.")
    }
}

