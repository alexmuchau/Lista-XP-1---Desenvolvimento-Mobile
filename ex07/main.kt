class Voo(val numeroDoVoo: Int, var assentosDisponiveis: IntArray) {
    fun verificarAssento(assento: Int): Boolean {
        return assento in assentosDisponiveis
    }
    
    fun reservarAssento(assento: Int): Boolean {
        val oldSize = assentosDisponiveis.size
        assentosDisponiveis = assentosDisponiveis.filter { it != assento }.toIntArray()
        
        return oldSize > assentosDisponiveis.size
    }
}

fun main() {
    val voo = Voo(1, intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    
    var opt = 0
    while (opt != 3) {
        println("1 - Verificar assento")
        println("2 - Reservar assento")
        println("3 - Sair")
        print("Opção: ")
        opt = readln()!!.toInt()
        
        when (opt) {
            1 -> {
                print("Digite o número do assento: ")
                val assento = readln()!!.toInt()
                println(if (voo.verificarAssento(assento)) "Assento disponível" else "Assento indisponível")
            }
            2 -> {
                print("Digite o número do assento: ")
                val assento = readln()!!.toInt()
                println(if (voo.reservarAssento(assento)) "Assento reservado" else "Assento indisponível")
            }
            3 -> println("Saindo...")
            else -> println("Opção inválida")
        }
    }
}