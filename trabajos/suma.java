import java.util.Scanner;

class suma{
    public static void main(String []args){ 
        
        Scanner reader = new Scanner(System.in);

int numero1 = 0;
int numero2 = 0;
int numero3 = 0;
  
System.out.println("introduce el primer valor:");      
numero1 = reader.nextInt();
      
System.out.println("introduce el segundo valor:");
numero2 = reader.nextInt();

System.out.println("introduce el tercer valor:");
numero3 = reader.nextInt();

int resultado = numero1+numero2+numero3;

System.out.println("El resultado de la suma es: " + resultado);

}
  
}



