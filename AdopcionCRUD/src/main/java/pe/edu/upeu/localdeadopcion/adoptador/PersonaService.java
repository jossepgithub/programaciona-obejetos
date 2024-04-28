/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.localdeadopcion.adoptador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.localdeadopcion.model.Persona;

/**
 *
 * @author pc
 */
@Service
public class PersonaService {

    List<Persona> listaCli = new ArrayList<>();

    public boolean saveEntidad(Persona categoria) {
        return this.listaCli.add(categoria);
    }

    public List<Persona> listarEntidad() {
        return listaCli;
    }

    public Persona buscarCliente(String dnirucx) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDni().equals(dnirucx))
                .findFirst()
                .orElse(null); 
    }

    public Persona updateEntidad(Persona clientex) {
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDni().equals(clientex.getDni())) 
                .findFirst() 
                .ifPresent(cliente
                        -> cliente.setNombre(clientex.getNombre()));
        
        return buscarCliente(clientex.getDni());
    }

    public void deleteRegistEntdad(String dato) {
        this.listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDni().equals(dato))
                .findFirst().orElse(null));

    }
}