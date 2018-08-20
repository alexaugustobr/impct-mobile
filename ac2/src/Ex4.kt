/*
*
* EX 4: Escreva um programa em Kotlin com uma função que recebe por parâmetro uma lista de números inteiros
* e retorna o índice em que se encontra o maior elemento do vetor.
*
*/

fun main(args: Array<String>) {
    val i = maiorItem(listOf(1,9,3,4,5))
    println("Index do maior item: $i")
}

fun maiorItem(lista : List<Int>) : Int? {

    if (lista.isEmpty()) return null

    var maiorItem = lista[0]

    for (item in lista) {
        if (item > maiorItem) {
            maiorItem = item
        }
    }

    return lista.indexOf(maiorItem)
}
