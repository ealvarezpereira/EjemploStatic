/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploatributosobjetos;

/**
 *
 * @author quique
 */
public class Personas {
    
    private String nombre;
    private String DNI;
    
    public Personas (){}
    
    public Personas(String nombre, String DNI){
    
        this.nombre = nombre;
        this.DNI = DNI;
    
    
    }
    
    
    public void setNombre (String nombre){
    
        this.nombre= nombre;
    }
    
    
    public String getNombre (){
    
        return nombre;
    }
    
    
    public void setDNI (String DNI){
    
        this.DNI = DNI;
    
    }
    
    
    public String getDNI (){
    
        return DNI;
    
    }
    
    
    @Override
    public String toString(){
    
        return "Nombre= " + nombre + ", DNI= " + DNI;
    
  
}
}