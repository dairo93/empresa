package service;

import model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EmpresaRepository;

import java.util.ArrayList;
import java.util.List;

public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public List<Empresa> verEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;
    }

    public void crearEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }
    public void eliminarEmpresa(Long id){
        empresaRepository.deleteById(id);
    }
    public void crearYActualizarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);

    }
}
