package siswa.siswa;
//Driver Class
public class siswatester {
    public static void main(String[] args) {
        //object
        // class object = new contructor
        siswa azzam = new siswa();
        siswa gilam = new siswa();
        siswa averill = new siswa();
        siswa kinza = new siswa();
        siswa moreno = new siswa();

        azzam.id = 22;
        azzam.nama = "azzam";
        azzam.ipk = 100;

        gilam.id = 19;
        gilam.nama = "gilam";
        gilam.ipk = 100;

        averill.id = 5;
        averill.nama = "averill";
        averill.ipk = 100;

        kinza.id = 15;
        kinza.nama = "kinza";
        kinza.ipk = 100;

        moreno.id = 24;
        moreno.nama = "moreno";
        moreno.ipk = 100;

        System.out.println("ID : " + azzam.id);
        System.out.println("Nama : " + azzam.nama);
        System.out.println("IPK : " + azzam.ipk);

        System.out.println("ID : " + gilam.id);
        System.out.println("Nama : " + gilam.nama);
        System.out.println("IPK : " + gilam.ipk);

        System.out.println("ID : " + averill.id);
        System.out.println("Nama : " + averill.nama);
        System.out.println("IPK : " + averill.ipk);

        System.out.println("ID : " + kinza.id);
        System.out.println("Nama : " + kinza.nama);
        System.out.println("IPK : " + kinza.ipk);

        System.out.println("ID : " + moreno.id);
        System.out.println("Nama : " + moreno.nama);
        System.out.println("IPK : " + moreno.ipk);

    }
}
