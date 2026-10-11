public class perkalian {
    public static void main(String[] args ){
        for(int i=1; i <=4; i++){
            for(int j= 1; j<=4; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
        int number = 2;

// Print the multiplication table for the number 2
for (int i = 1; i <= 10; i++) {
  System.out.println(number + " x " + i + " = " + (number * i));
}

//faktorial
int n =5;
int fact =1;
for( int e =0; e <=n; e++){
    fact*=e;
}
System.out.println("Factorial of " + n + " is " + fact);
    }
}
