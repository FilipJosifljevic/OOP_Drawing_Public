package stack;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import drawing.Point;
import drawing.Rectangle;

public class StackDlg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtWidth;
	private JTextField txtHeight;
	private Rectangle rect=null;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			StackDlg dialog = new StackDlg();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 * @param stackGui 
	 */
	public StackDlg(JFrame parent) {
		super(parent, true);
		setBounds(100, 100, 404, 394);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblUpperLeftPoint = new JLabel("UpperLeft point coordinates : ");
		
		JLabel lblX = new JLabel("X : ");
		
		JLabel lblY = new JLabel("Y : ");
		
		JLabel lblWidth = new JLabel("Width : ");
		
		JLabel lblHeight = new JLabel("Height : ");
		
		txtX = new JTextField();
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setColumns(10);
		
		txtWidth = new JTextField();
		txtWidth.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(104)
							.addComponent(lblUpperLeftPoint))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(69)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblX)
								.addComponent(lblY, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblWidth, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHeight))
							.addGap(92)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtHeight)
								.addComponent(txtWidth)
								.addComponent(txtY)
								.addComponent(txtX))))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(27)
					.addComponent(lblUpperLeftPoint)
					.addGap(38)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblX)
						.addComponent(txtX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblY)
						.addComponent(txtY))
					.addGap(42)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWidth)
						.addComponent(txtWidth))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHeight)
						.addComponent(txtHeight))
					.addGap(61))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int x=Integer.parseInt(txtX.getText());
					int y=Integer.parseInt(txtY.getText());
					int width=Integer.parseInt(txtWidth.getText());
					int height=Integer.parseInt(txtHeight.getText());
					rect=new Rectangle(new Point(x,y),width,height);
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(119)
						.addComponent(okButton, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(cancelButton, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
						.addGap(121))
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(okButton)
							.addComponent(cancelButton))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
		}
	}
	public void setrect(Rectangle rect) {
		
		if(rect != null) {
			txtX.setText("" + rect.getupperLeft().getX());
			txtY.setText("" + rect.getupperLeft().getY());
			txtHeight.setText("" + rect.getheight());
			txtWidth.setText("" + rect.getwidth());
		}
	}

	public Rectangle getrect()
	{
		return rect;
	}
}
