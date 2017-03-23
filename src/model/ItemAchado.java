package model;

public class ItemAchado {
	private Relatorio relatorio;
	private Achado achado;
	private int posicao;
	
	public ItemAchado(Relatorio relatorio, Achado achado){
		this.relatorio = relatorio;
		this.achado = achado;
	}
	
	public Relatorio getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	public Achado getAchado() {
		return achado;
	}
	public void setAchado(Achado achado) {
		this.achado = achado;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	
}
