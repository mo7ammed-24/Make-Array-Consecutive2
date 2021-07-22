fun main() {
    println(mutableListOf(6,2,3,8))
}

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var min = statues[0]
    var max = statues[0]
    statues.forEach{if(it<min) min=it}
    statues.forEach{if(it>max) max=it}
    var count = 0
    for(item in min..max)
        if(item !in statues)
            count+=1
    return count
}
