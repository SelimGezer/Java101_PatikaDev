package Kosullu_Ifadeler_Bolumu;

//Kosullu_Ifadeler_Odev1

//TODO Kullnıcı giriş programı yazınız
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
import java.util.Scanner;

public class Odev2_Pratik {
    public static void main(String[] args) {
        String userName="selim",password="gezer";

        String tempUsername,tempPassword;

        Scanner scanner=new Scanner(System.in);


        System.out.println("Kullanıcı adınızı giriniz:");
        tempUsername=scanner.nextLine();

        System.out.println("Kullanıcı şifrenizi giriniz:");
        tempPassword=scanner.nextLine();

        if(userName.equals(tempUsername) && password.equals(tempPassword)){
            System.out.println("Giriş işlemi başarı ile gerçekleşti!");
        }else{
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                System.out.println("Şifrenizi yenilemek ister misiniz? [E/H]");
                char select=scanner.next().charAt(0);
                switch (select) {
                    case 'E': {
                        String newPassword;
                                while (true){
                                    System.out.println("Yeni şifrenizi giriniz:");
                                newPassword=scanner.next();
                                if(password.equals(newPassword)){
                                    System.out.println("Şifreniz önceki şifrenizle aynı olamaz.");
                                }else{
                                    System.out.println("Şifreniz başarıyla değiştirildi!");
                                    System.out.println("\nGiriş bilgileriniz\nKullanıcı adınız:"+userName);
                                    System.out.println("Şifreniz:"+newPassword);
                                    break;
                                }
                            }
                        break;
                    }
                    case 'H': {
                        System.out.println("Sistem kapatıldı!");
                        break;
                    }
                    default: {
                        System.out.println("Geçersiz seçim yaptınız!");
                        break;
                    }
                }
        }
    }
}
