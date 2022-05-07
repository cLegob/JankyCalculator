import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class Calculator extends javax.swing.JFrame {

	public static String display = " ";

	public Calculator() {
		initComponents();
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		Button1 = new javax.swing.JButton();
		Button3 = new javax.swing.JButton();
		Button2 = new javax.swing.JButton();
		Button4 = new javax.swing.JButton();
		Button0 = new javax.swing.JButton();
		Button5 = new javax.swing.JButton();
		Button6 = new javax.swing.JButton();
		Multiply = new javax.swing.JButton();
		Button7 = new javax.swing.JButton();
		Button8 = new javax.swing.JButton();
		Button9 = new javax.swing.JButton();
		Negative = new javax.swing.JButton();
		Clear = new javax.swing.JButton();
		decimal = new javax.swing.JButton();
		equals = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		Divide = new javax.swing.JButton();
		Plus = new javax.swing.JButton();
		Minus = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Button1.setText("1");
		Button1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button1ActionPerformed(evt);
			}
		});

		Button3.setText("3");
		Button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button3ActionPerformed(evt);
			}
		});

		Button2.setText("2");
		Button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button2ActionPerformed(evt);
			}
		});

		Button4.setText("4");
		Button4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button4ActionPerformed(evt);
			}
		});

		Button0.setText("0");
		Button0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button0ActionPerformed(evt);
			}
		});

		Button5.setText("5");
		Button5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button5ActionPerformed(evt);
			}
		});

		Button6.setText("6");
		Button6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button6ActionPerformed(evt);
			}
		});

		Multiply.setText("*");
		Multiply.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MultiplyActionPerformed(evt);
			}
		});

		Button7.setText("7");
		Button7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button7ActionPerformed(evt);
			}
		});

		Button8.setText("8");
		Button8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button8ActionPerformed(evt);
			}
		});

		Button9.setText("9");
		Button9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Button9ActionPerformed(evt);
			}
		});

		Negative.setText("-num");
		Negative.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NegativeActionPerformed(evt);
			}
		});

		Clear.setText("C");
		Clear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ClearActionPerformed(evt);
			}
		});

		decimal.setText(".");
		decimal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				decimalActionPerformed(evt);
			}
		});

		equals.setText("=");
		equals.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				equalsActionPerformed(evt);
			}
		});

		jLabel1.setText("Janky Calculator");

		Divide.setText("/");
		Divide.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DivideActionPerformed(evt);
			}
		});

		Plus.setText("+");
		Plus.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PlusActionPerformed(evt);
			}
		});

		Minus.setText("-");
		Minus.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MinusActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup().addComponent(Button1)
														.addGap(10, 10, 10).addComponent(Button2))
												.addComponent(Negative, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup().addComponent(Button3)
														.addGap(18, 18, 18).addComponent(Multiply,
																javax.swing.GroupLayout.PREFERRED_SIZE, 50,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addComponent(Button4).addGap(10, 10, 10)
										.addComponent(Button5).addGap(10, 10, 10).addComponent(Button6)
										.addGap(18, 18, 18).addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE,
												50, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addComponent(Button7).addGap(10, 10, 10)
										.addComponent(Button8).addGap(10, 10, 10).addComponent(Button9)
										.addGap(18, 18, 18).addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE,
												50, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addComponent(Clear).addGap(10, 10, 10)
										.addComponent(Button0).addGap(10, 10, 10)
										.addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(layout.createSequentialGroup().addGap(70, 70, 70).addComponent(jLabel1)))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(8, 8, 8).addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(
						jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(6, 6, 6)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(Negative, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(6, 6, 6)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(11, 11, 11)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(11, 11, 11)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(11, 11, 11)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(2, 2, 2)));

		pack();
	}

	private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "7";
		jTextField1.setText(display);
	}

	private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "1";
		jTextField1.setText(display);
	}

	private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "2";
		jTextField1.setText(display);
	}

	private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "4";
		jTextField1.setText(display);
	}

	private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "5";
		jTextField1.setText(display);
	}

	private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "6";
		jTextField1.setText(display);
	}

	private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "8";
		jTextField1.setText(display);
	}

	private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "9";
		jTextField1.setText(display);
	}

	private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "0";
		jTextField1.setText(display);
	}

	private void ClearActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display = " ";
		jTextField1.setText(display);
	}

	private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += "3";
		jTextField1.setText(display);
	}

	private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += " * ";
		jTextField1.setText(display);
	}

	private void NegativeActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += " -";
		jTextField1.setText(display);
	}

	private void decimalActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += ".";
		jTextField1.setText(display);
	}

	private void equalsActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			display = engine.eval(jTextField1.getText()).toString();
			jTextField1.setText(display);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void DivideActionPerformed(java.awt.event.ActionEvent evt) {
		display += " / ";
		jTextField1.setText(display);
	}

	private void PlusActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += " + ";
		jTextField1.setText(display);
	}

	private void MinusActionPerformed(java.awt.event.ActionEvent evt) {
		display = jTextField1.getText();
		display += " - ";
		jTextField1.setText(display);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Calculator().setVisible(true);
			}
		});
	}

	private javax.swing.JButton Button0;
	private javax.swing.JButton Button1;
	private javax.swing.JButton Button2;
	private javax.swing.JButton Button3;
	private javax.swing.JButton Button4;
	private javax.swing.JButton Button5;
	private javax.swing.JButton Button6;
	private javax.swing.JButton Button7;
	private javax.swing.JButton Button8;
	private javax.swing.JButton Button9;
	private javax.swing.JButton Clear;
	private javax.swing.JButton Divide;
	private javax.swing.JButton Minus;
	private javax.swing.JButton Multiply;
	private javax.swing.JButton Negative;
	private javax.swing.JButton Plus;
	private javax.swing.JButton decimal;
	private javax.swing.JButton equals;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField jTextField1;

}
