package com.harika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frmanSistemi;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frmanSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmanSistemi = new JFrame();
		frmanSistemi.setTitle("\u00C7an Sistemi");
		frmanSistemi.setBounds(100, 100, 450, 300);
		frmanSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmanSistemi.getContentPane().setLayout(null);
		
		txtOgrenci1 = new JTextField();
		txtOgrenci1.setBounds(156, 88, 113, 20);
		frmanSistemi.getContentPane().add(txtOgrenci1);
		txtOgrenci1.setColumns(10);
		
		JLabel lblrenci = new JLabel("\u00D6\u011Frenci 1");
		lblrenci.setBounds(29, 90, 58, 17);
		frmanSistemi.getContentPane().add(lblrenci);
		
		txtOgrenci2 = new JTextField();
		txtOgrenci2.setBounds(156, 141, 113, 20);
		frmanSistemi.getContentPane().add(txtOgrenci2);
		txtOgrenci2.setColumns(10);
		
		txtOgrenci3 = new JTextField();
		txtOgrenci3.setBounds(156, 202, 113, 20);
		frmanSistemi.getContentPane().add(txtOgrenci3);
		txtOgrenci3.setColumns(10);
		
		JLabel lblrenci_1 = new JLabel("\u00D6\u011Frenci 3");
		lblrenci_1.setBounds(29, 205, 46, 14);
		frmanSistemi.getContentPane().add(lblrenci_1);
		
		JLabel lblrenci_2 = new JLabel("\u00D6\u011Frenci 2");
		lblrenci_2.setBounds(29, 144, 46, 14);
		frmanSistemi.getContentPane().add(lblrenci_2);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ogrenci1Text = txtOgrenci1.getText();
				String ogrenci2Text = txtOgrenci2.getText();
				String ogrenci3Text = txtOgrenci3.getText();
				
				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);
				
				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f ;
				
				if (ogrenci1Not >= ortalama ) {
					JOptionPane.showMessageDialog(frmanSistemi,"GEÇTÝ !(Öðrenci 1)");
					
					
				}else {
					
					float kalmaNotu = ortalama - ogrenci1Not ;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda KALDI.(Öðrenci 1)");
				}
				
				
				if (ogrenci2Not >= ortalama) {
					
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTÝ !(Öðrenci 2)");
					
				}else {
					
					float kalmaNotu = ortalama - ogrenci2Not ;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda KALDI.(Öðrenci 2)");
				}
				
				
				
				if (ogrenci3Not >= ortalama) {
					
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTÝ! (Öðrenci 3)");
				}else {
					
					float kalmaNotu = ortalama - ogrenci3Not ;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + "puan altýnda KALDI.(Öðrenci 3)");
					
				}
				
			}
		});
		btnHesapla.setBounds(311, 227, 89, 23);
		frmanSistemi.getContentPane().add(btnHesapla);
	}
}
