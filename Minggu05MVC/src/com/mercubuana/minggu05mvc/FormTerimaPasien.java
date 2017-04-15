package com.mercubuana.minggu05mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormTerimaPasien {

	private JFrame frmFormTerimaPasien;
	private JTextField txtNamaPasien;
	private JComboBox cmbJenisKelamin;
	private JTextField txtTanggalLahir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormTerimaPasien window = new FormTerimaPasien();
					window.frmFormTerimaPasien.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormTerimaPasien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormTerimaPasien = new JFrame();
		frmFormTerimaPasien.setTitle("Form Terima Pasien - Rumah Sakit ABC");
		frmFormTerimaPasien.setResizable(false);
		frmFormTerimaPasien.setBounds(100, 100, 376, 153);
		frmFormTerimaPasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormTerimaPasien.getContentPane().setLayout(null);
		
		JLabel lblNamaPasien = new JLabel("Nama Pasien");
		lblNamaPasien.setBounds(10, 11, 80, 16);
		frmFormTerimaPasien.getContentPane().add(lblNamaPasien);
		
		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
		lblJenisKelamin.setBounds(10, 38, 80, 16);
		frmFormTerimaPasien.getContentPane().add(lblJenisKelamin);
		
		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
		lblTanggalLahir.setBounds(10, 65, 80, 16);
		frmFormTerimaPasien.getContentPane().add(lblTanggalLahir);
		
		txtNamaPasien = new JTextField();
		txtNamaPasien.setBounds(118, 9, 240, 20);
		frmFormTerimaPasien.getContentPane().add(txtNamaPasien);
		txtNamaPasien.setColumns(10);
		
		cmbJenisKelamin = new JComboBox();
		cmbJenisKelamin.setModel(new DefaultComboBoxModel(new String[] {"Pria", "Wanita"}));
		cmbJenisKelamin.setBounds(118, 34, 240, 25);
		frmFormTerimaPasien.getContentPane().add(cmbJenisKelamin);
		
		txtTanggalLahir = new JTextField();
		txtTanggalLahir.setBounds(118, 63, 240, 20);
		frmFormTerimaPasien.getContentPane().add(txtTanggalLahir);
		txtTanggalLahir.setColumns(10);
		
		JButton btnRekamDataPasien = new JButton("Rekam Data Pasien");
		btnRekamDataPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				Aplikasi sudah memisahkan tanggung jawab di antara Boundary, Controller, Entity:
//				1. Membaca input user dari GUI
				String namaPasien = "";
				char jenisKelamin = 'P';
				String tanggalLahir = "";
				
				namaPasien = txtNamaPasien.getText();
				if (cmbJenisKelamin.getSelectedIndex() == 1) {
					jenisKelamin = 'W';
				}
				tanggalLahir = txtTanggalLahir.getText();
				
//				2. Memanggil controller untuk membuat objek baru dan
//				   menambah objek baru ke dalam koleksi
				HandlerTerimaPasien.rekamDataPasien(namaPasien, jenisKelamin, tanggalLahir);
				
			}
		});
		btnRekamDataPasien.setBounds(118, 86, 240, 26);
		frmFormTerimaPasien.getContentPane().add(btnRekamDataPasien);
	}
}
