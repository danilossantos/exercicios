import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Janela extends Frame {
			
	JButton btnFechar, btnEscrever;
	JTextField txtEscrever;
	JLabel lblSaida;
	
		Janela(){
			setBounds(40,60,300,400);
			setLayout(new FlowLayout());
			
			txtEscrever = new JTextField ("Escreva Aqui");
			add(txtEscrever);
			btnFechar = new JButton ("Fechar");
			btnEscrever = new JButton ("Escrever);		
					
			btnFechar.addActionListener(new Acao());
			btnEscrever.addActionListener(new Acao());
			addWindowListener(new FechaJanela());
			
		}	
		class FechaJanela extends WindowAdapter{
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		}
			class Acao
				implements ActionListener{
			
			public void actionPerformed (ActionEvent ae){
						if (ae.getSource() == btnFechar)
							System.exit(0);
					else if (ae.getSource() == btnEscrever)
						lblSaida.setText (txtEscrever.getText());
					}
			}	
}
