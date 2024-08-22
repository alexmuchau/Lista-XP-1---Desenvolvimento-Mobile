fun main() {
    val alunosArray = Array<String>(10) { "" }
    for (i in 1..10) {
        print("Digite o nome do $i º aluno: ")
        alunosArray[i - 1] = readln()!!
    }
    alunosArray.sort()
    println("----> Alunos cadastrados <----")
    for (aluno in alunosArray) {
        println(aluno)
    }
}