import java.util.Scanner; 
 public class Piramide{
  public static void main(String [] args){ 
   Scanner sc= new Scanner(System.in); 
    int num;
   System.out.println("Ingresa la altura de la pirámide"); 
  num=sc.nextInt(); 
   for(int i=1;i<=num;i++){
     for(int j=1;j<=num-i;j++){
   }
    for(int n=1;n<=2*i-1;n++){
    System.out.print("*");
      }
   System.out.println();
  sc.close();
  }
}
  } 