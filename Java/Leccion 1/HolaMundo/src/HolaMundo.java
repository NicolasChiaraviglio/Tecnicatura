
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mega Tecnologia
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde java");
        
        /*int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);*/
         

        //Var - inferencia de tipos en java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        */ 
        //soutv + tab
        //para ejecutar shift + f6
        //Ejercicio de Concatenacion
        /*var usuario = "Nicolas";
        var titulo = "Estudiante";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(a + b);
        System.out.println(usuario + a + b);
        System.out.println(usuario + (a + b));
        */
        //Caracteres Especiales
        /*var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre);//\n salto de linea
        System.out.println("Tabulacion: \t" + nombre);//\t espacio tabulado
        System.out.println("\t\t.:Menu:.");//Ejemplo \t
        System.out.println("Retroseso: \b" + nombre);//\b borra un espacio hacia atras
        System.out.println("Comillas Simples: \'"+ nombre +"\'");//\' comillas simples
        System.out.println("Comillas Dobles: \""+ nombre +"\"");//\" comillas dobles
        */
        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();//nextLine: entrada del usuario
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("titulo2 = " + titulo2+" "+usuario2);*/
        /*
        //Tipos numericos Enteros
        byte numEnteroByte = 10;
        System.out.println("Valor minimo del byte:"+ Byte.MIN_VALUE);//-128
        System.out.println("Valor maximo del byte:"+ Byte.MAX_VALUE);//127
        //Rangos minimos y maximos del numero Byte
        
        short numEnteroShort = 10;
        System.out.println("Valor minimo del short: "+ Short.MIN_VALUE);//-32768
        System.out.println("Valor maximo del short: "+ Short.MAX_VALUE);//32767
        
        int numEnteroInt = 10;
        System.out.println("Valor minimo del int: "+ Integer.MIN_VALUE);//-2147483648
        System.out.println("Valor maximo del int: "+ Integer.MAX_VALUE);//2147483647
        
        long numEnteroLong = 10;
        System.out.println("Valor minimo del long: "+ Long.MIN_VALUE);//-9223372036854775808
        System.out.println("Valor maximo del long: "+ Long.MAX_VALUE);//9223372036854775807
        */
        //Tipos Numericos Enteros
        
        /*float numFloat = 10.0F;//F de float, indica que la literal es de tipo flotante
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);//1.4E-45
        System.out.println("El valor maximo de Float: " + Float.MAX_VALUE);//3.4028235E38
        
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: " + Double.MIN_VALUE);//4.9E-324
        System.out.println("El valor maximo de Double: " + Double.MAX_VALUE);//1.7976931348623157E308*/
        
        //Inferencia de tipos "var" y tipos primitivos
        
        /*var numEntero = 20;//Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        
        var numFloat = 10.0;//Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        
        //Tipos primitivos char
        
        /*char miVariableChar = 'a' ;
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024';//Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36;//Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';//Caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);*/
        
        //Tipos primitivos tipos booleanos
        
        boolean varBool = true;//a diferencia de python, true y false se escriben con minuscula
        
        System.out.println("varBool = " + varBool);
        
        if(varBool){       
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");          
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        

    }
}
