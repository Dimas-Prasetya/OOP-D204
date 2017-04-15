package com.mercubuana.minggu05mvc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormMenuUtama {

	private JFrame frmFormMenuUtama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormMenuUtama window = new FormMenuUtama();
					window.frmFormMenuUtama.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormMenuUtama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormMenuUtama = new JFrame();
		frmFormMenuUtama.setTitle("Form Menu Utama - Rumah Sakit ABC");
		frmFormMenuUtama.setBounds(100, 100, 376, 135);
		frmFormMenuUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormMenuUtama.getContentPane().setLayout(null);
		
		JButton btnTerimaPasien = new JButton("Terima Pasien");
		btnTerimaPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormTerimaPasien.main(null);
			}
		});
		btnTerimaPasien.setBounds(76, 12, 206, 26);
		frmFormMenuUtama.getContentPane().add(btnTerimaPasien);
		
		JButton btnTampilkanPasien = new JButton("Tampilkan Pasien");
		btnTampilkanPasien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormTampilkanPasien.main(null);
			}
		});
		btnTampilkanPasien.setBounds(76, 50, 206, 26);
		frmFormMenuUtama.getContentPane().add(btnTampilkanPasien);
	}

}
