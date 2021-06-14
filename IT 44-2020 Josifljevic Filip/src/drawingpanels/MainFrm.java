package drawingpanels;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drawing.PnlDrawing;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private PnlDrawing pnldrawing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
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
	public MainFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 pnldrawing = new PnlDrawing();
		contentPane.add(pnldrawing, BorderLayout.CENTER);
		GroupLayout gl_pnldrawing = new GroupLayout(pnldrawing);
		gl_pnldrawing.setHorizontalGroup(
			gl_pnldrawing.createParallelGroup(Alignment.LEADING)
				.addGap(0, 676, Short.MAX_VALUE)
		);
		gl_pnldrawing.setVerticalGroup(
			gl_pnldrawing.createParallelGroup(Alignment.LEADING)
				.addGap(0, 414, Short.MAX_VALUE)
		);
		pnldrawing.setLayout(gl_pnldrawing);
		
		JPanel PnlButtons = new JPanel();
		contentPane.add(PnlButtons, BorderLayout.EAST);
		
		JButton btnPoint = new JButton("Point");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PointDlg pdlg=new PointDlg(null,MainFrm.this);
				pdlg.setVisible(true);
			}
		});
		
		JButton btnLine = new JButton("Line");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LineDlg ldlg=new LineDlg(null,MainFrm.this);
				ldlg.setVisible(true);
			}
		});
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RectangleDlg rdlg=new RectangleDlg(null,MainFrm.this);
				rdlg.setVisible(true);
			}
		});
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CircleDlg cdlg=new CircleDlg(null,MainFrm.this);
				cdlg.setVisible(true);
			}
		});
		
		JButton btnDonut = new JButton("Donut");
		btnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DonutDlg ddlg=new DonutDlg(null,MainFrm.this);
				ddlg.setVisible(true);
			}
		});
		
		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnErase = new JButton("Erase");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnldrawing.getShapes().remove(pnldrawing.getSel());
				pnldrawing.paint(getGraphics());
				
			}
		});
		GroupLayout gl_PnlButtons = new GroupLayout(PnlButtons);
		gl_PnlButtons.setHorizontalGroup(
			gl_PnlButtons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PnlButtons.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PnlButtons.createParallelGroup(Alignment.LEADING)
						.addComponent(btnPoint, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
						.addComponent(btnLine, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
						.addComponent(btnRectangle, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
						.addComponent(btnCircle, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDonut, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnErase, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_PnlButtons.setVerticalGroup(
			gl_PnlButtons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PnlButtons.createSequentialGroup()
					.addGap(28)
					.addComponent(btnModify)
					.addGap(18)
					.addComponent(btnErase)
					.addGap(89)
					.addComponent(btnPoint)
					.addGap(18)
					.addComponent(btnLine)
					.addGap(18)
					.addComponent(btnRectangle)
					.addGap(18)
					.addComponent(btnCircle)
					.addGap(18)
					.addComponent(btnDonut)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		PnlButtons.setLayout(gl_PnlButtons);
	}
	public PnlDrawing getPnlDrawing()
	{
		return this.pnldrawing;
	}
}
