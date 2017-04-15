package com.mercubuana.minggu05mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormTampilkanPasien {

	private JFrame frmFormTampilkanPasien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormTampilkanPasien window = new FormTampilkanPasien();
					window.frmFormTampilkanPasien.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormTampilkanPasien() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormTampilkanPasien = new JFrame();
		frmFormTampilkanPasien.setResizable(false);
		frmFormTampilkanPasien.setTitle("Form Tampilkan Pasien - Rumah Sakit ABC");
		frmFormTampilkanPasien.setBounds(100, 100, 363, 77);
		frmFormTampilkanPasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormTampilkanPasien.getContentPane().setLayout(null);
		
		JButton btnTampilkanDataPasien = new JButton("Tampilkan Data Pasien");
		btnTampilkanDataPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Pada aplikasi MVC, menampilkan pasien dilakukan dengan cara:
//				1. Memanggil controller untuk memperoleh koleksi daftar pasien
				String daftarPasien = "";
				daftarPasien = HandlerTampilkanPasien.getDaftarPasien();
				
//				2. Menampilkan daftar pasien
				JOptionPane.showMessageDialog(null, daftarPasien);
			}
		});
		btnTampilkanDataPasien.setBounds(58, 12, 243, 26);
		frmFormTampilkanPasien.getContentPane().add(btnTampilkanDataPasien);
	}
}
