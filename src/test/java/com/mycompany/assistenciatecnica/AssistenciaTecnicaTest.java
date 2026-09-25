package com.mycompany.assistenciatecnica;

import com.mycompany.assistenciatecnica.dao.ClienteDao;
import com.mycompany.assistenciatecnica.model.Cliente;
import com.mycompany.assistenciatecnica.model.Equipamento;
import com.mycompany.assistenciatecnica.model.OrdemServico;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

public class AssistenciaTecnicaTest {

    @BeforeAll
    public static void criarTabelasParaTeste() {
        try (java.sql.Statement stmt = com.mycompany.assistenciatecnica.dao.Conexao.getConexao().createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS clientes ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "nome TEXT NOT NULL, "
                    + "email TEXT NOT NULL UNIQUE, "
                    + "telefone TEXT, "
                    + "senha TEXT NOT NULL)");
            stmt.execute("CREATE TABLE IF NOT EXISTS equipamentos ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "cliente_id INTEGER NOT NULL, "
                    + "tipo TEXT NOT NULL, "
                    + "marca TEXT NOT NULL, "
                    + "modelo TEXT NOT NULL, "
                    + "numero_serie TEXT)");
            stmt.execute("CREATE TABLE IF NOT EXISTS ordem_servico ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "cliente_id INTEGER NOT NULL, "
                    + "equipamento_id INTEGER NOT NULL, "
                    + "data_solicitacao TEXT NOT NULL, "
                    + "defeito TEXT NOT NULL, "
                    + "status TEXT NOT NULL DEFAULT 'Aberta')");
        } catch (java.sql.SQLException e) {
            System.err.println("Erro ao criar tabelas de teste: " + e.getMessage());
        }
    }

    private final ClienteDao clienteDao = new ClienteDao();

    @Test
    public void deveCriarClienteComDadosCorretos() {
        Cliente c = new Cliente();
        c.setNome("João");
        c.setEmail("joao@email.com");
        c.setTelefone("11988887777");
        c.setSenha("abc123");

        assertEquals("João", c.getNome());
        assertEquals("joao@email.com", c.getEmail());
        assertEquals("11988887777", c.getTelefone());
        assertEquals("abc123", c.getSenha());
    }

    @Test
    public void deveCriarEquipamentoComDadosCorretos() {
        Equipamento e = new Equipamento();
        e.setClienteId(1);
        e.setTipo("Notebook");
        e.setMarca("Dell");
        e.setModelo("Inspiron 15");
        e.setNumeroSerie("SN12345");

        assertEquals(1, e.getClienteId());
        assertEquals("Notebook", e.getTipo());
        assertEquals("Dell", e.getMarca());
        assertEquals("Inspiron 15", e.getModelo());
        assertEquals("SN12345", e.getNumeroSerie());
    }

    @Test
    public void deveCriarOrdemServicoComStatusAberta() {
        OrdemServico os = new OrdemServico();
        os.setClienteId(1);
        os.setEquipamentoId(1);
        os.setDataSolicitacao("2026-09-24");
        os.setDefeito("Não liga");
        os.setStatus("Aberta");

        assertEquals(1, os.getClienteId());
        assertEquals(1, os.getEquipamentoId());
        assertEquals("2026-09-24", os.getDataSolicitacao());
        assertEquals("Não liga", os.getDefeito());
        assertEquals("Aberta", os.getStatus());
    }

    @Test
    public void deveCadastrarCliente() {
        String email = "cadastro" + System.currentTimeMillis() + "@email.com";
        Cliente c = new Cliente();
        c.setNome("Cliente Teste");
        c.setEmail(email);
        c.setTelefone("11999999999");
        c.setSenha("1234");

        boolean cadastrou = clienteDao.cadastrar(c);
        assertTrue(cadastrou, "Deveria cadastrar o cliente");

        Cliente encontrado = clienteDao.buscarPorEmailESenha(email, "1234");
        assertNotNull(encontrado, "Deveria encontrar o cliente recém-cadastrado");
        assertEquals("Cliente Teste", encontrado.getNome());
    }

    @Test
    public void deveRetornarNullParaCredenciaisInvalidas() {
        Cliente encontrado = clienteDao.buscarPorEmailESenha("naoexiste@email.com", "errada");
        assertNull(encontrado, "Não deveria encontrar cliente com credenciais erradas");
    }

    @Test
    public void deveDetectarEmailJaCadastrado() {
        String email = "duplicado" + System.currentTimeMillis() + "@email.com";
        Cliente c = new Cliente();
        c.setNome("Duplicado");
        c.setEmail(email);
        c.setSenha("1234");
        clienteDao.cadastrar(c);

        assertTrue(clienteDao.emailJaCadastrado(email), "E-mail recém-cadastrado deve ser detectado");
        assertFalse(clienteDao.emailJaCadastrado("naoexiste@email.com"), "E-mail inexistente deve retornar false");
    }

    @Test
    public void deveListarClientesCadastrados() {
        String email = "lista" + System.currentTimeMillis() + "@email.com";
        Cliente c = new Cliente();
        c.setNome("Cliente Lista");
        c.setEmail(email);
        c.setSenha("1234");
        clienteDao.cadastrar(c);

        List<Cliente> lista = clienteDao.listarTodos();
        assertFalse(lista.isEmpty(), "A lista não deveria estar vazia");

        boolean achou = lista.stream().anyMatch(cli -> email.equals(cli.getEmail()));
        assertTrue(achou, "A lista deveria conter o cliente cadastrado");
    }

    @Test
    public void deveAtualizarCliente() {
        String email = "atualizar" + System.currentTimeMillis() + "@email.com";
        Cliente c = new Cliente();
        c.setNome("Antes");
        c.setEmail(email);
        c.setSenha("1234");
        clienteDao.cadastrar(c);

        Cliente salvo = clienteDao.buscarPorEmailESenha(email, "1234");
        salvo.setNome("Depois");
        boolean atualizou = clienteDao.atualizar(salvo);
        assertTrue(atualizou, "Deveria atualizar o cliente");

        Cliente reBusca = clienteDao.buscarPorEmailESenha(email, "1234");
        assertEquals("Depois", reBusca.getNome(), "O nome deveria ter sido atualizado");
    }

    @Test
    public void deveExcluirCliente() {
        String email = "excluir" + System.currentTimeMillis() + "@email.com";
        Cliente c = new Cliente();
        c.setNome("Excluir");
        c.setEmail(email);
        c.setSenha("1234");
        clienteDao.cadastrar(c);

        Cliente salvo = clienteDao.buscarPorEmailESenha(email, "1234");
        boolean excluiu = clienteDao.excluir(salvo.getId());
        assertTrue(excluiu, "Deveria excluir o cliente");

        Cliente reBusca = clienteDao.buscarPorEmailESenha(email, "1234");
        assertNull(reBusca, "O cliente excluído não deveria ser encontrado");
    }

    @Test
    public void naoDeveAceitarTelefoneComVirgula() {
        assertFalse(Validacoes.telefoneValido("11,9999-9999"), "Vírgula deve ser rejeitada");
        assertFalse(Validacoes.telefoneValido("11.9999.9999"), "Ponto deve ser rejeitado");
        assertFalse(Validacoes.telefoneValido("1199999999,1"), "Vírgula decimal deve ser rejeitada");
    }

    @Test
    public void naoDeveAceitarTelefoneNegativo() {
        assertFalse(Validacoes.telefoneValido("-1199999999"), "Sinal negativo deve ser rejeitado");
        assertFalse(Validacoes.telefoneValido("11999999999-"), "Negativo no final deve ser rejeitado");
    }

    @Test
    public void naoDeveAceitarTelefoneComLetrasOuCurto() {
        assertFalse(Validacoes.telefoneValido("1199999a999"), "Letras devem ser rejeitadas");
        assertFalse(Validacoes.telefoneValido("(11)99999-9999"), "Máscara deve ser rejeitada");
        assertFalse(Validacoes.telefoneValido("1234"), "Número curto deve ser rejeitado");
        assertFalse(Validacoes.telefoneValido(""), "Vazio deve ser rejeitado");
        assertFalse(Validacoes.telefoneValido(null), "Null deve ser rejeitado");
    }

    @Test
    public void deveAceitarTelefoneValido() {
        assertTrue(Validacoes.telefoneValido("11999999999"), "Celular com 11 dígitos é válido");
        assertTrue(Validacoes.telefoneValido("1133334444"), "Fixo com 10 dígitos é válido");
    }

    @Test
    public void naoDeveAceitarEmailInvalido() {
        assertFalse(Validacoes.emailValido(""), "Vazio deve ser rejeitado");
        assertFalse(Validacoes.emailValido("semarroba"), "Sem @ deve ser rejeitado");
        assertFalse(Validacoes.emailValido("@semnome"), "Sem nome antes do @ deve ser rejeitado");
        assertFalse(Validacoes.emailValido("nome@"), "Sem domínio deve ser rejeitado");
        assertFalse(Validacoes.emailValido("nome@dominio"), "Sem ponto no domínio deve ser rejeitado");
        assertFalse(Validacoes.emailValido("nome@.dominio"), "Ponto no início do domínio deve ser rejeitado");
        assertFalse(Validacoes.emailValido(null), "Null deve ser rejeitado");
    }

    @Test
    public void deveAceitarEmailValido() {
        assertTrue(Validacoes.emailValido("cliente@email.com"));
        assertTrue(Validacoes.emailValido("cliente.teste@email.com.br"));
    }

    @Test
    public void naoDeveAceitarCamposObrigatoriosVazios() {
        assertFalse(Validacoes.textoPreenchido(""), "Campo vazio deve ser rejeitado");
        assertFalse(Validacoes.textoPreenchido("   "), "Só espaços deve ser rejeitado");
        assertFalse(Validacoes.textoPreenchido(null), "Null deve ser rejeitado");
        assertTrue(Validacoes.textoPreenchido("João"), "Texto preenchido é válido");
    }

    @Test
    public void naoDeveAceitarNomeComNumeros() {
        assertFalse(Validacoes.nomeValido("João 123"), "Número no nome deve ser rejeitado");
        assertFalse(Validacoes.nomeValido("João@"), "Símbolo no nome deve ser rejeitado");
        assertFalse(Validacoes.nomeValido(""), "Vazio deve ser rejeitado");
        assertTrue(Validacoes.nomeValido("João da Silva"), "Nome com letras e espaços é válido");
    }

}
