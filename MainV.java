	package nathan303;
	
	import javax.swing.JOptionPane;
	import java.util.*;
	
	public class MainV {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Veiculo v = new Veiculo("1", "Toyota", "Supra", "Branco", 2, 200, 2);
			Veiculo v2 = new Veiculo("2", "Nissan", "Skyline", "Branco", 2, 100, 3);
			Veiculo v3 = new Veiculo("3", "Dodge", "Charger", "Cinza", 2, 150, 4);
			Veiculo v4 = new Veiculo("4", "Chevrolet", "Camaro ", "Azul", 2, 200, 5);
			Veiculo v5 = new Veiculo("5", "Honda", "Civic turbo", "Preto", 2, 170, 1);
			ArrayList<Veiculo> AL = new ArrayList();
	
			AL.add(v);
			AL.add(v2);
			AL.add(v3);
			AL.add(v4);
			AL.add(v5);
			
			
			
			for (int i = 0; i < 1; i++) {
				int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("Digite se deseja criar um veiculo novo ou escolher uma das opções: \n(1) 1\n(2) 2\n(3) 3\n(4) 4\n(5) 5\n(6) Criar outro\n(7) Finalizar progama"));
				
				switch (escolha2) {
				case 1:
					JOptionPane.showInputDialog(v);
					break;
				case 2:
					JOptionPane.showInputDialog(v2);
					break;
				case 3:
					JOptionPane.showInputDialog(v3);
					break;
				case 4:
					JOptionPane.showInputDialog(v4);
					break;
				case 5:
					JOptionPane.showInputDialog(v5);
					break;
				case 6:
					String codigo = JOptionPane.showInputDialog("Código do veiculo: ");
					String marcas = JOptionPane.showInputDialog("Marca do veiculo: ");
					String modelo = JOptionPane.showInputDialog("Modelo do veiculo: ");
					String cores = JOptionPane.showInputDialog("Cor do veiculo: ");
					int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Pessoas que irão no veiculo: "));
					int potencia = Integer.parseInt(JOptionPane.showInputDialog("Potência do veiculo: "));
					int chassinr = Integer.parseInt(JOptionPane.showInputDialog("Chassi do veiculo: "));
					
	
					
					Veiculo n = new Veiculo(codigo, marcas, modelo, cores, pessoas, potencia, chassinr);
					String veiculo = JOptionPane.showInputDialog("Veiculo criado!" + n);
					break;
				    case 7:
				    String encerrar  = JOptionPane.showInputDialog("Progama encerrado!");
					break;
					default:
						String numero = JOptionPane.showInputDialog("Numero incorreto!");
						break;
				}
	
			}
		}
	}
