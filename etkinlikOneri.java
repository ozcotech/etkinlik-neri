import java.util.Scanner;
public class etkinlikOneri {

  public static void main(String[] args) {

    int ısı;

    Scanner veri = new Scanner(System.in);

    System.out.println("Sıcaklığı Giriniz: ");

    ısı = veri.nextInt();

    if (ısı < 5){

      System.out.println("Kayak Yapmaya Gidebilirsiniz.");
    }

    else if(ısı >= 5 && ısı < 15){

      System.out.println("Sinemaya Gidebilirsiniz.");
    }

    else if(ısı >= 15 && ısı <= 25){

      System.out.println("Pikniğe Gidebilirsiniz");
    }

    else{

      System.out.println("Yüzmeye Gidebilirsiniz.");
    }
    

    veri.close();
  }
  
}
