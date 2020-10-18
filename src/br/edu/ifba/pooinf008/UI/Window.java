package br.edu.ifba.pooinf008.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

//import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.border.TitledBorder;

import br.edu.ifba.pooinf008.model.AreaMonitorada;
import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

import javax.swing.JFormattedTextField;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JEditorPane;

public class Window extends JFrame implements ActionListener{
	private AreaMonitorada area; 
	private Localizacao coordenadas;
	
	private JTextField textFieldLatitude;
	private JTextField textFieldLongitude;
	private JTextField textFieldID;
	private JCheckBox videoCheckBox;
	private JCheckBox termometroCheckBox;
	private JCheckBox co2CheckBox;
	private JCheckBox ch4CheckBox;
	private JButton monitorarBtn;
	
	
	/**
	 * Launch the application.
	 */
	public Window() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		render();
	}
	
	private void render() {
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Sistema de Monitoramento");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(500, 500));
		
		JPanel coordenadas = new JPanel();
		coordenadas.setBorder(new EmptyBorder(20, 10, 20, 10));
		getContentPane().add(coordenadas, BorderLayout.NORTH);
		coordenadas.setLayout(new BoxLayout(coordenadas, BoxLayout.X_AXIS));
		
		JPanel Localizacao = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) Localizacao.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setHgap(30);
		Localizacao.setBorder(new TitledBorder(null, "Localização", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		coordenadas.add(Localizacao);
		
		JLabel lblLatitude = new JLabel("Latitude");
		Localizacao.add(lblLatitude);
		
		textFieldLatitude = new JTextField();
		Localizacao.add(textFieldLatitude);
		textFieldLatitude.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Longitutde");
		Localizacao.add(lblNewLabel_1);
		
		textFieldLongitude = new JTextField();
		Localizacao.add(textFieldLongitude);
		textFieldLongitude.setColumns(10);
		
		JPanel sensores = new JPanel();
		FlowLayout flowLayout = (FlowLayout) sensores.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setVgap(10);
		getContentPane().add(sensores, BorderLayout.CENTER);
		
		JPanel Sensors = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) Sensors.getLayout();
		flowLayout_1.setVgap(10);
		flowLayout_1.setHgap(45);
		Sensors.setBorder(new TitledBorder(null, "Sensores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sensores.add(Sensors);
		
		JPanel panel = new JPanel();
		Sensors.add(panel);
		
		JLabel lblVideo = new JLabel("Vídeo");
		panel.add(lblVideo);
		
		videoCheckBox = new JCheckBox("");
		panel.add(videoCheckBox);
		
		JPanel panel_1 = new JPanel();
		Sensors.add(panel_1);
		
		JLabel lblTermometro = new JLabel("Termometro");
		panel_1.add(lblTermometro);
		
		termometroCheckBox = new JCheckBox("");
		panel_1.add(termometroCheckBox);
		
		JPanel panel_2 = new JPanel();
		Sensors.add(panel_2);
		
		JLabel lblCo2 = new JLabel("CO2");
		panel_2.add(lblCo2);
		
		co2CheckBox = new JCheckBox("");
		panel_2.add(co2CheckBox);
		
		JPanel panel_3 = new JPanel();
		Sensors.add(panel_3);
		
		JLabel ch4lbl = new JLabel("CH4");
		panel_3.add(ch4lbl);
		
		ch4CheckBox = new JCheckBox("");
		panel_3.add(ch4CheckBox);
		
		JPanel Unidade_E = new JPanel();
		Unidade_E.setAutoscrolls(true);
		Unidade_E.setSize(new Dimension(150, 0));
		FlowLayout fl_Unidade_E = (FlowLayout) Unidade_E.getLayout();
		fl_Unidade_E.setHgap(100);
		Unidade_E.setBorder(new TitledBorder(null, "Unidade encontrada", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sensores.add(Unidade_E);
		
		JPanel retorno = new JPanel();
		retorno.setSize(new Dimension(140, 5));
		retorno.setMinimumSize(new Dimension(40, 10));
		FlowLayout flowLayout_3 = (FlowLayout) retorno.getLayout();
		flowLayout_3.setHgap(10);
		Unidade_E.add(retorno);
		
		JLabel lblId = new JLabel("Id:");
		retorno.add(lblId);
		
		textFieldID = new JTextField();
		textFieldID.setEnabled(false);
		textFieldID.setPreferredSize(new Dimension(40, 19));
		textFieldID.setMinimumSize(new Dimension(40, 19));
		textFieldID.setAlignmentY(1.5f);
		textFieldID.setAlignmentX(1.5f);
		retorno.add(textFieldID);
		textFieldID.setColumns(27);
		
		JPanel monitorar = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) monitorar.getLayout();
		getContentPane().add(monitorar, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		monitorar.add(panel_5);
		
		monitorarBtn = new JButton("Monitorar");
		monitorarBtn.addActionListener(this);
		panel_5.add(monitorarBtn);
		
	}
	
	private void buscarUnidade() {
		Double latitude = Double.valueOf(this.textFieldLatitude.getText());
		Double longitude = Double.valueOf(this.textFieldLongitude.getText());
		Boolean video = Boolean.valueOf(this.videoCheckBox.isSelected());
		Boolean termometro = Boolean.valueOf(this.termometroCheckBox.isSelected());
		Boolean co2 = Boolean.valueOf(this.co2CheckBox.isSelected());
		Boolean ch4 = Boolean.valueOf(this.ch4CheckBox.isSelected());
		
		
		String unidade = area.monitorar(new Localizacao(latitude, longitude), video, termometro, co2, ch4);
	}
	

	public void ActionEvent(ActionEvent arg0) {
		if(arg0.getSource().equals(this.monitorarBtn)) {
			buscarUnidade();
		}
		this.render();
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
