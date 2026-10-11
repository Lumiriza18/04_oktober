public class operalogikaKehidupannyta {
    public static void main(String[] args) {

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if (isLoggedIn && ( isAdmin|| securityLevel==2)){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }
        if(isLoggedIn && (isAdmin || !(securityLevel==1))){
            System.out.println("Access granted 2");
        }
        else{ System.out.println("Access denied");}

        //cara cariangka ganjil:
        int ganjil =5;
        if ( ganjil % 2 == 1){
            System.out.println("ini merupakan suatu nilai ganjil");
        }
        else{System.out.println(" ini bilangan genap");
        }

        int age = 20;
        if (age >= 18){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}
