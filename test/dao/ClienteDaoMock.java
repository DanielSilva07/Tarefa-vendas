package dao;

import br.com.danielsilva.dao.IClienteDao;
import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDao {


//    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

//    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return null;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente= new Cliente();
        cliente.setCpf(valor);

        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }

//    @Override
//    public void excluir(Serializable valor) {
//
//    }
//
//    @Override
//    public Cliente consultar(Serializable valor) {
//        return null;
//    }
}
