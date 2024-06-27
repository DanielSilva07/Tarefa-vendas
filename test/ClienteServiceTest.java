import br.com.danielsilva.dao.IClienteDao;
import br.com.danielsilva.domain.Cliente;
import br.com.danielsilva.domain.ClienteService;
import br.com.danielsilva.exceptions.TipoChaveNaoEncontradaException;
import br.com.danielsilva.services.IClienteService;
import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDao dao =  new ClienteDaoMock();
        clienteService = new ClienteService(dao);

    }
    @Before
    public void init(){
         cliente = new Cliente();
        cliente.setCpf(1234L);
        cliente.setNome("Daniel");

    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarcpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

    }
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteService.salvar(cliente);

    }
//    @Test
//    public void excluirCliente()  {
//        clienteService.excluir(cliente.getCpf());
//
//    }




}