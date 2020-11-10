import br.com.animati.entity.Paciente;
import br.com.animati.entity.PacienteCrudImpl;
import org.junit.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PacienteTest {
    private static PacienteCrudImpl pacienteCrud;
    private Paciente paciente;
    private Paciente paciente2;
    private Paciente paciente3;
    
    @Before
    public void initPacienteCrud() throws ParseException {
        pacienteCrud = new PacienteCrudImpl();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        paciente = new Paciente();
        paciente.setIdPaciente(1);
        paciente.setEmpresa(1);
        paciente.setNome("João das coves");
        paciente.setNomeSocial("João das coves Ltda");
        paciente.setNome("Josefina das coves");
        paciente.setCpf("123456789");
        paciente.setPassword("123");
        paciente.setRg("85291033");
        paciente.setSexo("M");
        paciente.setDataNascimento(format.parse("01/05/1950"));
        paciente.setCep("85501-550");
        paciente.setEndereco("Rua sem saída");
        paciente.setNumero(35);
        paciente.setComplemento("Barraco");
        paciente.setBairro("Santa Felicidade");
        paciente.setMunicipio("Catanduvas");
        paciente.setProfissao("Chapeador");
        paciente.setNacionalidade("Porto riquenho");
        paciente.setEmail("falecomjoao@gmail.com");
        paciente.setTelefone("12214545454");
        paciente.setTelefoneCelular("190");
        paciente.setTelefoneTrabalho("1810");
        paciente.setPatId(1);
        paciente.setCartaSus("987985471651321");

        pacienteCrud.add(paciente);

        paciente2 = new Paciente();
        paciente2.setIdPaciente(2);
        paciente2.setEmpresa(1);
        paciente2.setNome("Jose das coves");
        paciente2.setNomeSocial("Jose das coves Ltda");
        paciente2.setNome("Josefina das coves");
        paciente2.setCpf("123456789");
        paciente2.setPassword("123");
        paciente2.setRg("85291033");
        paciente2.setSexo("M");
        paciente2.setDataNascimento(format.parse("01/05/1950"));
        paciente2.setCep("85501-550");
        paciente2.setEndereco("Rua sem saída");
        paciente2.setNumero(35);
        paciente2.setComplemento("Barraco");
        paciente2.setBairro("Santa Felicidade");
        paciente2.setMunicipio("Catanduvas");
        paciente2.setProfissao("Chapeador");
        paciente2.setNacionalidade("Porto riquenho");
        paciente2.setEmail("falecomjoao@gmail.com");
        paciente2.setTelefone("12214545454");
        paciente2.setTelefoneCelular("190");
        paciente2.setTelefoneTrabalho("1810");
        paciente2.setPatId(1);
        paciente2.setCartaSus("987985471651321");

        pacienteCrud.add(paciente2);

        paciente3 = new Paciente();
        paciente3.setIdPaciente(1);
        paciente3.setEmpresa(1);
        paciente3.setNome("João das coves");
        paciente3.setNomeSocial("João das coves Ltda");
        paciente3.setNome("Josefina das coves");
        paciente3.setCpf("123456789");
        paciente3.setPassword("123");
        paciente3.setRg("85291033");
        paciente3.setSexo("M");
        paciente3.setDataNascimento(format.parse("01/05/1950"));
        paciente3.setCep("85501-550");
        paciente3.setEndereco("Rua sem saída");
        paciente3.setNumero(35);
        paciente3.setComplemento("Barraco");
        paciente3.setBairro("Santa Felicidade");
        paciente3.setMunicipio("Catanduvas");
        paciente3.setProfissao("Chapeador");
        paciente3.setNacionalidade("Porto riquenho");
        paciente3.setEmail("falecomjoao@gmail.com");
        paciente3.setTelefone("12214545454");
        paciente3.setTelefoneCelular("190");
        paciente3.setTelefoneTrabalho("1810");
        paciente3.setPatId(1);
        paciente3.setCartaSus("987985471651321");

        pacienteCrud.add(paciente3);



    }
    
    @Test
    public void testAdd() throws ParseException {
        int size = pacienteCrud.getPacientes().size();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Paciente paciente = new Paciente();
        paciente.setIdPaciente(3);
        paciente.setEmpresa(1);
        paciente.setNome("João das coves");
        paciente.setNomeSocial("João das coves Ltda");
        paciente.setNome("Josefina das coves");
        paciente.setCpf("123456789");
        paciente.setPassword("123");
        paciente.setRg("85291033");
        paciente.setSexo("M");
        paciente.setDataNascimento(format.parse("01/05/1950"));
        paciente.setCep("85501-550");
        paciente.setEndereco("Rua sem saída");
        paciente.setNumero(35);
        paciente.setComplemento("Barraco");
        paciente.setBairro("Santa Felicidade");
        paciente.setMunicipio("Catanduvas");
        paciente.setProfissao("Chapeador");
        paciente.setNacionalidade("Porto riquenho");
        paciente.setEmail("falecomjoao@gmail.com");
        paciente.setTelefone("12214545454");
        paciente.setTelefoneCelular("190");
        paciente.setTelefoneTrabalho("1810");
        paciente.setPatId(1);
        paciente.setCartaSus("987985471651321");

        pacienteCrud.add(paciente);
        size++;

        Assert.assertEquals(size, pacienteCrud.getPacientes().size());
        
    }

    @Test
    public void testEdit(){
        Paciente paciente = pacienteCrud.getPacientes().get(0);

        paciente.setNome("Rubens Barrichello");

        Assert.assertEquals(paciente.getNome(),"Rubens Barrichello");
    }


    @Test
    public void testDelete(){
        int size = pacienteCrud.getPacientes().size();
        pacienteCrud.delete(1);
        size--;

        Assert.assertEquals(size, pacienteCrud.getPacientes().size());
    }

    @Test
    @Ignore
    public void testDeleteComErro(){
        int size = pacienteCrud.getPacientes().size();
        pacienteCrud.delete(1000);
        size--;

        Assert.assertEquals(size, pacienteCrud.getPacientes().size());
    }



}
