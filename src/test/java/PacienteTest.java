import br.com.animati.entity.Paciente;
import br.com.animati.entity.PacienteCrudImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PacienteTest {
    private static PacienteCrudImpl pacienteCrud;
    
    @BeforeClass
    public static void initPacienteCrud(){
        pacienteCrud = new PacienteCrudImpl();
    }
    
    @Test
    public void testAdd() throws ParseException {
        int size = pacienteCrud.getPacientes().size();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Paciente paciente = new Paciente();
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
    public void testDeleteComErro(){
        int size = pacienteCrud.getPacientes().size();
        pacienteCrud.delete(1000);
        size--;

        Assert.assertEquals(size, pacienteCrud.getPacientes().size());
    }



}
