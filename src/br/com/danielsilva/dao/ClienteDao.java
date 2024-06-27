package br.com.danielsilva.dao;

import br.com.danielsilva.dao.generics.GenericDAO;
import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.domain.Persistente;

public class ClienteDao extends GenericDAO<Cliente> implements IClienteDao{

    public ClienteDao(){
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

}
