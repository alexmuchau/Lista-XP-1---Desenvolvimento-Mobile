fun main() {
    println("Digite o seu texto:")
    val text = readln()!!
    
    println("A quantidade de palavras é: ${contarPalavras(text)}")
}

fun contarPalavras(text: String): Int {
    return text.split(" ").size
}