package atividades_kotlin

fun potencia(a: Int, b: Int): Int {
    var resultado = 1

    for (i in 1..b) {
        resultado *= a
    }

    return resultado
}

fun main() {

    print("Digite a base (a): ")
    val a = readLine()?.toIntOrNull()

    print("Digite o expoente (b): ")
    val b = readLine()?.toIntOrNull()

    if (a != null && b != null && a >= 0 && b >= 0) {
        val resultado = potencia(a, b)
        println("O valor de $a^$b é $resultado")
    } else {
        println("Por favor, insira valores inteiros positivos para a e b.")
    }
}
