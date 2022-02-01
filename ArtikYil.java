import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int year,kalan,kalan2,kalan3;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı Giriniz : ");
        year = input.nextInt();

        kalan = year%4;
        kalan2 = year%100;
        kalan3 = year%400;

        if (kalan==0){
            if (kalan2==0){
                if (kalan3==0){
                    System.out.println(year + " bir artık yıldır!");
                }
                else {
                    System.out.println(year + " bir artık yıl değildir!");
                }

            }
            else {
                System.out.println(year + " bir artık yıldır!");
            }
        }
        else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
