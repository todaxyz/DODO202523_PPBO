//parent class
class Pengguna {
    public String role; String nama; int id; int umur;
    public void setNama(String n) {
        nama = n;
    }
    public void tampilkanInfo() {
        System.out.println("Informasi Pengguna");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nama : " + nama);
        System.out.println("Role : " + role);
        System.out.println("ID   : " + id);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Status : Aktif");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
    }
    public void role() {
        System.out.println("Anda adalah seorang pengguna.");
    }
    void status() {
        System.out.println("Anda masih aktif");
    }
}
// child class
class Pekerja extends Pengguna {
    @Override
    public void role() {
        System.out.println("Status: Anda adalah seorang pekerja.");
    }
}
//child class
class Admin extends Pengguna {
    @Override
    void role() {
        System.out.println("Status: Anda adalah seorang admin.");
    }
}

// case belum ditambah public void