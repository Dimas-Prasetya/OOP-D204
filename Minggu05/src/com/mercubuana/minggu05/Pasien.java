package com.mercubuana.minggu05;

public class Pasien {
	String namaPasien = "";
	char jenisKelamin = 'P';
	String tanggalLahir = "";
	
	public Pasien(String namaPasien, char jenisKelamin, String tanggalLahir) {
		super();
		this.namaPasien = namaPasien;
		this.jenisKelamin = jenisKelamin;
		this.tanggalLahir = tanggalLahir;
	}

	public String getNamaPasien() {
		return namaPasien;
	}

	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}

	public char getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(char jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
}
