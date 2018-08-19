
/*
* EX5
* Utilizando Higher-Order Functions e Lambda,
* reescreva o programa anterior com uma função retornaIndice para retorna o índice do maior ou menor elemento,
* de acordo com uma função enviada como parâmetro.
* Esta função também deve ter um parâmetro opci-onal que informa o maior ou menor valor possível.
*
*/

fun main(args: Array<String>) {
    var index = retornaIndice(listOf(1,22,3,4,99), ::maiorItemLista)
    println("Index do maior item: $index")

    index = retornaIndice(listOf(1,22,3,4,99), ::menorItemLista)
    println("Index do menor item: $index")

    index = retornaIndice(listOf(1,22,3,4,99), 22)
    println("Index do valor 22: $index")
}

fun maiorItemLista(lista : List<Int>) : Int? {

    if (lista.isEmpty()) return null

    var maiorItem = lista[0]

    for (item in lista) {
        if (item > maiorItem) {
            maiorItem = item
        }
    }

    return maiorItem
}

fun menorItemLista(lista : List<Int>) : Int? {

    if (lista.isEmpty()) return null

    var menorItem = lista[0]

    for (item in lista) {
        if (item < menorItem) {
            menorItem = item
        }
    }

    return menorItem
}

fun retornaIndice(lista: List<Int>, comparador: (List<Int>) -> (Int?)) : Int? {
    if (lista.isEmpty()) return null

    return lista.indexOf(comparador(lista))
}

fun retornaIndice(lista: List<Int>, valor: Int) : Int? {
    if (lista.isEmpty()) return null

    return lista.indexOf(valor)
}