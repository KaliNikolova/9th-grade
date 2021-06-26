import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class Tree extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeight;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JTextField txtWidth;
	private JTextField txtWidthKorona;
	private JPanel pnl;
	private JButton btnDraw;
	private JLabel lblMax;
	private JLabel lblMax_1;
	private JLabel lblMax_2;
	private JLabel lblDrawATree;
	// int width;
	// int height;
	// int widthKorona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tree frame = new Tree();
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
	public Tree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnl = new JPanel();
		pnl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnl.setBounds(30, 30, 400, 500);
		contentPane.add(pnl);

		txtHeight = new JTextField();
		txtHeight.setBounds(520, 95, 146, 26);
		contentPane.add(txtHeight);
		txtHeight.setColumns(10);

		txtWidth = new JTextField();
		txtWidth.setBounds(520, 233, 146, 26);
		contentPane.add(txtWidth);
		txtWidth.setColumns(10);

		txtWidthKorona = new JTextField();
		txtWidthKorona.setBounds(520, 373, 146, 26);
		contentPane.add(txtWidthKorona);
		txtWidthKorona.setColumns(10);

		btnDraw = new JButton("Draw the tree");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int width = Integer.parseInt(txtWidth.getText());
				int height = Integer.parseInt(txtHeight.getText());
				int widthKorona = Integer.parseInt(txtWidthKorona.getText());

				Graphics2D g = (Graphics2D) pnl.getGraphics();
				g.setColor(pnl.getBackground());
				g.fillRect(0, 0, 400, 500);
				g.setColor(Color.BLACK);
				int startStylb;

				for (int y = 250; y < height * 10 + 250; y += 10) {
					startStylb = 200 - 5 * width + 2;
					for (int x = 0; x < width; x++) {
						g.drawLine(startStylb, y, startStylb + 5, y);
						startStylb += 10;
					}
				}
				int startKorona=200 - 5 * widthKorona + 2;
				int y=250;
				for(int i=widthKorona;i>0;i--) {
					y-=10;
					startKorona=200 - 5 * widthKorona + 2+(widthKorona-i)*5;
					
					for(int k=1;k<=i;k++) {
						g.drawLine(startKorona, y, startKorona+5, y);
						startKorona+=10;
					}
					
				}
			}
		});
		btnDraw.setBounds(502, 501, 164, 29);
		contentPane.add(btnDraw);

		label = new JLabel(
				"\u0412\u0438\u0441\u043E\u0447\u0438\u043D\u0430 \u043D\u0430 \u0441\u044A\u043B\u0431\u0430:");
		label.setBounds(520, 59, 164, 20);
		contentPane.add(label);

		lblNewLabel = new JLabel(
				"\u0428\u0438\u0440\u043E\u0447\u0438\u043D\u0430 \u043D\u0430 \u0441\u0442\u044A\u043B\u0431\u0430:");
		lblNewLabel.setBounds(520, 197, 164, 20);
		contentPane.add(lblNewLabel);

		label_1 = new JLabel(
				"\u0428\u0438\u0440\u043E\u0447\u0438\u043D\u0430 \u043D\u0430 \u043A\u043E\u0440\u043E\u043D\u0430\u0442\u0430:");
		label_1.setBounds(520, 337, 191, 20);
		contentPane.add(label_1);
		
		lblMax = new JLabel("( max-25 )");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMax.setBounds(520, 75, 94, 20);
		contentPane.add(lblMax);
		
		lblMax_1 = new JLabel("( max-40 )");
		lblMax_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMax_1.setBounds(520, 213, 94, 20);
		contentPane.add(lblMax_1);
		
		lblMax_2 = new JLabel("( max-25 )");
		lblMax_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMax_2.setBounds(520, 353, 94, 20);
		contentPane.add(lblMax_2);
		
		lblDrawATree = new JLabel("Draw a tree!");
		lblDrawATree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDrawATree.setBounds(520, 23, 146, 20);
		contentPane.add(lblDrawATree);
	}
}
