package fundamentos.G_breakecontinue

fun main() {
    var numeroPar : Int = 0

    for(i in 1 .. 73){
        if (i % 2 == 0){
            numeroPar++
            println("Achamos +1" + " foi o valor ${i}")
            continue
        }
        println("Executando fim e repetindo...")
    }

    print("Achamos essa quantidade de par até a contagem do for ${numeroPar}")

}