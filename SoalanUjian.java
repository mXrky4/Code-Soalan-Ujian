import java.io.*;
public class SoalanUjian{
    public static void main(String[] args) throws IOException{
        
        BufferedReader object=new BufferedReader(new InputStreamReader(System.in));

        
        System.out.println("Hello, saya adalah UjianBot!");
        System.out.println("Peraturan untuk menjawab soalan ini adalah");
        System.out.println("anda haruslah menjawab soalan mengikut kehendak soalan");
        Systen.out.println("Jika anda salah menjawab, UjianBot akan mengulang sekali lagi");
        System.out.println("Sila masukkan nama anda:");
        String namaP = object.readLine();

        
        System.out.println("Welcome, " + namaP + "!, Adakah anda sedia untuk ujian anda? Y/N? *jawab dalam huruf besar*");
        String pilihanUjian = object.readLine();
        if (pilihanUjian.equals("Y")) {
            System.out.println("OK!, mari sambungkan dengan ujian!");
        } else {
            System.out.println("Anda tidak dibenarkan menjejak kaki ke KV lagi!");
            System.exit(0);
        }
        
        //Soalan 1
        System.out.println("Jawapan hendaklah dalam huruf besar")
        System.out.println("Soalan 1: Data Integer/Int digunakan untuk masukkan data apa?");
        System.out.println("A) Nombor tanpa titik perpuluhan");
        System.out.println("B) Nombor yang ada titik perpuluhan");
        System.out.println("C) Nombor yang ada atau tiada titik perpuluhan");
        String jawapanPertama = object.readLine();
        int markahjawapanPertama = 1;
        if (jawapanPertama.equals("A")){
            markahjawapanPertama = 20;
        }
        else if (jawapanPertama.equals("B")){
            markahjawapanPertama = 0;
        }
        
        else if(jawapanPertama.equals("C")){
            markahjawapanPertama = 0;
        }
        else {
            System.out.println("Jawab dalam huruf besar, tambahan anda sudah gagal! GG!");
            System.exit(0);
        }


        //Soalan 2
        System.out.println("Soalan 2: Apakah maksud Keywords?");
        System.out.println("A) Mengisytihar nilai constants dalam Java");
        System.out.println("B) Nilai pemalar atau nilai yang tidak akan berubah semasa aturcara dilaksanakan");
        System.out.println("C) Perkataan simpanan dalam Java yang mempunyai makna tertentu kepada compilier");
        String jawapanKedua = object.readLine();
        int markahjawapanKedua = 1;
        if (jawapanKedua.equals("C")){
            markahjawapanKedua = 20;
        }
        else if (jawapanKedua.equals("B")){
            markahjawapanKedua = 0;
        }
        
        else if(jawapanKedua.equals("A")){
            markahjawapanKedua = 0;
        }
        else {
            System.out.println("Jawab dalam huruf besar, tambahan anda sudah gagal! GG!");
            System.exit(0);
        }


        //Soalan 3
        System.out.println("Soalan 3: Apakah itu Array?");
        System.out.println("A) Bentuk integer atau double menggunakan arahan tertentu");
        System.out.println("B) Menyimpan sekumpulan data yang terdiri daripada jenis yang sama");
        System.out.println("C) Kenyataan dilaksanakan sebaris demi sebaris");
        String jawapanKetiga = object.readLine();
        int markahjawapanKetiga = 1;
        if (jawapanKetiga.equals("B")){
            markahjawapanKetiga = 20;
        }
        else if (jawapanKetiga.equals("C")){
            markahjawapanKetiga = 0;
        }
        
        else if(jawapanKetiga.equals("A")){
            markahjawapanKetiga = 0;
        }
        else {
            System.out.println("Jawab dalam huruf besar, tambahan anda sudah gagal! GG!");
            System.exit(0);
        }



        //Soalan 4
            System.out.println("Soalan 4: Apakah itu Switch?");
            System.out.println("A) Satu segmen aturcara yang melaksanakan tugas khusus");
            System.out.println("B) Sesuai untuk pengulangan yang dikawal oleh pembilangan iaitu jika telah pasti bilangan ulangan");
            System.out.println("C) Pemilihan dilakukan dari beberapa pililhan berganda berdasarkan nilai tertentu yang telah ditetapkan");
            String jawapanKeempat = object.readLine();
            int markahjawapanKeempat = 1;
        if (jawapanKeempat.equals("C")){
                markahjawapanKeempat = 20;
        }
        else if (jawapanKeempat.equals("B")){
                    markahjawapanKeempat = 0;
        }
                
        else if(jawapanKeempat.equals("A")){
                    markahjawapanKeempat = 0;
        }
        else {
            System.out.println("Jawab dalam huruf besar, tambahan anda sudah gagal! GG!");
            System.exit(0);
        }



        int Jumlah = (markahjawapanPertama + markahjawapanKedua + markahjawapanKetiga + markahjawapanKeempat);
        int nilai = Jumlah;
        String grade ="A";
        if(nilai>=80){grade="A";} 
 else if(nilai>=70) {grade="B";}
 else if(nilai>=60) {grade="C";}
 else if(nilai>=50) {grade="D";}
 else if(nilai<50) {grade="E";}

 
 
        System.out.println("Hello, "+ namaP + "! Markah anda untuk ujian ini adalah " + Jumlah+ "%");
        System.out.println("Gred anda untuk ujian ini adalah " + grade);

        if (grade="A");{
            System.out.println("Tahniah, "+ namaP + "Anda telah berjaya lulus ujian tersebut !");
        }
        else if (grade="B");{
            System.out.println("Tahniah, "+ namaP + "Usahakan lagi !");
        }
        else if (grade="C");{
            System.out.println("Boleh lah, "+ namaP + "Cuba lagi !")
        }
        else if (grade="D");{
            System.out.println("Anda gagal, "+  namaP + "Usahakan lagi untuk mencuba !")
        }
        else if (grade="E");{
            System.out.printlln("Anda gagal, "+ namaP + "Usahakan lagi untuk mencuba")
        }

        System.out.println("UjianBot sentiasa bersedia untuk menguji anda!");
    
        System.out.println("░░░░░░░░░░░░▄▄▄█████████▄▄▄▄░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░▄████████████████████▄░░░░░░░░░");
        System.out.println("░░░░░░▄██████████████████████████▄░░░░░░");
        System.out.println("░░░░▄███████████████▀▀▀▀▀▀▀▀███████▄░░░░");
        System.out.println("░░░▄██████████████▀░░▄▀▀▀▀▄░░▀██████▄░░░");
        System.out.println("░░████████████████░░░▀▄▄▄▄▀░░░████████░░");
        System.out.println("░█████████████████░░░█░░░░█░░░█████████░");
        System.out.println("▄█████████████████▄░░▀▄▄▄▄▀░░▄█████████░");
        System.out.println("████████████████████▄▄▄▄▄▄▄▄████████████");
    }
   
}