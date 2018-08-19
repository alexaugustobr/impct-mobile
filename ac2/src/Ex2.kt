/*
*
* EX 2:  Escreva um programa em Kotlin com uma função que recebe por parâmetro uma lista de números inteiros
* e um número inteiro qualquer X e retorna a quantidade de vezes que X encontra-se na lista.
*
*/

fun main(args: Array<String>) {
    val quantidade = quantidadeItemEncontrada(arrayListOf(1,2,3,3),3)
    println("Quantidade: $quantidade")
}

fun quantidadeItemEncontrada(lista: ArrayList<Int>, item: Int): Int {

    var quantidade = 0

    while (lista.contains(item)) {
        lista.remove(item)
        quantidade += 1
    }

    return quantidade
}