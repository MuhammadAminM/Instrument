import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan Nama : ");
        // String nama = input.nextLine();
        // System.out.println("Masukkan ID : ");
        // int id = input.nextInt();
        // System.out.println("Masukkan IPK : ");
        // double ipk = input.nextDouble();
        // input.close();

        // Siswa dimas = new Siswa(id, nama, ipk);
        // dimas.print();
        // System.out.println("-------------");
        // //membuat object
        // //namaClass namaObject = new
        // //Constructor
        // Siswa sabrina = new Siswa();
        // Siswa rasyid = new Siswa();
        // Siswa angga = new Siswa();
        // Siswa rehan = new Siswa();
        // Siswa kevin = new Siswa();
        // Siswa felix = new Siswa(14, "Felix", 70);

        // sabrina.id = 12;
        // sabrina.nama = "Sabrina";
        // sabrina.ipk = 5.0;
        // rasyid.id = 30;
        // rasyid.nama = "Rasyid";
        // rasyid.ipk = 8.0;
        // angga.id = 9;
        // angga.nama = "Angga";
        // angga.ipk = 9.0;
        // rehan.id = 15;
        // rehan.nama = "Rehan";
        // rehan.ipk = 10.0;
        // kevin.id = 20;
        // kevin.nama = "Kevin";
        // kevin.ipk = 5.0;

        // sabrina.print();
        // System.out.println("-------------");
        // rasyid.print();
        // System.out.println("-------------");
        // angga.print();
        // System.out.println("-------------");
        // rehan.print();
        // System.out.println("-------------");
        // kevin.print();
        // System.out.println("-------------");
        // felix.print();
        Siswa Nasya = new Siswa(1, "Nasya", 90);
        Siswa Sativa = new Siswa(2, "Sativa", 85);
        Nasya.print();
        System.out.println("-------------");
        Sativa.print();
        System.out.println("-------------");

        //Operator And
    if (Nasya.getIpk() >= 8.0 && Nasya.getNama().equals("Nasya")) {
            System.out.println("Lulus");
    }else {
        System.out.println("Tidak Lulus");
         }
        
        //Operator Membandingkan 2 objek
    if (Nasya.getIpk() >= Sativa.getIpk()) {
        System.out.println("IPK Nasya lebih besar dari IPK Sativa");
    }else {
        System.out.println("IPK Sativa lebih besar dari IPK Nasya");

         }
    
   }
}
