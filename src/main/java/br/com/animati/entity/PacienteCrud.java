package br.com.animati.entity;

import java.util.List;

public interface PacienteCrud {

    public void add(Paciente paciente);
    public void edit(Paciente paciente);
    public List<Paciente> list();
    public void delete(long idPaciente);
    public Paciente findById(long idPaciente);

}
