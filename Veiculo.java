package nathan303;

public class Veiculo {
private String cod;
private String marca;
private String mod;
private String cor;
private int qtdp;
private int pot;
private int nrchassi;

public Veiculo(String cod, String marca, String mod, String cor, int qtdp, int pot, int nrchassi) {
	this.cod = cod;
	this.marca = marca;
	this.mod = mod;
	this.cor = cor;
	this.qtdp = qtdp;
	this.pot = pot;
	this.nrchassi = nrchassi;
}

public String getCod() {
	return cod;
}

public void setCod(String cod) {
	this.cod = cod;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getMod() {
	return mod;
}

public void setMod(String mod) {
	this.mod = mod;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public int getQtdp() {
	return qtdp;
}

public void setQtdp(int qtdp) {
	this.qtdp = qtdp;
}

public int getPot() {
	return pot;
}

public void setPot(int pot) {
	this.pot = pot;
}

public int getNrchassi() {
	return nrchassi;
}

public void setNrchassi(int nrchassi) {
	this.nrchassi = nrchassi;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return  ("Código: " + cod + "\nMarca: " + marca + "\nModelo: " + mod + "\nCor: " + cor + "\nQuantidade de pessoas: " + qtdp + "\nPotência: " + pot + "\nNumero do chassi: " + nrchassi);
	
}



}
