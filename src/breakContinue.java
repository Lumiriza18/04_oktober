public class breakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
        if (i == 4)
            {
    break;   //benar-benar menghentikan interaksinya
}
    System.out.println(i);
}
System.out.println("====================");
    for (int j = 0; j < 10; j++) {
        if (j == 4) {
    continue; //melewati nya
    }
System.out.println(j);
}

System.out.println("====================");
    for( int h =0; h < 6 ; h++){
        if(h==2){
            continue;
        }
        if (h==4){
            break;
        }
        System.out.println(h);
    }
System.out.println("====================");
        int p=0;
        while( p< 10){
            System.out.println(p);
        p++;
        if (p==6){
            continue;
        }
        if (p==9){
            break;
        }
        }
System.out.println("====================");
int [] numbers ={ 3,-1,9,7,0,10};
for( int n:numbers){
    if(n<0){
        continue;
    }
    if(n==0){
        break;
    }
    System.out.println(n);
}
}
}
