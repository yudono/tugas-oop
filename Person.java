public class Person {
  // buat attribute person
  public String nama; // variable string untuk teks
  public int umur; // variable int untuk angka
  public int tinggi; // variable int untuk angka
  public int berat; // variable int untuk angka

  // buat method panggilSaya
  public void panggilSaya() {
    // kalo panggil attribute harus pake this
    System.out.println("Nama Saya : " + this.nama);
    System.out.println("Umur Saya : " + this.umur + "tahun");
    System.out.println("Tinggi Saya : " + this.tinggi + "cm");
    System.out.println("Berat Saya : " + this.berat + "kg");
  }
}
