fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in list) {
        if (filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}

fun numerosPares(numero: Int) = numero % 2 == 0
fun numerosMaioresQue3(numero: Int) = numero > 3

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5)
    println(ints)
    var list = filtrar(ints, ::numerosPares)
    println(list)
    list = filtrar(ints, ::numerosMaioresQue3)
    println(list)
}