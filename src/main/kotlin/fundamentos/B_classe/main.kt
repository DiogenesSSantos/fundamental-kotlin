package fundamentos.B_classe

import com.github.diogenesssantos.fundamentos.Bclasse.Proprietario
import com.github.diogenesssantos.fundamentos.Bclasse.Veiculo


fun main() {


    val proprietario = Proprietario("Diogenes");
    val v1 = Veiculo("GOl", proprietario);

    /*
        Proprietário tem um atributo imutavel, mas a declaração do veiculo não e imutavél assim não podemos trocar o nome
        mas podemos trocar de proprietário.
     */
    v1.proprietario = Proprietario("Paulo tejano")


    print(v1);


}
