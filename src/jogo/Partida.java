package jogo;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Partida {
	private JFrame frmPrincipal;
	private Jogada jogadas;
	private JLabel lblAlg, lblMao;
	private JTextField textField1, textField2;
	private JTextArea textArea;
	private JButton btnCriar; 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Partida window = new Partida();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	public String getCartasBaralho() {
		List<Carta> cartas = this.jogadas.getDeck().getCartas();
		String str = "";
		int cont = 0;
		
		for(Carta c : cartas) {
			cont++;
			str += c.getNumero() + "-" +
					c.getNaipe() + " | ";
			if(cont == 13) {
				str += "\n";
				cont = 0;
			}
		}
		
		return str;
	}
	
	public String getCartasMao() {
		List<Carta> cartas = this.jogadas.getMao();
		String str = "";
		
		for(Carta c : cartas) {
			str += c.getNumero() + "-" +
					c.getNaipe() + " , ";
		}
		str = str.substring (0, str.length());
		
		return str;
	}
	
	public Partida() {
		this.jogadas = new Jogada();
		this.jogadas.getDeck().embaralhar();
		initialize();
		
		// populando os campos
		textArea.setText(this.getCartasBaralho());
		textField1.setText(jogadas.getAlg());
		textField2.setText(this.getCartasMao());
	}
	
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setTitle("Cadastrar Medico");
		frmPrincipal.setResizable(false);
		frmPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPrincipal.setBounds(100, 200, 460, 400);
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		frmPrincipal.setContentPane(contentPane);
		
		lblAlg = new JLabel("Algoritmo");
		lblAlg.setBounds(10, 14, 85, 14);
		contentPane.add(lblAlg);
		
		lblMao= new JLabel("Mão");
		lblMao.setBounds(10, 52, 85, 14);
		contentPane.add(lblMao);
		
		lblMao= new JLabel("Baralho:");
		lblMao.setBounds(10, 83, 85, 14);
		contentPane.add(lblMao);
		
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(10, 114, 440, 194);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		contentPane.add(scroll);
		textArea.setEditable(false);

		textField1 = new JTextField();
		textField1.setBounds(100, 18, 150, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		textField1.setEditable(false);
		
		textField2 = new JTextField();
		textField2.setBounds(100, 49, 150, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		textField2.setEditable(false);
		
		btnCriar = new JButton("Jogar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					// pode ser usado durante o exercicio para exemplo
					//AlgoritmoDasCartas algAleatorio = new AlgoritmoCartaAleatoria();
					//AlgoritmoDasCartas algCima = new AlgoritmoCartaCima();
					
					jogadas.novaJogada();
					
					textArea.setText(getCartasBaralho());
					textField1.setText(jogadas.getAlg());
					textField2.setText(getCartasMao());
				}
				catch (Exception erro) {
					JOptionPane.showMessageDialog(null, erro.getMessage());
				}
			}
		});
		btnCriar.setBounds(150, 330, 150, 23);
		contentPane.add(btnCriar);
	}
}
