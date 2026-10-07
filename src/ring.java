public class ring{
    public static void main(String[] args) {
        String huruf ="abcdefghijklmnopqrstuvwxyz";
        System.out.println("jumlah huruf:"+ huruf.length());

        String huruf2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Merubah_huruf_besar:"+ huruf2.toUpperCase());

        String huruf3= "abcdefghijklmnopqrstuvwxyz";
        System.out.println("merubah ke huruf kecil:"+ huruf3.toLowerCase());
        
        String huruf4= "halo semua perkenalalkan nama saya ludmilla riza maharuni";
        System.out.println("kata yang ingin dicari:"+ huruf4.indexOf("ludmilla"));
        System.out.println("huruf yang ingin dicari:" + huruf4.charAt(6));

        //membandingkan Sting menggunakan equals()
        String text1 =" hallo";
        String text2 =" hallo";
        String text3=" hola";
        System.out.println(text1.equals(text2));
        System.out.println(text3.equals(text1));

        //mencoba menghapus spasi:
        String text4 = "halo";
        System.out.println("before:" + "["+ text4 +"]");
        System.out.println("after:"+ "["+ text4.trim() +"]"); //menurut saya sama saja

        //penggabungan dalam kalimat/penggabungan sting
        String text5 ="perkenalkan";
        String text6 =" nama";
        String text7 =" Ludmilla";
        System.out.println(text5.concat(text6).concat(text7));

        //perbedaan anatara cara penggunaan operator + di string  and anggka
        String angka ="10";
        int angka2=20;
        System.out.println(angka+ angka2);

        //penggunaan karakter khusus java 
        String text8 =" halo semu aku adalah seorang \'penggusaha handal\'";
        String text9 =" halo semu aku adalah seorang \\'penggusaha handal'\\";
        System.out.println(text8);
        System.out.println(text9);

        String message = "halo semuanya perkenalkan nama saya \"ludmilla riza maharuni\" sekarang sayaa jadi IT";
        System.out.println(message);
    }
}