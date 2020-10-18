package br.edu.ifba.pooinf008.UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;
import br.edu.ifba.pooinf008.model.AreaMonitorada;
import br.edu.ifba.pooinf008.model.Localizacao;

public class JanelaUI extends JFrame implements ActionListener{
	
	JButton jb1 = new JButton("Monitorar");
	JTextField txt1 = new JTextField();
	
	public JanelaUI() {
		setVisible(true);
		setTitle("Sistema de Monitoramento");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setLayout(new BorderLayout());
		jb1.setBounds(200, 300, 100, 50);
		add(jb1);
		jb1.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//AreaMonitoradaIF am = new AreaMonitorada();
		//am.monitorar(new Localizacao(1.9, 2.0), true, true, true, true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new JanelaUI();
	}




}
