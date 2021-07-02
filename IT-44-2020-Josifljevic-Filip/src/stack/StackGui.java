package stack;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import geometry.Rectangle;

public class StackGui extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Rectangle> dlm=new DefaultListModel<Rectangle>();
	private ArrayList<Rectangle> stacklist=new ArrayList<Rectangle>();
	JList<Rectangle> lstStack = new JList<Rectangle>();
	private Iterator<Rectangle> it=stacklist.iterator();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StackGui frame = new StackGui();
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
	public StackGui() {
		setTitle("Josifljevic Filip IT-44-2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_pnlCenter = new GroupLayout(pnlCenter);
		gl_pnlCenter.setHorizontalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCenter.createSequentialGroup()
					.addGap(28)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		gl_pnlCenter.setVerticalGroup(
			gl_pnlCenter.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlCenter.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		lstStack.setModel(dlm);
		scrollPane.setViewportView(lstStack);
		pnlCenter.setLayout(gl_pnlCenter);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StackDlg dlg=new StackDlg(StackGui.this);
				dlg.setVisible(true);
				stacklist.add(0,dlg.getrect());
				dlm.removeAllElements();
				dlm.addAll(stacklist);
				lstStack.setModel(dlm);
				
			}
		});
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					StackDlg dlg=new StackDlg(StackGui.this);
					dlg.setrect(stacklist.get(0));
					dlg.setVisible(true);
					stacklist.remove(0);
					dlm.removeAllElements();
					dlm.addAll(stacklist);
				}
				catch(Exception exc)
				{
					JOptionPane.showMessageDialog(null,  "Stack is empty!", "Error!", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
						.addComponent(btnRemove, Alignment.TRAILING))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(77)
					.addComponent(btnAdd)
					.addGap(60)
					.addComponent(btnRemove)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
