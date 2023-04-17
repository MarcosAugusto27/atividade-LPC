package atividade.LPC;

public class Veiculo{
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private float velocMax;
	private int qtdRodas;
	
	private Motor motor;

	public Veiculo() {
		this.placa=" ";
		this.marca=" ";
		this.modelo=" ";
		this.cor=" ";
		this.velocMax= 0;
		this.qtdRodas=0;
		this.motor = new Motor();

	} 
	public void criandoMotor(int potencia , int qtdPist) {
		this.motor.setPotencia(potencia);
		this.motor.setQtdPist(qtdPist);
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "\nO veiculo da placa: " + placa + "\nda marca: " + marca + "\ndo modelo: " + modelo + "\ncom a cor: " 
	+ cor + "\ntem a velocidade maxima de " + velocMax + "km/h, ele tem " + qtdRodas + " rodas," 
	+"\ne um motor com " + motor.getQtdPist() + " pistoes" +" e tem uma potencia de " + motor.getPotencia() + "."+"\n";
	}

	

}
