public class Main {
    // Laporan Repo UAS PBO
    // Nama NIM = Difa Riza Fahlefi_G.111.19.0007
    public static void main(String []args){

        Buku buku1 = new Buku("B001", "BahasaJAVA");
        Buku buku2 = new Buku( "B002", "Bahasa php");
        BukuLuar buku3 = new BukuLuar("B003", "HTML CSS 2023");
        
        Petugas petugas1 = new Petugas ("Agus", "111A");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Budiman");
        peminjam1.setKodePeminjam("K001");

        peminjam1.doLogin();
        // peminjam1.doLogout();
    

    try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku3);

        System.out.println("Peminjam: " + peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Kode Peminjam: " + peminjaman1.getPeminjam().getKodePeminjam());
        System.out.println("Nama Petugas: " + peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Buku: "+peminjaman1.getBuku().getNamaBuku());
        Denda denda1 = new Denda(peminjaman1, );
        System.out.println("Tagihan Denda:" + denda1.getTagihan());
        System.out.println("================");
        Peminjaman peminjaman2 = new Peminjaman(peminjam2, petugas1, buku3);
        System.out.println("Peminjam: " + peminjaman2.getPeminjam().getNamaPeminjam());
        System.out.println("Kode Peminjam: " + peminjaman2.getPeminjam().getKodePeminjam());
        System.out.println("Nama Petugas: " + peminjaman2.getPetugas().getNamaPetugas());
        System.out.println("Buku: "+peminjaman2.getBuku().getNamaBuku());
        Denda denda2 = new Denda(peminjaman2, );
        System.out.println("Tagihan Denda:" + denda2.getTagihan());
        
        System.out.println("Denda dihapuskan");
        peminjam2.addAntiDenda();

        System.out.println("Tagihan Denda: "+ denda2.getTagihan());
        System.out.println(" Denda ditambahkan");
        peminjam2.removeAntiDenda();
        
    }catch(Exception e){
        System.out.println("Terjadi Kesalahan" + e.getMessage());
    }finally {
        System.out.println("Program selesai");
    }
}
}
