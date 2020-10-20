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
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import br.edu.ifba.pooinf008.controller.AreaMonitoradaIF;
import br.edu.ifba.pooinf008.model.AreaMonitorada;
import br.edu.ifba.pooinf008.model.Localizacao;
import br.edu.ifba.pooinf008.model.UnidadeMonitora;

import javax.swing.JFormattedTextField;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;

public class Window extends JFrame implements ActionListener {
	private Localizacao coordenadas;

	private JTextField textFieldLatitude;
	private JTextField textFieldLongitude;
	private JTextField textFieldID;
	private JCheckBox videoCheckBox;
	private JCheckBox termometroCheckBox;
	private JCheckBox co2CheckBox;
	private JCheckBox ch4CheckBox;
	private JButton monitorarBtn;
	private JTextField textFieldLocalizacao;
	private JTextField textFieldTermometro;
	private JTextField textFieldVideo;
	private JTextField textFieldCo2;
	private JTextField textFieldCh4;
	private AreaMonitoradaIF am = new AreaMonitorada();

	public Window() {
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Sistema de Monitoramento");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(500, 500));
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		this.render();
	}

	private void render() {

		JPanel coordenadas = new JPanel();
		coordenadas.setBorder(new EmptyBorder(20, 10, 20, 10));
		getContentPane().add(coordenadas, BorderLayout.NORTH);
		coordenadas.setLayout(new BoxLayout(coordenadas, BoxLayout.X_AXIS));

		JPanel pnlLocalizacao = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnlLocalizacao.getLayout();
		flowLayout_2.setVgap(0);
		flowLayout_2.setHgap(30);
		pnlLocalizacao
				.setBorder(new TitledBorder(null, "Localizacao", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		coordenadas.add(pnlLocalizacao);

		JLabel lblLatitude = new JLabel("Latitude");
		pnlLocalizacao.add(lblLatitude);

		textFieldLatitude = new JTextField();
		pnlLocalizacao.add(textFieldLatitude);
		textFieldLatitude.setColumns(10);

		JLabel lblLongitude = new JLabel("Longitutde");
		pnlLocalizacao.add(lblLongitude);

		textFieldLongitude = new JTextField();
		pnlLocalizacao.add(textFieldLongitude);
		textFieldLongitude.setColumns(10);

		JPanel sensores = new JPanel();
		FlowLayout flowLayout = (FlowLayout) sensores.getLayout();
		flowLayout.setHgap(50);
		flowLayout.setVgap(10);
		getContentPane().add(sensores, BorderLayout.CENTER);

		JPanel Sensors = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) Sensors.getLayout();
		flowLayout_1.setHgap(47);
		Sensors.setBorder(new TitledBorder(null, "Sensores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sensores.add(Sensors);

		JPanel panel = new JPanel();
		Sensors.add(panel);

		JLabel lblVideo = new JLabel("Video");
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

		JLabel lblCh4 = new JLabel("CH4");
		panel_3.add(lblCh4);
		ch4CheckBox = new JCheckBox("");
		panel_3.add(ch4CheckBox);

		JPanel Unidade_E = new JPanel();
		Unidade_E.setAutoscrolls(true);
		Unidade_E.setSize(new Dimension(150, 0));
		FlowLayout fl_Unidade_E = (FlowLayout) Unidade_E.getLayout();
		fl_Unidade_E.setVgap(10);
		fl_Unidade_E.setHgap(10);
		Unidade_E.setBorder(
				new TitledBorder(null, "Unidade encontrada", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sensores.add(Unidade_E);

		JPanel retorno = new JPanel();
		retorno.setSize(new Dimension(140, 5));
		retorno.setMinimumSize(new Dimension(40, 10));
		Unidade_E.add(retorno);
		retorno.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_4 = new JPanel();
		retorno.add(panel_4);

		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.BLACK);
		panel_4.add(lblId);

		textFieldID = new JTextField();
		textFieldID.setForeground(Color.RED);
		panel_4.add(textFieldID);
		textFieldID.setColumns(16);
		textFieldID.setEnabled(false);

		JLabel lblLocalizacao = new JLabel("Localização:");
		panel_4.add(lblLocalizacao);

		textFieldLocalizacao = new JTextField();
		textFieldLocalizacao.setForeground(Color.GREEN);
		panel_4.add(textFieldLocalizacao);
		textFieldLocalizacao.setColumns(16);
		textFieldLocalizacao.setEnabled(false);

		JPanel panel_6 = new JPanel();
		retorno.add(panel_6);

		JLabel lblVid = new JLabel("Video");
		lblVid.setForeground(Color.BLACK);
		panel_6.add(lblVid);

		textFieldVideo = new JTextField();
		textFieldVideo.setForeground(Color.RED);
		panel_6.add(textFieldVideo);
		textFieldVideo.setColumns(15);
		textFieldVideo.setEnabled(false);
		

		JLabel lblTerm = new JLabel("Termometro");
		panel_6.add(lblTerm);
		lblTerm.setHorizontalAlignment(SwingConstants.LEFT);

		textFieldTermometro = new JTextField();
		textFieldTermometro.setForeground(Color.GREEN);
		panel_6.add(textFieldTermometro);
		textFieldTermometro.setColumns(15);
		textFieldTermometro.setEnabled(false);

		JPanel panel_7 = new JPanel();
		retorno.add(panel_7);

		JLabel lblc2 = new JLabel("CO2");
		lblc2.setForeground(Color.BLACK);
		panel_7.add(lblc2);

		textFieldCo2 = new JTextField();
		panel_7.add(textFieldCo2);
		textFieldCo2.setColumns(18);
		textFieldCo2.setEnabled(false);

		JLabel lblNewLabel = new JLabel("CH4");
		panel_7.add(lblNewLabel);

		textFieldCh4 = new JTextField();
		textFieldCh4.setForeground(Color.GREEN);
		panel_7.add(textFieldCh4);
		textFieldCh4.setColumns(18);
		textFieldCh4.setEnabled(false);

		JPanel monitorar = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) monitorar.getLayout();
		getContentPane().add(monitorar, BorderLayout.SOUTH);

		JPanel panel_5 = new JPanel();
		monitorar.add(panel_5);
		monitorarBtn = new JButton("Monitorar");
		monitorarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UnidadeMonitora u = am.getUnidadeById(buscarUnidade());
					String unidadeId = buscarUnidade();
					textFieldID.setText(unidadeId);
					textFieldLocalizacao.setText(String.valueOf(u.getLocalizacao().toString()));
					textFieldTermometro.setText(String.valueOf(u.getTermometro()));
					textFieldVideo.setText(String.valueOf(u.getVideo()));
					textFieldCo2.setText(String.valueOf(u.getCo2()));
					textFieldCh4.setText(String.valueOf(u.getCh4()));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
						    "NENHUMA UNIDADE ENCONTRADA",
						    "NOT FOUND ERROR",
						    JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});
		panel_5.add(monitorarBtn);

	}

	private String buscarUnidade() {

		Double latitude = Double.parseDouble(this.textFieldLatitude.getText());
		Double longitude = Double.parseDouble(this.textFieldLongitude.getText());
		Boolean video = Boolean.valueOf(this.videoCheckBox.isSelected());
		Boolean termometro = Boolean.valueOf(this.termometroCheckBox.isSelected());
		Boolean co2 = Boolean.valueOf(this.co2CheckBox.isSelected());
		Boolean ch4 = Boolean.valueOf(this.ch4CheckBox.isSelected());

		String idUnidade = am.monitorar(new Localizacao(latitude, longitude), video, termometro, co2, ch4);
		return idUnidade;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
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
