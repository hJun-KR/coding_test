fun main() {
    val n = readLine()!!.toInt()
    var total = 0
    
    repeat(n) {
        val a = readLine()!!.toInt()
        total += a
    }
    
    println(total)
}