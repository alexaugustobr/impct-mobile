fun filtrar2(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in list) {
        if (filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}
fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5)
    println(ints)
    var list = filtrar2(ints) { it % 2 == 0}
    println(list)
    list = filtrar2(ints) {it > 3}
    println(list)
}