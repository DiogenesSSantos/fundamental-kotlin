package fundamentos.J_collections

import fundamentos.J_collections.model.Cliente
import fundamentos.J_collections.service.ClienteService

fun main() {
    var cliente = Cliente("Diogenes", 28)
    var cliente1 = Cliente("Maria jose", 62)
    var cliente2 = Cliente("Severino Manoel", 65)
    var cliente3 = Cliente("Branca", 12)
    var clienteService = ClienteService()


    clienteService.salvar(cliente)
    clienteService.salvar(cliente1)
    clienteService.salvar(cliente2)
    clienteService.salvar(cliente3)
    println(clienteService.buscarTodos())

    println("Deletou ?? -> "+ clienteService.deletar(cliente))
    println(clienteService.buscarTodos())

}