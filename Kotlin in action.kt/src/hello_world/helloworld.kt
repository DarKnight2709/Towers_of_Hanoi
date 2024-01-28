package Rank

fun nthRank(st: String, we: IntArray, n: Int): String {
    val arrName = st.split(",")

    if(st.isEmpty()) return "No participants"
    if(n > arrName.size) return "Not enough participants"

    val map = mutableMapOf<String, Int>()

    arrName.forEachIndexed {index, name ->
        var som = name.length
        name.forEach {ch->som += ch.lowercaseChar().code - 96}
        map.put(name, som * we[index])
    }
    println(map)
    return map.toList().sortedWith(compareByDescending <Pair<String, Int>> {it.second}.thenBy { it.first }).elementAt(n - 1).first
}

fun main() {
    val st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden"
    val we = intArrayOf(1, 3, 5, 5, 3, 6, 1)
    println(nthRank(st, we, 2))
}