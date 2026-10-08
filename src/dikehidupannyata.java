public class  dikehidupannyata{
public static void main(String[] args) {
        int maxScore =500;
        int userScore=489;
        double percentase= maxScore/userScore * 100d;
        System.out.println(percentase);

//Belajar rata-rata:
        int sinta =89;
        int ayu =90;
        int ani=80, eka =98 ,dinda=80;
        int lumi=100;
        int pica=89;
        double rataRata = sinta + ayu + ani +eka+dinda+lumi+pica/7 *100d;
        System.out.println("maka nilai rata-rata:" + rataRata);

//belajar operator
        int nilaiKelas= 87;
        float nilaiRata=90.8f;
        int tambah = (int) (nilaiKelas + nilaiRata);
        System.out.println(tambah);
        System.out.println(tambah%4);

        int nilaiSatusekolah= 87;
        int nilaiLumi=90;
        System.out.println(++nilaiKelas + nilaiLumi);
        System.out.println(++nilaiKelas * nilaiLumi);
        System.out.println(--nilaiKelas / nilaiLumi);
        System.out.println(--nilaiKelas + nilaiLumi);

        int a=10;
        int b=3;
        int gabungan = a%b;
        System.out.println("nilai-modulonya:" + gabungan);

        int x=10;
        int y=3;
        double z=3.0d;
        //++x;
        //--z;
        int campuran = a/b;
        double campuran1=x/z;
        System.out.println("nilai-modulonya:" + campuran);
        System.out.println("nilai-modulonya:" + campuran1);

//program untuk orang yang masuk kan keluar:
        int pepleinroom =0;
        pepleinroom++;
        pepleinroom++;
        pepleinroom++;
        pepleinroom++;
        pepleinroom++;
        pepleinroom++;
System.out.println(pepleinroom);

//person leave room:
        pepleinroom--;
        pepleinroom--;
System.out.println(pepleinroom);

}
}