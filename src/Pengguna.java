class Pengguna {

    public String nama; int id; int umur;

    public void setNama(String n) {
        nama = n;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Pengguna");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Nama : " + nama);
        System.out.println("ID   : " + id);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
    }
}
