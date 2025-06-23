package com.github.diogenesssantos.fundamentos.Bclasse

class Veiculo (var nome : String  , var proprietario: Proprietario) {

    override fun toString(): String {
        return "Veiculo ${nome} pertence ${proprietario.nome}"
    }

}

/**
 * @author diogenesssantos
 * Proprietário tem atributo imutavel mas a classe veiculo tem todos suas propriedades mutaveis então ela pode substituir
 * seu proprietário orientação objeto basica*
 */

class Proprietario(val nome : String){
}