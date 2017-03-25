package com.mercubuana.minggu02;

import javax.swing.JOptionPane;

public class TipeDataNumeric {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		// Operasi hitung bilangan bulat
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a / 2 = " + a / 2);
		System.out.println("b * 3 = " + b * 3);
		System.out.println("a / 3 = " + a / 3);
		System.out.println("a + 3 = " + a + 3);
		System.out.println("a + 3 = " + (a + 3));
		
		System.out.println("");
		
		// Operasi hitung bilangan desimal
		System.out.println("a / 3.0 = " + a / 3.0);
		double c = 3.0;
		System.out.println("c = " + c);
		System.out.println("a / c = " + a / c);
		System.out.println("c / 2 = " + c / 2);
		
		/*
		 * int d = 3.0; COMPILE ERROR
		 * Karena int hanya bisa menyimpan bilangan bertipe integer dan tidak bisa diubah/convert ke double
		 * 
		 * int d = a / c; COMPILE ERROR
		 * Karena mengubah presisi menjadi lebih rendah tingkatnya mengundang terjadinya SALAH HITUNG
		 */
		
		int d = (int) 3.0;
		System.out.println(d);
		d = a / (int) c;
		System.out.println(d);
		
		// Konversi String menjadi Numeric
		String stringBilangan = JOptionPane.showInputDialog("Ketikkan sebuah bilangan : ");
		double bilangan = Double.parseDouble(stringBilangan);
		String stringHasil = "";
		stringHasil += bilangan + " + 2 = " + (bilangan + 2) + "\n";
		stringHasil += bilangan + " - 2 = " + (bilangan - 2) + "\n";
		stringHasil += bilangan + " * 2 = " + (bilangan * 2) + "\n";
		stringHasil += bilangan + " / 2 = " + (bilangan / 2) + "\n";
		JOptionPane.showMessageDialog(null, stringHasil);
		
	}

}
