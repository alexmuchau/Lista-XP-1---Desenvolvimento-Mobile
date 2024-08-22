import kotlin.math.*

fun main() {
    var opt = -1
    var n: Float
    
    while (opt != 0) {
        println("1 - Verificar se um número é primo")
        println("0 - Sair")
        opt = readln()!!.toInt()
        
        when (opt) {
            1 -> {
                n = getInt()
                if (isPrimo(n)) {
                    println("$n é primo")
                } else {
                    println("$n não é primo")
                }
            }
            0 -> println("Saindo...")
            else -> println("Opção inválida")
        }
        println("")
    }
}

fun getInt(): Float {
    print("Digite um número inteiro: ")
    return readln()!!.toFloat()
}

fun isPrimo(n: Float): Boolean {
    if (n < 2) {
        return false
    }
    
    var num = n.roundToInt()
    
    for (i in 2..sqrt(n).roundToInt()) {
        if (num % i == 0) {
            return false
        }
    }
    
    return true
}