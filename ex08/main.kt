class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {
    init {
        verificarEstoque()
    }
    
    fun repor(quantidade: Int) {
        this.quantidade += quantidade
    }
    
    fun verificarEstoque() {
        if (quantidade <= nivelMinimo) {
            println("Necessário repor estoque do produto $nome! Repondo ${nivelMaximo - quantidade} unidades...")
            repor(nivelMaximo - quantidade)
            
            return
        }
        
        println("Estoque do produto $nome está OK!")
    }
}

fun main() {
    val estoque = Array<Produto?>(5) { null }
    
    for (i in 1..5) {
        println("-----> Produto $i <-----")
        print("Digite o nome do produto: ")
        val nome = readln()!!
        
        print("Digite a quantidade do produto: ")
        val quantidade = readln()!!.toInt()
        
        print("Digite o nível mínimo do produto: ")
        val nivelMinimo = readln()!!.toInt()
        
        print("Digite o nível máximo do produto: ")
        val nivelMaximo = readln()!!.toInt()
        
        estoque[i - 1] = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
    }
}