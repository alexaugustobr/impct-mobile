/*
*
* EX 1: Escreva uma função em Kotlin para somar os elementos de uma lista enviada como parâmetro.
*
*/

fun main(args: Array<String>) {

    val soma = somarElementos(listOf(1,1,3))

    println("A soma é $soma")
}

fun somarElementos (lista: List<Int>) : Int {

    var r = 0

    for (item in lista) r += item

    return r
}