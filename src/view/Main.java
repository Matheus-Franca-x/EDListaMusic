package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import matheus.ListaString.ListaString;

public class Main {

	public static void main(String[] args) 
	{
		ListaString lista = new ListaString();
		int op = -1;
		
		PlayerController controll = new PlayerController();
		
		//Apenas musica de Cultura
		controll.adicionaMusica(lista, "Cold Cold Cold;Cage The Elephant;3:35");
		controll.adicionaMusica(lista, "Coracao de Gelo;WIU;2:48");
		controll.adicionaMusica(lista, "Sunkissed;Khai Dreams;2:08");
		controll.adicionaMusica(lista, "When I Get Old;Christopher e CHUNG HA;3:05");
		controll.adicionaMusica(lista, "MC POZE NOS ANOS 80;PMM;2:50");
		controll.adicionaMusica(lista, "Enemy;Imagine Dragons;2:54");
		controll.adicionaMusica(lista, "Bones;Imagine Dragons;2:46");
		controll.adicionaMusica(lista, "Ashes;Stellar;2:47");
		controll.adicionaMusica(lista, "Your Soul;Forrest;2:59");
		controll.adicionaMusica(lista, "The Moss;Cosmo Sheldrake;4:03");
		controll.adicionaMusica(lista, "Sick of U;BoyWithUke;2:49");
		controll.adicionaMusica(lista, "Urdestand;BoyWithUke;2:52");
		controll.adicionaMusica(lista, "Long Drive;BoyWithUke;2:40");
		controll.adicionaMusica(lista, "Stressed Out;Twenty One Pilots;3:23");
		
		while (op != 9)
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("Opcoes da playlist: \n" + 
															  "1 - Add musica.\n" +
															  "2 - Remove musica.\n" +
															  "3 - Mostra playlist.\n" +
															  "9 - Saida!"));
			switch (op)
			{
				case 1:
					String musica = JOptionPane.showInputDialog("Digite o nome da musica: ") + ";" +
									JOptionPane.showInputDialog("Digite o nome do artista: ") + ";" +
									JOptionPane.showInputDialog("Digite o tempo da musica: \nExemplo: 1:24");
					controll.adicionaMusica(lista, musica);
					break;
				case 2:
				try {
					controll.executaPlaylist(lista);
					int musicRemove = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao da musica para excluir: "));
					controll.removeMusica(lista, musicRemove);
					System.out.println("\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
					break;
				case 3:
					controll.executaPlaylist(lista);
					break;
				case 9:
					
					break;
				default:
						JOptionPane.showMessageDialog(null, "Opcao invalida!");
			
			}
			
		}
		
		
		controll.executaPlaylist(lista);
		
	}

}
