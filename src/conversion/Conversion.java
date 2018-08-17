/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author Francisco
 */
public class Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 25;
        int binario;
        int [] vector =new int[100];
        int cont=0;
        String cadena="", cadena2="";
        while(numero>0){
            binario=numero%2;
            numero=numero/2;
            cadena=cadena+binario;     
            
        }
         System.out.println(cadena);
         for(int i=cadena.length()-1; i>=0; i--){
             cadena2=cadena2+cadena.charAt(i);
         }
         System.out.println(cadena2);
         System.out.println("Hexadecimal");
         /*---------------------------------------------------Hexadecimal------------------------------------------------------------------------------------*/
         int number= 6898;
         int bin;
         String cad="",cad2="";
         while(number>0){
             bin=number%16;
             number=number/16;
             if(bin==10){
                 cad=cad+"A";
             }else if(bin == 11){
                 cad=cad+"B";
             }else if(bin == 12){
                 cad=cad+"C";
             }else if(bin == 13){
                 cad=cad+"D";
             }else if(bin == 14){
                 cad=cad+"E";
             }else if(bin == 15){
                 cad=cad+"F";
             }else{
             cad=cad+bin;
             }
         }
         System.out.println(cad);
         for(int i=cad.length()-1; i>=0; i--){
             cad2=cad2+cad.charAt(i);
         }
         System.out.println(cad2);
         System.out.println("Octal");
         /*---------------------------------------------------Octal------------------------------------------------------------------------------------*/
          number= 255;
          bin=0;
          cad="";
          cad2="";
          
          while(number>0){
             bin=number%8;
             number=number/8;
            
             cad=cad+bin;
             
         }
         System.out.println(cad);
         for(int i=cad.length()-1; i>=0; i--){
             cad2=cad2+cad.charAt(i);
         }
         System.out.println(cad2);
         
         
         
    }
    
}
