package view;

import javax.swing.JOptionPane;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		SomatorioController somaCont = new SomatorioController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("insira um número natural: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				int n = Integer.parseInt(input);
				JOptionPane.showMessageDialog(null, "somatório dos " + n + " primeiros números naturais: " + somaCont.somatorio(n));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
	}

}