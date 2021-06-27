package edu.school.restaurant;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Proekt3 extends JFrame {

	private JPanel contentPane;
	static Color brown = new Color(139, 69, 19);
	private JPanel pnl;
	private JButton btnShowtables;
	JLabel lblsmetka;
	JFrame frame1;
	double smetka = 0;
	double smetka2=0;
	Object[] menu = { "supichka", "osnowno", "desert" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proekt3 frame = new Proekt3();
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

	public static void Masa(Graphics2D g, int x, int y) {
		g.setColor(brown);
		g.fillRect(x, y, 150, 100);

	}

	public static void Menu(int x, int y, int height, int width) {

	}

	public Proekt3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pnl = new JPanel();
		pnl.setBounds(23, 11, 454, 409);
		contentPane.add(pnl);
		pnl.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();

				if (x <= 190 && x >= 40 && y <= 120 && y >= 20){
					/*
					 * ||(y<=120&&y>=20&&x>=280&&x<=430)||(x<=310&&x>=160&&y>=
					 * 140&&y<=240)||(x<=190&&x>=40&&y>=260&&y<=360)||(x>=280&&x
					 * <=430&&y>=260&&y<=360))
					 * 
					 * { String s = (String) JOptionPane.showInputDialog(null,
					 * "blablabla", "masa1", JOptionPane.PLAIN_MESSAGE, null,
					 * menu, null);
					 * 
					 * }
					 */
				frame1 = new JFrame("List Model Example");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setContentPane(new ListModelExample());
				frame1.setSize(360, 300);
				frame1.setVisible(true);
				JButton btnSoup = new JButton("Супа");

				JPanel contentPane1 = new JPanel();
				contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame1.setContentPane(contentPane1);
				contentPane1.setLayout(null);
				btnSoup.setBounds(20, 20, 100, 20);
				contentPane1.add(btnSoup);
				btnSoup.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka = smetka + 2.50;
						String pari = Double.toString(smetka);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				lblsmetka = new JLabel();
				lblsmetka.setBounds(240, 200, 90, 30);
				lblsmetka.setVisible(true);

				contentPane1.add(lblsmetka);
				
				}
				if (y<=120&&y>=20&&x>=280&&x<=430){
					/*
					 * ||(y<=120&&y>=20&&x>=280&&x<=430)||(x<=310&&x>=160&&y>=
					 * 140&&y<=240)||(x<=190&&x>=40&&y>=260&&y<=360)||(x>=280&&x
					 * <=430&&y>=260&&y<=360))
					 * 
					 * { String s = (String) JOptionPane.showInputDialog(null,
					 * "blablabla", "masa1", JOptionPane.PLAIN_MESSAGE, null,
					 * menu, null);
					 * 
					 * }
					 */
				frame1 = new JFrame("List Model Example");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setContentPane(new ListModelExample());
				frame1.setSize(360, 600);
				frame1.setVisible(true);
				JButton btnSoup = new JButton("Пилешка супа-2,50");

				JPanel contentPane1 = new JPanel();
				contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
				frame1.setContentPane(contentPane1);
				contentPane1.setLayout(null);
				
				lblsmetka = new JLabel();
				lblsmetka.setBounds(240, 200, 90, 30);
				lblsmetka.setVisible(true);

				contentPane1.add(lblsmetka);
				
				String pari = Double.toString(smetka2);
				lblsmetka.setText("Сметка = " + pari);
				btnSoup.setBounds(20, 20, 190, 20);
				contentPane1.add(btnSoup);
				btnSoup.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 2.50;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnSoup2 = new JButton("Таратор-2,00");
				btnSoup2.setBounds(20, 40, 190, 20);
				contentPane1.add(btnSoup2);
				btnSoup2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 2.00;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnSoup3 = new JButton("Шкембе-3,00");
				btnSoup3.setBounds(20, 60, 190, 20);
				contentPane1.add(btnSoup3);
				btnSoup3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 3.00;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnSalata1 = new JButton("Шопска салата-4,50");
				btnSalata1.setBounds(20, 80, 190, 20);
				contentPane1.add(btnSalata1);
				btnSalata1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 4.50;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnSalata2 = new JButton("Гръцка салата-4,80");
				btnSalata2.setBounds(20, 100, 190, 20);
				contentPane1.add(btnSalata2);
				btnSalata2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 4.80;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno1 = new JButton("Боб с наденица-5,70");
				btnOsnovno1.setBounds(20, 120, 190, 20);
				contentPane1.add(btnOsnovno1);
				btnOsnovno1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 5.70;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno2 = new JButton("Пиле с ориз-6,70");
				btnOsnovno2.setBounds(20, 140, 190, 20);
				contentPane1.add(btnOsnovno2);
				btnOsnovno2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 6.70;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno3 = new JButton("Пържола-4,40");
				btnOsnovno3.setBounds(20, 160, 190, 20);
				contentPane1.add(btnOsnovno3);
				btnOsnovno3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 4.40;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno4 = new JButton("Кебабче-1,20");
				btnOsnovno4.setBounds(20, 180, 190, 20);
				contentPane1.add(btnOsnovno4);
				btnOsnovno4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 1.20;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno5 = new JButton("Кюфте-1,20");
				btnOsnovno5.setBounds(20, 200, 190, 20);
				contentPane1.add(btnOsnovno5);
				btnOsnovno5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 1.20;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnOsnovno6 = new JButton("Пържени картофи-2,00");
				btnOsnovno6.setBounds(20, 220, 190, 20);
				contentPane1.add(btnOsnovno6);
				btnOsnovno6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 2.00;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnDesert = new JButton("Кекс-2,20");
				btnDesert.setBounds(20, 240, 190, 20);
				contentPane1.add(btnDesert);
				btnDesert.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 2.20;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnDesert2 = new JButton("Бисквитена торта-3,10");
				btnDesert2.setBounds(20, 260, 190, 20);
				contentPane1.add(btnDesert2);
				btnDesert2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 3.10;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnNapitka1 = new JButton("Сок Cappy-2,00");
				btnNapitka1.setBounds(20, 280, 190, 20);
				contentPane1.add(btnNapitka1);
				btnNapitka1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						smetka2 = smetka2 + 2.00;
						String pari = Double.toString(smetka2);
						lblsmetka.setText("Сметка = " + pari);

					}
				});
				JButton btnNapitka2 = new JButton("Вода-1,20");
						btnNapitka2.setBounds(20, 300, 190, 20);
						contentPane1.add(btnNapitka2);
						btnNapitka2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								smetka2 = smetka2 + 1.20;
								String pari = Double.toString(smetka2);
								lblsmetka.setText("Сметка = " + pari);

					}
				});
						JButton btnNapitka3 = new JButton("Кока Кола-2,00");
						btnNapitka3.setBounds(20, 320, 190, 20);
						contentPane1.add(btnNapitka3);
						btnNapitka3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								smetka2 = smetka2 + 2.00;
								String pari = Double.toString(smetka2);
								lblsmetka.setText("Сметка = " + pari);

							}
						});
						JButton btnNapitka4 = new JButton("Кафе-1,00");
						btnNapitka4.setBounds(20, 340, 190, 20);
						contentPane1.add(btnNapitka4);
						btnNapitka4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								smetka2 = smetka2 + 1.00;
								String pari = Double.toString(smetka2);
								lblsmetka.setText("Сметка = " + pari);
							}});
						JButton btnSmetka = new JButton("Нулирай");
						btnSmetka.setBounds(220,150,100,20);
						contentPane1.add(btnSmetka);
						btnSmetka.addActionListener(new ActionListener()
								{
							public void actionPerformed(ActionEvent arg0){
								smetka2=0.00;
								String pari = Double.toString(smetka2);
								lblsmetka.setText("Сметка = " + pari);
							}
								});

							
			
				}
			
			}
		});
		
		btnShowtables = new JButton("ShowTables");

		btnShowtables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics2D g = (Graphics2D) pnl.getGraphics();
				Masa(g, 40, 20);
				Masa(g, 280, 20);
				Masa(g, 160, 140);
				Masa(g, 40, 260);
				Masa(g, 280, 260);

			}

		});
		btnShowtables.setBounds(531, 23, 120, 23);
		contentPane.add(btnShowtables);
		
	}
	
}
