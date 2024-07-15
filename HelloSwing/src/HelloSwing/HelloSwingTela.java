package HelloSwing;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

	public class HelloSwingTela {
		public static void main(String[] args) {
			 SwingUtilities.invokeLater(() -> {
			 criarTela();
			 });
			}
		 public static void criarTela() {
			  JFrame tela = new JFrame ("Hello, Swing!!!");
			  tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//constroi um JLabel
			  JLabel helloSwingLabel = new JLabel ("Hello, Swing!!!!!!!");
			  //obtem o painel de conteúdo
			  Container painelDeConteudo = tela.getContentPane();
			  //adiciona o JLabel ao painel de conteúdo
			  painelDeConteudo.add(helloSwingLabel);
			//ajusta largura e altura da tela conforme seu conteúdo
			  tela.pack();
			  //torna a tela visível
			  tela.setVisible(true);
		
		 }
}
