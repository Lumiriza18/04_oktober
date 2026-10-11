public class if_1{
    public static void main(String[] args){
        boolean isRainning = true;
        if (isRainning){
            System.out.println("Bring a umbrella");}
        
        if (20 >= 12){
            System.out.println(" itu benar"); }
        
        int  nilai1 =40;
        int nilai2=89;
        int totalNilai= nilai1+nilai2;
        if(totalNilai > nilai2){
            System.out.println("benar ");
        }
        
        int nilai3=45;
        int nilai4=45;
        int totalNilai1=nilai3+nilai4;
        if(nilai3==nilai4){
            System.out.println("ini a sama dengan b");
        }

        boolean isLighton = false;
        if (isLighton){
            System.out.println("lampu nyalah");
        }
            System.out.println("tidak nyalah");
        
        if (20 > 17)
            System.out.println("20 is greater than 17");

        int nilai5 = 50;
        int nilai6 =43;
        if (nilai5<nilai6){
            System.out.println("x is greater than y");
            }
            System.out.println("This line runs no matter what (not part of the if statement)");
        
            //else
        boolean isRainning1 = false;
        if (isRainning1){
            System.out.println("Bring a umbrella");}
        else{
            System.out.println("tidak udah bawah  payung");
        }
        
        int nilai7 =90;
        int nilai8=80;
        int Gabungan1 = nilai7+nilai8;
        if (nilai7 < nilai8){
            System.out.println("maka benar");
        }
        else{
            System.out.println(" maka ini jawabnya");}

         //else if
        int weather1=2;
        if (weather1==1){
            System.out.println("Bring an umbrella.");
        }
        else if (weather1==2){
            System.out.println("Wear sunglasses.");
        }
        else{
            System.out.println("Just go outside normally.");
        }

        int time =16;
        if (time<12){
            System.out.println("Good morning");
        }
        else if (time==16){
            System.out.println("good afternoon");
        }
        else {
            System.out.println(" good evening");
        }

        int time1 =16;
        if (time1<12){
            System.out.println("Good morning");
        }
        else if (time1<11){
            System.out.println("good afternoon");
        }
        else {
            System.out.println(" good evening");}
        
            //operator tennery
        int time2=20;
        String result= (time2 <40) ? " true" : " false";
        System.out.println(result);

        int time3=30;
        String jam = (time2 >60) ? " ini salah"
                    :(time3 <60) ? " ini benar"
                    : " hanya buat-buat";
        System.out.println(jam);

        //nested if
        int x= 15;
        int y= 25;
        if( x >10){
            System.out.println("x is greater than 10");

            if (y > 20){
                System.out.println("y is also greater than 20");
            }
        }
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
}       else {
            System.out.println("But you must be a citizen to vote.");
}
}       else {
            System.out.println("Not old enough to vote.");
}

        //if bersrang buatan sendiri
        int nilaiLapor=74;
        boolean lulus = true;

        if (nilaiLapor>= 80){
            System.out.println("mendapatkan nilai A");
                if (lulus){
                    System.out.println(" anda pasti tetap lulus");
                }}
                else if (nilaiLapor>=70){
                    System.out.println("mendapatkan nilai AB");
                }
                else if (nilaiLapor <=45){
                    System.out.println(" dapat nilai c");
                }
                else{
                    System.out.println(" dapat nilai D");
                }
        
                //Operator logika
                //&&
                int a = 200;
                int b = 33;
                int c = 500;

                if (a > b && c > a) {
                    System.out.println("Both conditions are true");
                }
                //||
                int  nilai9 = 200;
                int nilai10= 33;
                int nilai11 = 500;

                if ( nilai9> nilai10 || nilai10 > nilai11) {
                    System.out.println("At least one condition is true");
                }

                //!
                int nilai12= 13;
                int nilai13= 15;
                if (!(nilai12 > nilai13)){
                    System.out.println("ini benar jawabanyan");
                }
    }
}