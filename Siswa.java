public class Siswa {
    //variable
     int id;
     private String nama;

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

     private double ipk;


	public double getIpk() {
		return this.ipk;
	}

	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	


    //Constructor Default  (yang membangun object)
    public Siswa(){
        id = 0;
        nama = "Kosong";
        ipk = 0.0;

    }
    //Constructor Parameter
    public Siswa(int i, String n, double k){
         id = i;
        nama = n;
        ipk = k;
    }

    //Getter --> untuk mengambil nilai variabel
    
    
    
    //Setter --> untuk mengubah nilai
    
    
    //Method
    public void print(){
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
