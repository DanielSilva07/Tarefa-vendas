package br.com.danielsilva.dao.generics;
import br.com.danielsilva.domain.Persistente;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

    public interface IGenericDAO <T extends Persistente> {

        /**
         * Método para cadastrar novos registro no banco de dados
         *
         * @param entity a ser cadastrado
         * @return retorna verdadeiro para cadastrado e falso para não cadastrado
         */
        public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

        /**
         * Método para excluir um registro do banco de dados
         *
         * @param valor chave única do dado a ser excluído
         */
        public void excluir(Long valor);

        /**
         * Método para alterar um registro no bando de dados.
         *
         * @param entity a ser atualizado
         */
        public void alterar(T entity) throws TipoChaveNaoEncontradaException;

        /**
         * Método para consultar um registro no banco de dados
         *
         * @param valor chave única do dado a ser consultado
         * @return
         */
        public T consultar( Long valor);

        /**
         * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
         *
         * @return Registros encontrados
         */
        public Collection<T> buscarTodos();

    }


