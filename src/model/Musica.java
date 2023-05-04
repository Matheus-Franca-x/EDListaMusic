package model;

public class Musica {

    String nome;
    String nomeArtista;
    int duracao;

    public Musica(String nome, String nomeArtista, int duracao){
        this.nome= nome;
        this.nomeArtista = nomeArtista;
        this.duracao = duracao;
    }


    public String getNome() {
        return nome;
    }

    public String getQuantidadePecas() {
        return nomeArtista;
    }

    public int getValor() {
        return duracao;
    }
    
    @Override
    public String toString() 
    {
    	return this.nome + " - " + this.nomeArtista + " - " + this.duracao;
    }
}