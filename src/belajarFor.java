public class belajarFor {
    public static void main(String[] args) {
        for(int i = 1; i<5;i++){
            System.out.println(i);
        }
        System.out.println("-----------------");
        for( int p =0; p<10; p=p+2){
            System.out.println(p);
        }
        System.out.println("-----------------");
        for(int l= 10; l<=0; l=l%2){
            System.out.println(l);
        }
        int sum = 0;
        for (int v = 1; v <= 5; v++) {
            sum = sum + v;}
            System.out.println("Sum is " + sum);
        System.out.println("-----------------");
        for( int g =5; g>0;g--){
            System.out.println(g);
        }
        System.out.println("-----------------");
        for(int j = 1; j<=2 ; j++){
            System.out.println("Outer:" + j);
            for(int f= 1; f <= 3;f++){
                System.out.println(" Inner: " + f);}
        }
    }
    
}
