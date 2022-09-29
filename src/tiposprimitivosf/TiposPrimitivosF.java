
package tiposprimitivosf;


public class TiposPrimitivosF {
/*tipos primitivos
    
  *enteros
    -byte: 8 bites (-128 a 127) | Byte.MIN_VALUE - Byte.MAX_VALUE
    -short: 16 bits (-32768 a 32767) | Short.MIN_VALUE Short.MAX_VALUE
    -int : 12 bits | Integer.MIN_VALUE - Integer.MAX_VALUE 
    -long: 64 bits | Long.MIN_VALUE - Long.MAX_VALUE
 
    
    *Decimales: 
    -float: 32 bits
    -double 64 bits
        
    *caracter:
    -char: 16 bits
    
  */
  
    public static void main(String[] args) {
      /*enteros*/
        Byte enteroByte = 5;
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("Valor minimos del tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del tipo byte: " + Byte.MAX_VALUE);
        
        System.out.println("\n");
        
        Short entero = 1000;
        System.out.println("Short = " + entero);
        System.out.println("Valor minimos del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        
        System.out.println("\n");
            
        Integer enteroInt = 35000;
        System.out.println("Integer = " + enteroInt);
        System.out.println("Valor minimos del integer: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del integer: " + Integer.MAX_VALUE);
        
        System.out.println("\n");
        
        long enteroLong = 63000001;
        System.out.println("Long = " + enteroLong);
        System.out.println("Valor minimos del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " +Long.MAX_VALUE);
        
        System.out.println("\n");
        
        /*decimales*/
        
        float floatInt = 10.F;
        System.out.println("float = " + floatInt);
        System.out.println("Valor minimos del float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE);
        
        System.out.println("\n");
        
        double doubleInt = 2324.0323204;
        System.out.println("double = " + doubleInt);
        System.out.println("Valor minimos del double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del double: " +Double.MAX_VALUE);
        
        System.out.println("\n");       
        
        System.out.println("character");
        
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char segundoCaracter = '\u0021';
        System.out.println("segundoCaracter = " + segundoCaracter);
        
        char tercerCaracter = 33;
        System.out.println("tercerCaracter = " + tercerCaracter);
  
    }
    
}
