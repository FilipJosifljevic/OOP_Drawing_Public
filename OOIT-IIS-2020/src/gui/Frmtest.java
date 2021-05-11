package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Frmtest extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup btnGroup=new ButtonGroup();
	private DefaultListModel<String> dlm=new DefaultListModel<String>();
	private JLabel lblCrvena = new JLabel("Crvena");
	private JLabel lblPlava = new JLabel("Plava");
	private JLabel lblZuta = new JLabel("Zuta");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frmtest frame = new Frmtest();
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
	public Frmtest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlNorth = new JPanel();
		contentPane.add(pnlNorth, BorderLayout.NORTH);
		
		JLabel lblNaslov = new JLabel("Naslov");
		pnlNorth.add(lblNaslov);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JButton btnIspisi = new JButton("Ispisi");
		btnIspisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Antistress button :)");
			}
		});
		pnlSouth.add(btnIspisi);
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		JToggleButton tglBtnCrvena = new JToggleButton("Crvena");
		btnGroup.add(tglBtnCrvena);;
		tglBtnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblCrvena.getText());
				if(tglBtnCrvena.isSelected())
				{
					lblCrvena.setForeground(Color.RED);
					lblPlava.setForeground(Color.BLACK);
					lblZuta.setForeground(Color.BLACK);
				}
			}
		});
		GridBagConstraints gbc_tglBtnCrvena = new GridBagConstraints();
		gbc_tglBtnCrvena.fill = GridBagConstraints.BOTH;
		gbc_tglBtnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_tglBtnCrvena.gridx = 0;
		gbc_tglBtnCrvena.gridy = 0;
		pnlCenter.add(tglBtnCrvena, gbc_tglBtnCrvena);
		
		
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 0;
		pnlCenter.add(lblCrvena, gbc_lblCrvena);
		
		JScrollPane scrlPaneBoje = new JScrollPane();
		GridBagConstraints gbc_scrlPaneBoje = new GridBagConstraints();
		gbc_scrlPaneBoje.gridheight = 3;
		gbc_scrlPaneBoje.gridwidth=4;
		gbc_scrlPaneBoje.insets = new Insets(0, 0, 5, 0);
		gbc_scrlPaneBoje.fill = GridBagConstraints.BOTH;
		gbc_scrlPaneBoje.gridx = 2;
		gbc_scrlPaneBoje.gridy = 0;
		pnlCenter.add(scrlPaneBoje, gbc_scrlPaneBoje);
		
		JList listBoje = new JList();
		listBoje.setLayoutOrientation(JList.VERTICAL_WRAP);
		scrlPaneBoje.setViewportView(listBoje);
		listBoje.setModel(dlm);
		
		JToggleButton tglBtnPlava = new JToggleButton("Plava");
		btnGroup.add(tglBtnPlava);
		tglBtnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblPlava.getText());
				if(tglBtnPlava.isSelected())
				{
					lblCrvena.setForeground(Color.BLACK);
					lblPlava.setForeground(Color.BLUE);
					lblZuta.setForeground(Color.BLACK);
				}
			}
		});
		GridBagConstraints gbc_tglBtnPlava = new GridBagConstraints();
		gbc_tglBtnPlava.fill = GridBagConstraints.BOTH;
		gbc_tglBtnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_tglBtnPlava.gridx = 0;
		gbc_tglBtnPlava.gridy = 1;
		pnlCenter.add(tglBtnPlava, gbc_tglBtnPlava);
		
		
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 1;
		pnlCenter.add(lblPlava, gbc_lblPlava);
		
		JToggleButton tglBtnZuta = new JToggleButton("Zuta");
		btnGroup.add(tglBtnZuta);
		tglBtnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(lblZuta.getText());
				if(tglBtnZuta.isSelected())
				{
					lblCrvena.setForeground(Color.BLACK);
					lblPlava.setForeground(Color.BLACK);
					lblZuta.setForeground(Color.YELLOW);
				}
			}
		});
		GridBagConstraints gbc_tglBtnZuta = new GridBagConstraints();
		gbc_tglBtnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglBtnZuta.insets = new Insets(0, 0, 0, 5);
		gbc_tglBtnZuta.gridx = 0;
		gbc_tglBtnZuta.gridy = 2;
		pnlCenter.add(tglBtnZuta, gbc_tglBtnZuta);
		
		
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 0, 5);
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 2;
		pnlCenter.add(lblZuta, gbc_lblZuta);
	}

}
