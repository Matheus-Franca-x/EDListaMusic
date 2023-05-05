package controller;


import javax.swing.JOptionPane;

import matheus.ListaString.ListaString;
import model.Musica;

public class PlayerController 
{
	
	
	public void adicionaMusica(ListaString lista, String musica)
	{
		String[] music = musica.split(";");
		boolean test = true;
		for (int i = 0; i < lista.size(); i++)
		{
			try {
				if(lista.get(i).contains(music[0]))
				{
					test = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(test)
		{
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
		else
		{
			JOptionPane.showMessageDialog(null, "A musica " + music[0] + " de " + music[1] + " ja existe na playlist!");
		}
	}
	
	public void removeMusica(ListaString lista, int posicao) throws Exception
	{
		if (!lista.isEmpty())
		{
			try {
				lista.remove(posicao - 1);
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
				System.out.println(i+1 + " - " + lista.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
}
