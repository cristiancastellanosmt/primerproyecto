/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author CRISTIAN CASTELLANOS
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String [] datos=new String[3];
        float peso;
        float altura;
        int edad;
        float imc;
        String riesgo = null;
        
        //datos = read().split(" ");
        datos=leer.nextLine().split(" ");
        peso=Float.parseFloat(datos[0]);
        altura=Float.parseFloat(datos[1]);
        edad=Integer.parseInt(datos[2]);
        imc=peso/(altura*altura);
        if (imc>=22){
            riesgo="Medio";
        }if (imc<22){
            riesgo="Bajo";
        }
        if (imc>=22 && edad>=45){
            riesgo="Alto";
        }
        if (peso>0 && peso <=150){
            if (altura>=0.1 && altura<=2.5){
                if (edad>=0 && edad <=110){
                    //DecimalFormat df =new DecimalFormat("#.0");
                    System.out.println(String.format("%.1f",imc)+" "+riesgo);
                }
        }
    }else {
            System.out.println("ERROR");
        }
    }
    
}
