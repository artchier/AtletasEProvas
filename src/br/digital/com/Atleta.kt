package br.digital.com

class Atleta(val nome: String,
             var nivel: Int,
             var energia: Int
) {
    init {
        println("Nome: $nome\tNível: $nivel\tEnergia: $energia")
    }
}