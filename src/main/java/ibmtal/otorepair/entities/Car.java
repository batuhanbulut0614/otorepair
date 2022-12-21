package ibmtal.otorepair.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="plaka")
private String plaka;
@Column(name="brand")
private int brand;
@Column(name="model")
private String model;
@Column(name="color")
private String color;
public Car() {
	super();
}
public Car(int id, String plaka, int brand, String model, String color) {
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
