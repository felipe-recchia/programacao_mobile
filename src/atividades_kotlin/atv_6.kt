package atividades_kotlin

fun main() {
    print("Digite o peso (em kg): ")
    val peso = readLine()?.toDoubleOrNull()

    print("Digite a altura (em metros): ")
    val altura = readLine()?.toDoubleOrNull()

    if (peso != null && altura != null && peso > 0 && altura > 0) {
        val imc = peso / (altura * altura)

        val classificacao = when {
            imc < 18.5 -> "Magreza - grau de obesidade - 0"
            imc in 18.5..24.9 -> "Normal - grau de obesidade - 0"
            imc in 25.0..29.9 -> "Sobrepeso - grau de obesidade - I"
            imc in 30.0..39.9 -> "Obesidade - grau de obesidade - II"
            imc >= 40.0 -> "Obesidade Grave - grau de obesidade - III"
            else -> "Classificacao nao definida"
        }

        println("O IMC e: %.2f".format(imc))
        println("Classificacao: $classificacao")
    } else {
        println("Peso e altura devem ser numeros validos e positivos.")
    }
}
