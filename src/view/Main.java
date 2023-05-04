package view;

import controller.PlayerController;
import matheus.ListaString.ListaString;
import model.Musica;

public class Main {

	public static void main(String[] args) 
	{
		ListaString lista = new ListaString();
		
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
		
		
		
//		try {
//			controll.removeMusica(lista, 0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		controll.executaPlaylist(lista);
		
	}

}
