package br.digital.com

fun main(){

    val atleta1 = Atleta("atleta1", 1, 5)
    println()
    val prova1 = Prova(10, 10)
    val prova2 = Prova(0, 10)
    val prova3 = Prova(1, 1)
    println("${atleta1.nome} pode realizar a prova 1? "+prova1.podeRealizar(atleta1))
    println("${atleta1.nome} pode realizar a prova 2? "+prova2.podeRealizar(atleta1))
    println("${atleta1.nome} pode realizar a prova 3? "+prova3.podeRealizar(atleta1))
    println()
    val atleta2 = Atleta("atleta2", 100, 1000)
    println("${atleta2.nome} pode realizar a prova 1? "+prova1.podeRealizar(atleta2))
    println("${atleta2.nome} pode realizar a prova 2? "+prova2.podeRealizar(atleta2))
    println("${atleta2.nome} pode realizar a prova 3? "+prova3.podeRealizar(atleta2))
}