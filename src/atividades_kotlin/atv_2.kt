package atividades_kotlin

fun main() {
    print("Digite o comprimento do retangulo: ")
    val comprimento = readLine()?.toDoubleOrNull()

    print("Digite a largura do retangulo: ")
    val largura = readLine()?.toDoubleOrNull()

    if (comprimento != null && largura != null && comprimento > 0 && largura > 0) {
        val area = comprimento * largura
        val perimetro = 2 * (comprimento + largura)

        println("A area do retangulo e: $area")
        println("O perimetro do retangulo e: $perimetro")
    } else {
        println("Por favor, insira valores validos e positivos para o comprimento e a largura.")
    }
}
