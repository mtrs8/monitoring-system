package br.edu.ifba.pooinf008.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.UIManager;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class View extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Euclidiana");
		button.setFont(new Font("Montserrat", Font.BOLD, 16));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(new Color(175, 238, 238));
		button.setBounds(10, 59, 205, 47);
		contentPane.add(button);
		
		Button button_1 = new Button("Manhattan");
		button_1.setFont(new Font("Montserrat", Font.BOLD, 16));
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setBackground(new Color(245, 222, 179));
		button_1.setBounds(221, 59, 205, 47);
		contentPane.add(button_1);
		
		Label label = new Label("Localiza\u00E7\u00E3o:");
		label.setFont(new Font("Montserrat", Font.BOLD, 16));
		label.setBounds(68, 133, 106, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Latitude");
		label_1.setForeground(new Color(47, 79, 79));
		label_1.setFont(new Font("Montserrat", Font.BOLD, 14));
		label_1.setBounds(68, 166, 85, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Longitude");
		label_2.setForeground(new Color(47, 79, 79));
		label_2.setFont(new Font("Montserrat", Font.BOLD, 14));
		label_2.setBounds(68, 205, 85, 22);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("SELECIONE A UNIDADE");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
		lblNewLabel.setBounds(69, 11, 301, 32);
		contentPane.add(lblNewLabel);
		
		TextField textField = new TextField();
		textField.setBounds(157, 161, 213, 30);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(157, 200, 213, 30);
		contentPane.add(textField_1);
		
		Label label_3 = new Label("Equipamentos:");
		label_3.setFont(new Font("Montserrat", Font.BOLD, 16));
		label_3.setBounds(68, 275, 125, 22);
		contentPane.add(label_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setForeground(new Color(173, 216, 230));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBackground(new Color(173, 216, 230));
		chckbxNewCheckBox.setBounds(68, 303, 22, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setForeground(new Color(173, 216, 230));
		chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_1.setBackground(new Color(173, 216, 230));
		chckbxNewCheckBox_1.setBounds(68, 335, 22, 22);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setForeground(new Color(173, 216, 230));
		chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_2.setBackground(new Color(173, 216, 230));
		chckbxNewCheckBox_2.setBounds(68, 370, 22, 22);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setForeground(new Color(173, 216, 230));
		chckbxNewCheckBox_3.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox_3.setBackground(new Color(173, 216, 230));
		chckbxNewCheckBox_3.setBounds(68, 402, 22, 22);
		contentPane.add(chckbxNewCheckBox_3);
		
		Label label_2_1 = new Label("C\u00E2mera de V\u00EDdeo");
		label_2_1.setForeground(Color.DARK_GRAY);
		label_2_1.setFont(new Font("Montserrat", Font.BOLD, 13));
		label_2_1.setBounds(96, 303, 154, 22);
		contentPane.add(label_2_1);
		
		Label label_2_2 = new Label("Medidor de CO\u00B2");
		label_2_2.setForeground(Color.DARK_GRAY);
		label_2_2.setFont(new Font("Montserrat", Font.BOLD, 13));
		label_2_2.setBounds(96, 335, 131, 22);
		contentPane.add(label_2_2);
		
		Label label_2_3 = new Label("Medidor de Metano");
		label_2_3.setForeground(Color.DARK_GRAY);
		label_2_3.setFont(new Font("Montserrat", Font.BOLD, 13));
		label_2_3.setBounds(96, 370, 154, 22);
		contentPane.add(label_2_3);
		
		Label label_2_4 = new Label("Term\u00F4metro");
		label_2_4.setForeground(Color.DARK_GRAY);
		label_2_4.setFont(new Font("Montserrat", Font.BOLD, 13));
		label_2_4.setBounds(96, 402, 119, 22);
		contentPane.add(label_2_4);
		
		Button button_2 = new Button("MOVER");
		button_2.setForeground(new Color(255, 255, 255));
		button_2.setFont(new Font("Montserrat", Font.BOLD, 18));
		button_2.setBackground(SystemColor.controlDkShadow);
		button_2.setBounds(117, 455, 210, 45);
		contentPane.add(button_2);
		
		Label label_4 = new Label("Desenvolvido por Adriel Gama, Matheus Rodrigues e Tamires Manh\u00E3es");
		label_4.setForeground(SystemColor.text);
		label_4.setBounds(41, 559, 358, 22);
		contentPane.add(label_4);
		
	}
}
