package com.mercubuana.minggu05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FormTerimaPasien {

	private JFrame frmFormTerimaPasien;
	private JTextField txtNamaPasien;
	private JTextField txtTanggalLahir;
	private JComboBox cmbJenisKelamin;
	private ArrayList<Pasien> koleksiPasien = new ArrayList<Pasien>();

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
		frmFormTerimaPasien.setResizable(false);
		frmFormTerimaPasien.setTitle("Form Terima Pasien - Rumah Sakit ABC");
		frmFormTerimaPasien.setBounds(100, 100, 374, 173);
		frmFormTerimaPasien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormTerimaPasien.getContentPane().setLayout(null);
		
		JLabel lblNamaPasien = new JLabel("Nama Pasien");
		lblNamaPasien.setBounds(12, 12, 81, 16);
		frmFormTerimaPasien.getContentPane().add(lblNamaPasien);
		
		JLabel lblJenisKelamin = new JLabel("Jenis Kelamin");
		lblJenisKelamin.setBounds(12, 40, 81, 16);
		frmFormTerimaPasien.getContentPane().add(lblJenisKelamin);
		
		JLabel lblTanggalLahir = new JLabel("Tanggal Lahir");
		lblTanggalLahir.setBounds(12, 68, 81, 16);
		frmFormTerimaPasien.getContentPane().add(lblTanggalLahir);
		
		txtNamaPasien = new JTextField();
		txtNamaPasien.setBounds(126, 10, 221, 20);
		frmFormTerimaPasien.getContentPane().add(txtNamaPasien);
		txtNamaPasien.setColumns(10);
		
		cmbJenisKelamin = new JComboBox();
		cmbJenisKelamin.setModel(new DefaultComboBoxModel(new String[] {"Pria", "Wanita"}));
		cmbJenisKelamin.setBounds(126, 36, 68, 25);
		frmFormTerimaPasien.getContentPane().add(cmbJenisKelamin);
		
		txtTanggalLahir = new JTextField();
		txtTanggalLahir.setBounds(126, 66, 114, 20);
		frmFormTerimaPasien.getContentPane().add(txtTanggalLahir);
		txtTanggalLahir.setColumns(10);
		
		JButton btnRekamDataPasien = new JButton("Rekam Data Pasien");
		btnRekamDataPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namaPasien = "";
				char jenisKelamin = 'P';
				String tanggalLahir = "";
				
				namaPasien = txtNamaPasien.getText();
				if (cmbJenisKelamin.getSelectedIndex() == 1) {
					jenisKelamin = 'W';
				}
				tanggalLahir = txtTanggalLahir.getText();
				
				Pasien pasienBaru = new Pasien(namaPasien, jenisKelamin, tanggalLahir);
				
				koleksiPasien.add(pasienBaru);
				
				JOptionPane.showMessageDialog(null, "Data pasien berhasil direkam.");
			}
		});
		btnRekamDataPasien.setBounds(12, 96, 167, 26);
		frmFormTerimaPasien.getContentPane().add(btnRekamDataPasien);
		
		JButton btnTampilkanDataPasien = new JButton("Tampilkan Data Pasien");
		btnTampilkanDataPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String daftarPasien = "";
				
				for (Pasien k:koleksiPasien) {
					daftarPasien += "Nama Pasien : " + k.namaPasien + "\n" +
									"Jenis Kelamin : " + k.jenisKelamin + "\n" +
									"Tanggal Lahir : " + k.tanggalLahir + "\n\n";
				}
				
				JOptionPane.showMessageDialog(null, daftarPasien);
			}
		});
		btnTampilkanDataPasien.setBounds(180, 96, 167, 26);
		frmFormTerimaPasien.getContentPane().add(btnTampilkanDataPasien);
	}
}
