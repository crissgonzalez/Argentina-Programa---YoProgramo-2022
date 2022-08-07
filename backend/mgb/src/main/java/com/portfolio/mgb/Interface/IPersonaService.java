
package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
    
    
    //guardar un obejtos del tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    
}
