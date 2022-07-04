public class FabricaCarroBuilder {

	private String preco;
	private String cor;
	private String modelo;



	public FabricaCarroBuilder(String modelo) {
		this.modelo = modelo;

	}

	public FabricaCarroBuilder Modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public FabricaCarroBuilder Preco(String preco) {
		this.preco = preco;
		return this;
	}

	public FabricaCarroBuilder Cor(String cor) {
		this.cor = cor;
		return this;
	}


	public Carro All() {
		return new Carro(modelo, preco, cor);
	}
}
