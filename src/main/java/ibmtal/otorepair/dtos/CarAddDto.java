package ibmtal.otorepair.dtos;

public class CarAddDto {
	private int id;
	private String plaka;
	private int brand;
	private String model;
	private String color;
	public CarAddDto() {
		super();
	}
	public CarAddDto(int id, String plaka, int brand, String model, String color) {
		super();
		this.id = id;
		this.plaka = plaka;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public int getBrand() {
		return brand;
	}
	public void setBrand(int brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
