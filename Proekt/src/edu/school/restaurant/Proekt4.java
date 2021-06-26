package edu.school.restaurant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Proekt4 extends JFrame {

	private JPanel contentPane;
	double smetka2 = 0;
	DecimalFormat df = new DecimalFormat("#.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proekt4 frame = new Proekt4();
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
	public Proekt4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(createTable("Маса 1"));
		contentPane.add(createTable("Маса 2"));
		contentPane.add(createTable("Маса 3"));
		contentPane.add(createTable("Маса 4"));
		contentPane.add(createTable("Маса 5"));

	}

	JButton createTable(String name) {
		JButton btnMasa = new JButton(name);

		JPanel pnlShow = new JPanel();
		pnlShow.setLayout(new BoxLayout(pnlShow, BoxLayout.Y_AXIS));
		JLabel lblMenu = new JLabel("Поръчки:");
		lblMenu.setPreferredSize(new Dimension(200, 20));
		pnlShow.add(lblMenu);

		JLabel total = new JLabel("0.00");
		btnMasa.setBackground(new Color(160, 82, 45));
		btnMasa.setPreferredSize(new Dimension(200, 100));
		btnMasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total.setText(showMenu(btnMasa, total.getText(), pnlShow));
			}
		});
		return btnMasa;
	}

	String showMenu(JComponent parent, String total, JPanel pnlShow) {
		JLabel lblSmetka = new JLabel(total);

		JPanel pnl = new JPanel(new BorderLayout(10, 10));

		JButton btnNull = new JButton("Нулиране на сметката");
		btnNull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlShow.removeAll();
				JLabel lblMenu = new JLabel("Поръчки:");
				lblMenu.setPreferredSize(new Dimension(200, 20));
				pnlShow.add(lblMenu);
				lblSmetka.setText("0.00");
				pnlShow.repaint();
			}
		});
		pnl.add(btnNull, BorderLayout.NORTH);
		JPanel pnlMenu = new JPanel();
		pnlMenu.setLayout(new BoxLayout(pnlMenu, BoxLayout.Y_AXIS));
		pnl.add(pnlMenu, BorderLayout.WEST);
		pnl.add(new JScrollPane(pnlShow), BorderLayout.EAST);
		pnlMenu.add(meal("Пилешка супа", 2.20, lblSmetka, pnlShow));
		pnlMenu.add(meal("Таратор", 1.50, lblSmetka, pnlShow));
		pnlMenu.add(meal("Шкембе", 3.00, lblSmetka, pnlShow));
		pnlMenu.add(meal("Шопска салата", 3.40, lblSmetka, pnlShow));
		pnlMenu.add(meal("Гръцка салата", 3.40, lblSmetka, pnlShow));
		pnlMenu.add(meal("Боб с наденица", 3.80, lblSmetka, pnlShow));
		pnlMenu.add(meal("Пиле с ориз", 4.10, lblSmetka, pnlShow));
		pnlMenu.add(meal("Пържола", 2.70, lblSmetka, pnlShow));
		pnlMenu.add(meal("Кюфте", 1.00, lblSmetka, pnlShow));
		pnlMenu.add(meal("Кебапче", 1.00, lblSmetka, pnlShow));
		pnlMenu.add(meal("Пържени картофи", 1.50, lblSmetka, pnlShow));
		pnlMenu.add(meal("Кекс", 1.90, lblSmetka, pnlShow));
		pnlMenu.add(meal("Бисквитена торта", 2.60, lblSmetka, pnlShow));
		pnlMenu.add(meal("Кока кола", 1.20, lblSmetka, pnlShow));
		pnlMenu.add(meal("Сок Cappy", 1.20, lblSmetka, pnlShow));
		pnlMenu.add(meal("Кафе", 1.10, lblSmetka, pnlShow));
		pnlMenu.add(meal("Вода", 1.00, lblSmetka, pnlShow));

		JPanel pnlSouth = new JPanel();
		pnlSouth.add(new JLabel("Обща сума: "));
		pnlSouth.add(lblSmetka);
		pnl.add(pnlSouth, BorderLayout.SOUTH);
		JOptionPane.showMessageDialog(parent, pnl, "Menu", JOptionPane.INFORMATION_MESSAGE);
		return lblSmetka.getText();
	}

	JButton meal(String name, double price, JLabel lblSmetka, JPanel pnlShow) {
		JButton btn = new JButton(name + " - " + df.format(price));
		btn.setMaximumSize(new Dimension(200, btn.getPreferredSize().height));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double smetka = Double.parseDouble(lblSmetka.getText());
				smetka += price;

				lblSmetka.setText(df.format(smetka));
				JLabel show = new JLabel(name + " - " + df.format(price));
				pnlShow.add(show);
			}
		});
		return btn;

	}

}
