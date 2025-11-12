import java.util.Scanner; 
 public class Potencia{
  public static void main(String [] args){ 
    Scanner sc= new Scanner(System.in); 
    int base,poten, resultado=1; 
   System.out.println("Ingresa la base"); 
  base=sc.nextInt(); 
   System.out.println("Ingresa la potencia"); 
  poten=sc.nextInt();
   for(int i=1;i<=poten;i++){
  resultado *=base;
  } 
   System.out.println("La base es " + base + " elevado a " + poten + " da como resultado: " + resultado);
   sc.close();
  }
}