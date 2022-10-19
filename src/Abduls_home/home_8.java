package Abduls_home;

public class home_8 {
    public static void main(String[] args) {
        String firstname= "Abo";
        String lastname="Haji";
        int creditscore= 760;

        if (creditscore < 500) System.out.println(firstname + " " + lastname" bad credit score");
        else if( creditscore<=500 && creditscore>700){
            System.out.println(firstname+" "lastname+" average credit score");
        else if(creditscore>=700 && creditscore<750){
            System.out.println(firstname+" "+lastname+" good credit score ");
        }else
            System.out.println(firstname+" "+lastname+ " excellent credit score ");
    }
}
