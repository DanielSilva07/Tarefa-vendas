package br.com.danielsilva.services;

import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

  public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarcpf(Long cpf);


}
