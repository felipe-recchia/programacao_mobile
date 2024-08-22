package atividades_kotlin

fun tipoDeTriangulo(a: Double, b: Double, c: Double): String {

    if (a < b + c && b < a + c && c < a + b) {
        return when {

            a == b && b == c -> "Triangulo Equilatero"

            a == b || b == c || a == c -> "Triangulo Isosceles"

            else -> "Triangulo Escaleno"
        }
    } else {
        return "Os valores fornecidos não formam um triangulo."
    }
}

fun main() {
                        //teste
    val a = 7.0
    val b = 7.0
    val c = 7.0

    val tipo = tipoDeTriangulo(a, b, c)
    println("O triangulo com lados $a, $b, e $c e do tipo: $tipo")
}
