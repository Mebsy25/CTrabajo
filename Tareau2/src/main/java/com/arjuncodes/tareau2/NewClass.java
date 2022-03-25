
package com.arjuncodes.tareau2;

import javax.swing.JOptionPane;

public class NewClass {
    
    public static void main (String[] args){
        
    int opcion = 0;
    String arbol="";
    int primo,x,n,j,z,i,impar;
    int contador1 = 0;
    int y = 0;
     
        
        while (opcion != 4){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" 1: Crear un arbol \n 2: Conocer numeros impares \n 3: Conocer numeros primos \n 4: Salir " ));
            
            if (opcion == 1){
                
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                
                for ( i = 0; i < n; i++ )
                {
                    for ( j = n-1-i; j >=0; j--)
                    {
                    arbol = arbol + " ";
                    }
                    for ( j = 0; j <=i; j++) 
                    {
                    arbol = arbol + "* "; 
                    }                
                    arbol = arbol + "\n";       
                }    
                JOptionPane.showMessageDialog(null,arbol );
                arbol="";
                }

            if (opcion == 2){
                
                impar = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")); 
                
                for( z = 0; z <= impar; z++)
                {
                    if ( z % 2 != 0 )
                {
                   contador1++;    
                }
                }
           
                JOptionPane.showMessageDialog(null,"La cantidad de numeros impares son " + contador1 );
                }
            
            if (opcion == 3){
               
                primo = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
                for (x = 1; x <= primo; x++)
                {
                    if(primo % x == 0 )
                    {
                        y++;                    
                    }
                }
                if (y != 2)
                {
                    JOptionPane.showMessageDialog(null,"No es primo");               
                }  
                else 
                {
                    JOptionPane.showMessageDialog(null,"Si es primo");
                }                         
                }

            if (opcion >=5){
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                }
        } 
    }   
}
