//public class mencobaMembuatParameter {
   // static void nama(String matKul) {  //jangan lupa kasih matkul itu masuk kemana
       // System.out.println("basis data"+ "\t"+matKul);
   // }
    //public static void main(String[] args) {
       // nama("ludmilla Riza maharuni");
      //  nama("icas");
    //}
//}

public class mencobaMembuatParameter{
    static void checkAge(int age) {
        if (age < 18){
            System.out.println("Access denied - You are not old enough!");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
