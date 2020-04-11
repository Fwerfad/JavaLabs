  package lab1;
/**
* 1 task at 1 lab
* @author Rotsinskiy Ivan
* @version 1.0
*/
/**
 * Main class which include main function
 */
public class Main {
    public static void main(final String[] args) {
        System.out.println("Starting project");
        byte byte_v = 122; //(-128; 127)
        short short_v = 2000; //(-32768; 32767)
        int int_v = 20000; //(-2147483648; 2147483647)
        long long_v = 200000; //(-9223372036854775808; 9223372036854775807)
        float float_v = 200.1f; //(~1,4*10-45; ~3,4*1038)
        double double_v = 3000.3211; //(~4,9*10-324; ~1,8*10308)
        char char_v ='#'; 
        boolean boolean_v = true; 
        System.out.println("byte = "+byte_v);
        System.out.println("short = "+short_v);
        System.out.println("int = "+int_v);
        System.out.println("long = "+long_v);
        System.out.println("float = "+float_v);
        System.out.println("double = "+double_v);
        System.out.println("char = "+char_v);
        System.out.println("boolean = "+boolean_v);  

        byte_v = 120;
        short_v = 129; 
        char_v = 'a';
        int_v = 65999; 
        long_v = 4294967296l; 
        float_v = 0.33333334f;
        double_v = 0.3333333333333333;
        boolean_v = true; 

        
        for(int i = 97; i<=122; i++){ 
            System.out.println((char)i);
        }

        long begin = new java.util.Date().getTime();
        for( int i = 0; i<100000000; i++){
             
        }
        long end = new java.util.Date().getTime();
        System.out.println("end - begin = (int) " +(end - begin));

        
        begin = new java.util.Date().getTime();
        for( long i = 0; i<100000000; i++){
        
        }
        end = new java.util.Date().getTime();
        System.out.println("end - begin = (long) " +(end - begin));

        
        int [] mas = {12,43,12,-65,778,123,32,76};
        int max = mas[0];

        for(int i = 0; i < mas.length; i++){
            if(max < mas[i]){
                max = mas[i];
            }
        }
        System.out.println("max from mas = " +max +'\n');

        int [][] matrix = new int [3][3];

         for(int i=0; i<3; i++){
             for(int j=0; j<3; j++){
                 matrix[i][j]=(int)Math.round(Math.random()*10);
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.print('\n');
         }
         System.out.print('\n');
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.print('\n');
        } 


    }
}