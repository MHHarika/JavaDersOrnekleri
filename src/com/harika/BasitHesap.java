package com.harika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasitHesap {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=181,-11
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField txtSayi1;
	private JTextField txtSayi2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasitHesap window = new BasitHesap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BasitHesap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	    comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TOPLA", "CIKAR", "BOL", "CARP"}));
		comboBox.setBounds(295, 47, 86, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblYaplacakIlemiSeiniz = new JLabel("Yap\u0131lacak \u0130\u015Flemi Se\u00E7iniz !");
		lblYaplacakIlemiSeiniz.setBounds(86, 44, 158, 26);
		frame.getContentPane().add(lblYaplacakIlemiSeiniz);
		
		JLabel lblSayiGiriniz = new JLabel("Sayi giriniz:");
		lblSayiGiriniz.setBounds(86, 96, 68, 14);
		frame.getContentPane().add(lblSayiGiriniz);
		
		JLabel lblSayiGiriniz_1 = new JLabel("Sayi giriniz:");
		lblSayiGiriniz_1.setBounds(86, 121, 54, 14);
		frame.getContentPane().add(lblSayiGiriniz_1);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String	ÝslemTipi = comboBox.getSelectedItem().toString();
				
				String Sayi1Txt = txtSayi1.getText();
				String Sayi2Txt = txtSayi2.getText();
				
				Byte Sayi1= Byte.valueOf(Sayi1Txt);
				Byte Sayi2 = Byte.valueOf(Sayi2Txt);
				
				if (ÝslemTipi == "TOPLA") {
					
				   
					JOptionPane.showMessageDialog(frame, "Girilen sayýlarýn toplamý " + (Sayi1 + Sayi2 ));
				} else if (ÝslemTipi == "CIKAR") {
					JOptionPane.showMessageDialog(frame, "Girilen sayýlarýn farký" + ((Sayi1 - Sayi2)*(-1)));
				}else if (ÝslemTipi== "BOL") {
					JOptionPane.showMessageDialog(frame, "Girilen sayýlarýn bölümü" + (Sayi1 / Sayi2));
				}else {
					
					JOptionPane.showMessageDialog(frame, "Girilen sayýlarýn çarpýmý" + (Sayi1 * Sayi2));
				}
				
			}
		});
		btnHesapla.setBounds(317, 227, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		txtSayi1 = new JTextField();
		txtSayi1.setBounds(295, 93, 86, 20);
		frame.getContentPane().add(txtSayi1);
		txtSayi1.setColumns(10);
		
		txtSayi2 = new JTextField();
		txtSayi2.setBounds(295, 118, 86, 20);
		frame.getContentPane().add(txtSayi2);
		txtSayi2.setColumns(10);
		
		
	}

}
