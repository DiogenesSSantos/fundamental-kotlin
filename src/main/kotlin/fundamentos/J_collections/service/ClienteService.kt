package fundamentos.J_collections.service

import fundamentos.J_collections.model.Cliente
import fundamentos.J_collections.repository.ClienteRepository

class ClienteService () {



    companion object {
        private val clienteRepository : ClienteRepository = ClienteRepository()
    }


    public fun salvar (cliente : Cliente) {
        clienteRepository.salvar(cliente)
    }


    fun buscarTodos() : Any? {
        return clienteRepository.buscarTodos()
    }

    fun deletar(cliente: Cliente) : Boolean {
        return clienteRepository.delele(cliente)
    }

}