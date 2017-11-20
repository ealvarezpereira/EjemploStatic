package ejemploatributosobjetos;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class EjemploAtributosObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta objCuenta = new Cuenta("millonetis","111111",10000000);
        System.out.println(objCuenta.saldoFinal(0));
        
        System.out.println("Juro= "+Cuenta.juro); //Variable de clase, no es privada y puedo acceder a ella
                                    //Variable estatica a traves de la clase
        System.out.println("Saldo= "+objCuenta.saldo); //Es una variable de instancia, se puede acceder a traves del obj.
                                    //Variable no estatica a traves de un objeto
        
       
       
       
        System.out.println("Juro= "+ Cuenta.getJuro()); //Al "juro" ser privado hay que acceder a traves del metodo getJuro.
    }
    
}
