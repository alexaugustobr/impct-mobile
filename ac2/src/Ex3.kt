/*
*
* EX 3: Generalize a função do exercício anterior para funcionar para qualquer tipo de dados, não só inteiros.
*
*/

fun main(args: Array<String>) {
    val quantidade = quantidadeItemEncontradaG(arrayListOf("a","b","c"),"a")
    println("Quantidade: $quantidade")
}

fun <T> quantidadeItemEncontradaG(lista: ArrayList<T>, item: T): Int {

    var quantidade = 0

    while (lista.contains(item)) {
        lista.remove(item)
        quantidade += 1
    }

    return quantidade
}

