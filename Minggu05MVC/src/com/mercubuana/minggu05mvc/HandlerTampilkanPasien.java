package com.mercubuana.minggu05mvc;

import javax.swing.JOptionPane;

public class HandlerTampilkanPasien {
//	Method STATIC untuk mengembalikan string daftar pasien
	public static String getDaftarPasien() {
		String daftar = "";
		
//		1. Loop terhadap koleksi pasien yang ada dalam kelas HandlerTerimaPasien
		for (Pasien pasienBaru:HandlerTerimaPasien.daftarPasien) {
			daftar += "Nama Pasien : " + pasienBaru.getNamaPasien() + "\n" +
					  "Jenis Kelamin : " + pasienBaru.getJenisKelamin() + "\n" +
					  "Tanggal Lahir : " + pasienBaru.getTanggalLahir() + "\n\n";
		}
		
//		2. Mengambil atribut masing-masing objek pasien
		
		return daftar;
	}
}
