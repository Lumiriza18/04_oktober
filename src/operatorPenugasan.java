public class operatorPenugasan {
    public static void main(String[] args) {
    int nilai =10;
    nilai += 5;
    System.out.println(nilai);

    int a=19;
    a-=9;
    System.out.println(a);

    int b=20;
    b/=4;
    System.out.println(b);

    int c= 100;
    c%=3;
    System.out.println(c);

    int d=170;
    c&=80;
    System.out.println(c);
    
    int f= 34;
    int e=45;
    boolean h = e<=f;
    System.out.println( h);

    int age =18;
    System.out.println(age<10 && age<15);
    System.out.println(age<10 || age<15);
    System.out.println(!(age<10 && age<15));
    System.out.println(age < 20);
    System.out.println(age<=18);

    boolean isLoggedln = true;
    boolean isAdmin =false;
    System.out.println("Regular user:"+ (isLoggedln && !isAdmin));
    System.out.println("has access:"+(isLoggedln || isAdmin));
    System.out.println("Not loggedin:" + (!isLoggedln));
    }
}
