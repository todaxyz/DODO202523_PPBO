
public class TestPengguna {
    public static void main(String[] args) {
        System.out.println();

        Pengguna user = new Pekerja();
        user.setNama("Budi Santoso");
        user.id = 1001;
        user.umur = 25;
        user.role = "Pekerja";
        user.tampilkanInfo();
        user.role();
        System.out.println();

        Pengguna admin = new Admin();
        admin.setNama("Adminn");
        admin.id = 1002;
        admin.umur = 30;
        admin.role = "Admin";
        admin.tampilkanInfo();
        admin.role();
        System.out.println();
    }
}