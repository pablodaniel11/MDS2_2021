package com.MDS2.ForoUal.Interfaz.Opciones;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Registrase_Ventana extends AbsoluteLayout {
	protected TextField userName;
	protected TextField email;
	protected TextField nombreCompleto;
	protected PasswordField password;
	protected TextArea description;
	protected TextField photo;
	protected Label error;
	protected Button cancelar;
	protected Button continuar;

	public Registrase_Ventana() {
		Design.read(this);
	}
}
