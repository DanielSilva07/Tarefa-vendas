package br.com.danielsilva.domain;

import br.com.danielsilva.dao.IClienteDao;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;
import br.com.danielsilva.services.IClienteService;

public class ClienteService implements IClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
       this.clienteDao =  clienteDao;
    }


    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDao.cadastrar(cliente);
    }

    @Override
    public Cliente buscarcpf(Long cpf) {
        return clienteDao.consultar((cpf));
    }
}
