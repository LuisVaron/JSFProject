package com.unbosque.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="holaMundo")
@SessionScoped
public class HolaMundo {
	String saludo = "Hola Mundo desde JSF";

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
