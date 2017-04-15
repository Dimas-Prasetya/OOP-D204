package com.mercubuana.minggu05mvc;

import java.util.ArrayList;

public class HandlerTerimaPasien {
//	Koleksi pasien
	public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
	
//	Method STATIC untuk membuat object baru dan
//	menambah objek baru ke dalam koleksi objek
	
	public static void rekamDataPasien(String namaPasien, char jenisKelamin, String tanggalLahir) {
//		1. Membuat objek pasienBaru
		Pasien pasienBaru = new Pasien(namaPasien, jenisKelamin, tanggalLahir);
		
//		2. Menambah objek pasien baru ke dalam koleksi pasien
		daftarPasien.add(pasienBaru);
	}
}
