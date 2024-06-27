package br.com.danielsilva.dao;

import br.com.danielsilva.dao.generics.GenericDAO;
import br.com.danielsilva.dao.generics.IGenericDAO;
import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.domain.Persistente;
import br.com.danielsilva.services.IClienteService;

public interface IClienteDao extends IGenericDAO<Cliente> {


}
