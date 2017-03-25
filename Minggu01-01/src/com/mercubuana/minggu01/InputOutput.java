package com.mercubuana.minggu01;

import javax.swing.JOptionPane;

public class InputOutput {

	public static void main(String[] args) {
		
		String nama;
		
		nama = JOptionPane.showInputDialog("Silakan ketikkan nama anda : ");
		JOptionPane.showMessageDialog(null, "Selamat pagi, " + nama);
	
	}

}
