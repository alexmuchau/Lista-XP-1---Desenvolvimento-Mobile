class Aluno(val nome: String, val mediaNota: Float) {
}

fun main() {
    val alunosArray = Array<Aluno?>(5) { null }
    for (i in 1..5) {
        println("---> Aluno $i")
        alunosArray[i - 1] = criarAluno()
    }
    
    println("----> Alunos cadastrados <----")
    for (aluno in alunosArray) {
        if (aluno != null) {
            println("Nome: ${aluno.nome}")
            println("Média das notas: ${aluno.mediaNota}")
            if (aluno.mediaNota >= 7) {
                println("Aprovado!!!")
            } else {
                println("REPROVADO")
            }
            println("--------------------")
        }
    }
}

fun criarAluno(): Aluno {
    print("Digite o nome do aluno: ")
    val nome = readln()!!
    print("Digite a média das notas: ")
    val notas = readln()!!.toFloat()
    
    return Aluno(nome, notas)
}