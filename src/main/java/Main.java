import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
  int x = 1;
  int y = 1;
    while ( x != 0 && y != 0){
      System.out.println(" digite as cordenadas");
      x = sc.nextInt();
      y = sc.nextInt();
      if (x > 0 && y > 0){
        System.out.println("primeiro quadrante");
      } else if (x < 0 && y > 0){
        System.out.println("segundo quadrante");
      } else if (x < 0 && y > 0){
        System.out.println("terceiro quadrante");
      }else if (x >0 && y <0) {
        System.out.println("quarto quadrante");
      }




    }



  }


}