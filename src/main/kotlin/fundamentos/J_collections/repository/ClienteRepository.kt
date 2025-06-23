package fundamentos.J_collections.repository

import fundamentos.J_collections.model.Cliente

class ClienteRepository( ) {

    companion object{
        private var bd : MutableList<Cliente> = mutableListOf()
    }

    fun salvar(cliente: Cliente) : Cliente {
        bd.add(cliente)
        return cliente
    }

    fun delele(cliente: Cliente): Boolean {
        bd.remove(cliente)
        return !bd.contains(cliente)
    }

    fun buscar(cliente: Cliente) : Any? {
        var clienteVazio:Any? = null

        var iterator = bd.iterator()
        while (iterator.hasNext()){
            var proximoCliente = iterator.next()
            if (cliente == proximoCliente){
                clienteVazio = proximoCliente
                break
            }
        }

        return clienteVazio
    }

    fun buscarTodos () : List<Cliente> {
        return bd
    }


    /**
     * @author diogenesssantos
     *
     * TODO ainda vair sre implementado
     */
    fun atualizar(idCliente : Int , cliente: Cliente ) : Cliente? {
        return null

    }



}