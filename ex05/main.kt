fun main() {
    print("Vezes para lançar o dado: ")
    val n = readln()!!.toInt()
    var r1: Int
    var r2: Int
    
    for (i in 1..n) {
        println("---> $i º lançamento")
        
        r1 = (1..6).random()
        r2 = (1..6).random()
        
        println("Os dados sorteados foram -> [$r1, $r2]")
        println("Soma dos dados = ${r1 + r2}")
    }
}