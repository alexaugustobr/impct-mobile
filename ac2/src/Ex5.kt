
/*
* EX5
* Utilizando Higher-Order Functions e Lambda,
* reescreva o programa anterior com uma função retornaIndice para retorna o índice do maior ou menor elemento,
* de acordo com uma função enviada como parâmetro.
* Esta função também deve ter um parâmetro opci-onal que informa o maior ou menor valor possível.
*
*/

fun main(args: Array<String>) {
    var index = retornaIndice(listOf(1,22,3,4,99), {n1, n2 -> maior(n1, n2)})
    println("Index do maior item: $index")

    index = retornaIndice(listOf(1,22,3,4,99), {n1, n2 -> menor(n1, n2)})
    println("Index do menor item: $index")

    index = retornaIndice(listOf(1,22,3,4,99), 22)
    println("Index do valor 22: $index")
}

fun maior(n1:Int, n2:Int) = n1 > n2
fun menor(n1:Int, n2:Int) = n1 < n2

fun retornaIndice(lista: List<Int>, comparador: (Int, Int) -> (Boolean)) : Int? {
   if (lista.isEmpty()) return null

    var itemEncontrado = lista[0]

    for (item in lista) {
        if (comparador(itemEncontrado, item)) {
            itemEncontrado = item
        }
    }

    return lista.indexOf(itemEncontrado)
}

fun retornaIndice(lista: List<Int>, valor: Int) : Int? {
    if (lista.isEmpty()) return null

    return lista.indexOf(valor)
}
