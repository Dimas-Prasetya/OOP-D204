package com.mercubuana.minggu02;

import javax.swing.JOptionPane;

public class Kalkulator {

	public static void main(String[] args) {
		
		String operand1 = "", operand2 = "", operator = "";
		double bilangan1 = 0, bilangan2 = 0, hasil = 0;
		boolean valid = false;
		do {
			operand1 = JOptionPane.showInputDialog("Bilangan 1 = ");
			try {
				bilangan1 = Double.parseDouble(operand1);
				valid = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Anda memasukkan bilangan yang tidak valid formatnya");
			}
		} while (!valid);
		
		valid = false;
		do {
			operand2 = JOptionPane.showInputDialog("Bilangan 2 = ");
			try {
				bilangan2 = Double.parseDouble(operand2);
				valid = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Anda memasukkan bilangan yang tidak valid formatnya");
			}
		} while (!valid);
		
		valid = false;
		do {
			operator = JOptionPane.showInputDialog("Operator = ");
			switch (operator) {
			case "+" :
				hasil = bilangan1 + bilangan2;
				valid = true;
				break;
			case "-" :
				hasil = bilangan1 - bilangan2;
				valid = true;
				break;
			case "*" :
				hasil = bilangan1 * bilangan2;
				valid = true;
				break;
			case "/" :
				hasil = bilangan1 / bilangan2;
				valid = true;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Operator " + operator + " belum tersedia dalam aplikasi");
				break;
			}
		} while (!valid);
		JOptionPane.showMessageDialog(null, "" + operand1 + " " + operator + " " + operand2 + " = " + hasil);

	}

}
