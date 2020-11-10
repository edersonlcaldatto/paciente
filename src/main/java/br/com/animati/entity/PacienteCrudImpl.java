package br.com.animati.entity;

import java.util.ArrayList;
import java.util.List;

public class PacienteCrudImpl implements PacienteCrud {

    private ArrayList<Paciente> pacientes;

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public PacienteCrudImpl() {
        this.pacientes = new ArrayList<Paciente>();
    }

    public void add(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void edit(Paciente paciente) {
        Paciente pacienteToEdit = findById(paciente.getIdPaciente());
        if(pacienteToEdit != null){
            pacienteToEdit.setEmpresa(paciente.getEmpresa());
            pacienteToEdit.setNome(paciente.getNome());
            pacienteToEdit.setNomeSocial(paciente.getNomeSocial());
            pacienteToEdit.setNome(paciente.getNomeMae());
            pacienteToEdit.setCpf(paciente.getCpf());
            pacienteToEdit.setPassword(paciente.getPassword());
            pacienteToEdit.setRg(paciente.getRg());
            pacienteToEdit.setSexo(paciente.getSexo());
            pacienteToEdit.setDataNascimento(paciente.getDataNascimento());
            pacienteToEdit.setCep(paciente.getCep());
            pacienteToEdit.setEndereco(paciente.getEndereco());
            pacienteToEdit.setNumero(paciente.getNumero());
            pacienteToEdit.setComplemento(paciente.getComplemento());
            pacienteToEdit.setBairro(paciente.getBairro());
            pacienteToEdit.setMunicipio(paciente.getMunicipio());
            pacienteToEdit.setProfissao(paciente.getProfissao());
            pacienteToEdit.setNacionalidade(paciente.getNacionalidade());
            pacienteToEdit.setEmail(paciente.getEmail());
            pacienteToEdit.setTelefone(paciente.getTelefone());
            pacienteToEdit.setTelefoneCelular(paciente.getTelefoneCelular());
            pacienteToEdit.setTelefoneTrabalho(paciente.getTelefoneTrabalho());
            pacienteToEdit.setPatId(paciente.getPatId());
            pacienteToEdit.setCartaSus(paciente.getCartaSus());
        }else{
            System.out.println("Paciente não localizado.");
        }
    }

    public List<Paciente> list() {
        return pacientes;
    }

    public void delete(long idPaciente) {
        Paciente paciente = findById(idPaciente);
        if(paciente != null){
            pacientes.remove(paciente);
        }else{
            System.out.println("Paciente não localizado.");
        }
    }

    public Paciente findById(long idPaciente) {
        Paciente pacienteLocate;

        for (int i = 0; i < pacientes.size(); i++) {
            pacienteLocate = pacientes.get(i);
            if (pacienteLocate.getIdPaciente() == idPaciente){
                return pacienteLocate;
            }
        }
        return null;
    }
}
