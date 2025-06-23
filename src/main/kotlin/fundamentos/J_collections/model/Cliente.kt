package fundamentos.J_collections.model

class Cliente(var nome : String ,
              var idade : Int) {


    override fun toString(): String {
        return "[Cliente = ${nome} || idade = ${idade} ]"
    }
}