/*
* EX 6
* Utilizando lambda e funções anônimas, escreva um programa em Kotlin com uma função encontraPesoIdeal,
* a partir da altura de uma pessoa. A função deve ter apenas uma linha.
* Utilize as seguintes expressões (h == altura): Para homens: 72.7 * h - 58 ; Para mulheres: 62.1 * h - 44.7
*
 */

fun main(args: Array<String>) {
    val altura : Double = 1.57
    var peso = encontraPesoIdeal(altura) {72.7 * it - 58}
    println("Peso ideal para homens de altura $altura m: $peso")
    peso = encontraPesoIdeal(altura) {62.1 * it - 44.7}
    println("Peso idela para mulheres de altura $altura m: $peso")
}

fun encontraPesoIdeal(altura: Double, formulaCalculo: (Double) -> Double) = formulaCalculo(altura)
