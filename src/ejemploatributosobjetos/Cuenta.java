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
public class Cuenta {
    
    private Personas titular;
     double saldo; //Este no es estatico
     static float juro = 0.04f; //Juro está declarado como estatico
    
    public Cuenta(){   
            titular = new Personas();
    }
    
    public Cuenta(String nom, String DNI, double saldo){   
        titular = new Personas();
        titular.setNombre(nom);
        titular.setDNI(DNI);
        this.saldo = saldo;    
    }
    
    public void setTitular (Personas titular){    
        this.titular= titular;    
    }
    
    public Personas getTitular(){    
        return titular;        
    }
    
    public void setSaldo(double saldo){    
        this.saldo = saldo;    
    }
    
    public double getSaldo(){    
        return saldo;    
    }
    
    
    public double saldoFinal(double sal){ //Un metodo no estatico tiene acceso a variables estaticas y no estaicas
        return saldo + saldo * juro;
    
    }
    
    
  /* public static double finalSaldo(){ //Un metodo estatico sólo tiene acceso a las variables estáticas
   
       double sal;
       sal = saldo + saldo * juro;  //sal es una variable estatica
   
   }*/
    
    public static double getJuro(){ //Desde un metodo estatico puedes acceder a un metodo estatico
        
        return juro;
    
    }
    
    
    @Override
    public String toString(){
    
        return "Titular= "+titular.getNombre()+ "  Saldo= " +saldo+"  Titular= "+titular.getDNI();
    
    }
    
}