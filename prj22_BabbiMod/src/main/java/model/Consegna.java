package model;

public class Consegna {
	
	private int id;
	private Babbo babbo;
	private Dono dono;
	private String bambino;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Babbo getBabbo() {
		return babbo;
	}
	public void setBabbo(Babbo babbo) {
		this.babbo = babbo;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public String getBambino() {
		return bambino;
	}
	public void setBambino(String bambino) {
		this.bambino = bambino;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consegna [id=");
		builder.append(id);
		builder.append(", babbo=");
		builder.append(babbo.getNome());
		builder.append(", dono=");
		builder.append(dono.getDesc());
		builder.append(", bambino=");
		builder.append(bambino);
		builder.append("]");
		return builder.toString();
	}
	
	
}
