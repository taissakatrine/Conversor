package HelloSwing;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorMetros {
    public static void main(String[] args) {
    	try {
    	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    	        if ("Nimbus".equals(info.getName())) {
    	            javax.swing.UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (Exception ex) {
    	    ex.printStackTrace();
    	}
    	

        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }

    public static void criarTela() {
    	
        JFrame tela = new JFrame("Conversor de Comprimento");
        JTextField cmTextField = new JTextField(10);
        cmTextField.setFont(new Font("Serif", Font.BOLD, 14));
        cmTextField.setBackground(Color.PINK);
        cmTextField.setForeground(Color.DARK_GRAY);
        JLabel cmLabel = new JLabel("cm");
        JButton convertMButton = new JButton("Metros");
        JButton convertMMButton = new JButton("Milímetros");
        JButton convertKMButton = new JButton("Quilômetros");
        JLabel valorConvertidoLabel = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridBagLayout());
        painelDeConteudo.add(cmTextField);
        painelDeConteudo.add(cmLabel);
        painelDeConteudo.add(convertMButton);
        painelDeConteudo.add(convertMMButton);
        painelDeConteudo.add(convertKMButton);
        painelDeConteudo.add(valorConvertidoLabel);

        convertMButton.addActionListener((e) -> {
            double cm = Double.parseDouble(cmTextField.getText());
            double m = cm / 100;
            valorConvertidoLabel.setText(String.format("%.2f m", m));
        });

        convertMMButton.addActionListener((e) -> {
            double cm = Double.parseDouble(cmTextField.getText());
            double mm = cm * 10;
            valorConvertidoLabel.setText(String.format("%.2f mm", mm));
        });

        convertKMButton.addActionListener((e) -> {
            double cm = Double.parseDouble(cmTextField.getText());
            double km = cm / 100000;
            valorConvertidoLabel.setText(String.format("%.6f km", km));
        });

        
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}

