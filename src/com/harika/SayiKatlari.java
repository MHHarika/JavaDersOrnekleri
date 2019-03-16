package com.harika;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SayiKatlari {

	private JFrame KatHesabý;
	private JTextField txtgirilenSayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayiKatlari window = new SayiKatlari();
					window.KatHesabý.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SayiKatlari() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		KatHesabý = new JFrame();
		KatHesabý.setBounds(100, 100, 450, 300);
		KatHesabý.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KatHesabý.getContentPane().setLayout(null);
		
		JLabel lblLtfenye = new JLabel("L\u00FCtfen 50 'ye kadar bir say\u0131 giriniz !");
		lblLtfenye.setBounds(122, 66, 223, 14);
		KatHesabý.getContentPane().add(lblLtfenye);
		
		JLabel lblGirilenSay = new JLabel("Girilen Say\u0131 :");
		lblGirilenSay.setBounds(62, 109, 75, 14);
		KatHesabý.getContentPane().add(lblGirilenSay);
		
		txtgirilenSayi = new JTextField();
		txtgirilenSayi.setBounds(211, 106, 86, 20);
		KatHesabý.getContentPane().add(txtgirilenSayi);
		txtgirilenSayi.setColumns(10);
		
		JButton btnKatHesapla = new JButton("Kat Hesapla !");
		btnKatHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String	SayiText = txtgirilenSayi.getText();
			
			Byte Sayi = Byte.valueOf(SayiText);
			
			
			if ( 0 < Sayi && Sayi < 50  ) {
				if (Sayi % 5 == 0) {
					JOptionPane.showMessageDialog(KatHesabý, "Girilen Sayi 5 in katýdýr !");
				}else if (Sayi % 4 == 0) {
					JOptionPane.showMessageDialog(KatHesabý, "Girilen Sayi 4 ün katýdýr !");
					
				}else if (Sayi % 3== 0) {
					JOptionPane.showMessageDialog(KatHesabý, "Girilen Sayi 3 ün katýdýr !");
				} else if (Sayi % 2 == 0) {
					JOptionPane.showMessageDialog(KatHesabý, "Girilen Sayi 2 nin katýdýr !");
				} else {
					
					JOptionPane.showMessageDialog(KatHesabý, "Girilen Sayi ASAL SAYIDIR !");
				}
				
			} else {
				JOptionPane.showMessageDialog(KatHesabý, "Lütfen 0 ile 50 arasýnda bir sayý giriniz !!");
			} 
				
				
			}
		});
		btnKatHesapla.setBounds(271, 204, 130, 23);
		KatHesabý.getContentPane().add(btnKatHesapla);
	}

}
