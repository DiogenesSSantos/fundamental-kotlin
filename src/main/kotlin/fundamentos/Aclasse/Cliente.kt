package com.github.diogenesssantos.fundamentos.Aclasse

class Cliente(
    var nome: String,
    var idade: Int
) {

    override fun toString(): String {
        return "nome: ${nome} // idade : ${idade} "
    }

    fun printarIdade(): Int {
        return Integer.valueOf(1);
    }
}



