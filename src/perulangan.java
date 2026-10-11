public class perulangan {
    public static void main(String[] args){
        int i = 0;
        while ( i<5){
            System.out.print(i);
            i++;
        }
System.out.println("---------------------------");

        //hitung mundur
        int down =3;
        while(down >0){
            System.out.println(down);
            down--;
        }
        //int p = 1;
           // while (p == 1) {
                //System.out.println("Oops"); // alasan ini jadi terus berulang karena dia itu tidak ada pembatasnya//
                                                    //dan akan terus melooping //


        //perulangan do/while
        int perulangann =0;
        do{
            System.out.println(perulangann);
            perulangann++;
        }
        while(perulangann>5);

        int k = 10;
        do {
            System.out.println("k is " + k);
            k++;
            }
            while (k < 5);
        
        int cDown =3;
            while (cDown>0){
                System.out.println(cDown);
                cDown--;}
System.out.println("================================");

        int dice = 1;
        while( dice <= 6){
        if (dice < 6){
            System.out.println("no-ylxy");
        }
        else{
            System.out.println("ylxy");
        }
        dice= dice+1;
        }
System.out.println("================================");
        // perulangan for each
        String[] cars={"volvo","BMW","Ford","Mazda"};
        for( String car:cars){
            System.out.println(car);
        }
System.out.println("================================");
        int[] numbers= {10,20,30,40,50,60};
        for(int number:numbers){
            System.out.println(number);
        }
System.out.println("================================");
        for(int d =0; d<=100 ; d+=10){
            System.out.println(d);
        }
    }
}
