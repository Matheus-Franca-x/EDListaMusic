package controller;


import matheus.ListaString.ListaString;
import model.Musica;

public class PlayerController 
{
	
	
	public void adicionaMusica(ListaString lista, String musica)
	{
		String[] music = musica.split(";");
		int musicInt;
		
		if (music[2].contains(":"))
		{
			String[] segundos =  music[2].split(":");
			musicInt = Integer.parseInt(segundos[0]) * 60; 
			musicInt += Integer.parseInt(segundos[1]);
		}
		else
		{
			musicInt = Integer.parseInt(music[2]) * 60; 			
		}
		
		
		
		Musica add = new Musica(music[0], music[1], musicInt);
		
		if (lista.isEmpty())
		{
			lista.addFirst(add.toString());			
		}
		else
		{
			try {
				lista.addLast(add.toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void removeMusica(ListaString lista, int posicao) throws Exception
	{
		if (!lista.isEmpty())
		{
			try {
				lista.remove(posicao);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			throw new Exception("Nao existe musica na lista!");
		}
	}
	
	public void executaPlaylist(ListaString lista)
	{
		for(int i = 0; i < lista.size(); i++)
		{
			try {	
				System.out.println(lista.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
