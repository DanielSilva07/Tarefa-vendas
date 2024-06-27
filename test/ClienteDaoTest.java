import br.com.danielsilva.dao.ClienteDao;
import br.com.danielsilva.dao.IClienteDao;
import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;
import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

    private Cliente cliente;
    private IClienteDao clienteDao;

    public ClienteDaoTest(){
        clienteDao = new ClienteDaoMock();
    }
    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(1234L);
        cliente.setNome("Daniel");



    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

//    public void salvarCliente() throws TipoChaveNaoEncontradaException {
//        cliente.setCpf("123");
//        boolean retorno = cliente.cadastrar(cliente);
//        Assert.assertTrue(retorno);
//    }
}
