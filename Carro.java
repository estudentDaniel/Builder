public class Carro {
	private String preco;
	private String cor;
	private String modelo;

	

	public Carro(String preco, String cor, String modelo) {
		this.preco = preco;
		this.cor = cor;
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", modelo=" + modelo + ", preco=" + preco + "]";
	}



}
