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

	private JFrame KatHesab�;
	private JTextField txtgirilenSayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SayiKatlari window = new SayiKatlari();
					window.KatHesab�.setVisible(true);
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
		KatHesab� = new JFrame();
		KatHesab�.setBounds(100, 100, 450, 300);
		KatHesab�.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		KatHesab�.getContentPane().setLayout(null);
		
		JLabel lblLtfenye = new JLabel("L\u00FCtfen 50 'ye kadar bir say\u0131 giriniz !");
		lblLtfenye.setBounds(122, 66, 223, 14);
		KatHesab�.getContentPane().add(lblLtfenye);
		
		JLabel lblGirilenSay = new JLabel("Girilen Say\u0131 :");
		lblGirilenSay.setBounds(62, 109, 75, 14);
		KatHesab�.getContentPane().add(lblGirilenSay);
		
		txtgirilenSayi = new JTextField();
		txtgirilenSayi.setBounds(211, 106, 86, 20);
		KatHesab�.getContentPane().add(txtgirilenSayi);
		txtgirilenSayi.setColumns(10);
		
		JButton btnKatHesapla = new JButton("Kat Hesapla !");
		btnKatHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String	SayiText = txtgirilenSayi.getText();
			
			Byte Sayi = Byte.valueOf(SayiText);
			
			
			if ( 0 < Sayi && Sayi < 50  ) {
				if (Sayi % 5 == 0) {
					JOptionPane.showMessageDialog(KatHesab�, "Girilen Sayi 5 in kat�d�r !");
				}else if (Sayi % 4 == 0) {
					JOptionPane.showMessageDialog(KatHesab�, "Girilen Sayi 4 �n kat�d�r !");
					
				}else if (Sayi % 3== 0) {
					JOptionPane.showMessageDialog(KatHesab�, "Girilen Sayi 3 �n kat�d�r !");
				} else if (Sayi % 2 == 0) {
					JOptionPane.showMessageDialog(KatHesab�, "Girilen Sayi 2 nin kat�d�r !");
				} else {
					
					JOptionPane.showMessageDialog(KatHesab�, "Girilen Sayi ASAL SAYIDIR !");
				}
				
			} else {
				JOptionPane.showMessageDialog(KatHesab�, "L�tfen 0 ile 50 aras�nda bir say� giriniz !!");
			} 
				
				
			}
		});
		btnKatHesapla.setBounds(271, 204, 130, 23);
		KatHesab�.getContentPane().add(btnKatHesapla);
	}

}
