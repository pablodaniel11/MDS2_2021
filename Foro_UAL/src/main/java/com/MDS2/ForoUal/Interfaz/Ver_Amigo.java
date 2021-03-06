package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Ver_Amigo extends Ver_Amigo_Ventana{
	
	private Usuario usuario = new Usuario();
	
	public Ver_Amigo(Usuario u, boolean search) {
		usuario = u;
			photo.setSource(new ExternalResource(u.getFotoPerfil()));
		name.setValue(u.getNombreUsuario());
		add.setVisible(search);
		
		if(search) {
			if(foroUI.user.amigo_de.contains(u)) add.setCaption("Eliminar");
			else
				add.setCaption("Añadir");
		}
		amigoLayout.addLayoutClickListener(event -> {
			Window pv = null;
			if(foroUI.privilegios == foroUI.Privilegios.usuario)
				pv = new Window("", new Ver_OtroPerfil(u));
			else if(foroUI.privilegios == foroUI.Privilegios.moderador)
				pv = new Window("", new Visualizar_OtroUsuario_Moderador(u));
			else if(foroUI.privilegios == foroUI.Privilegios.administrador)
				pv = new Window("", new Visualizar_OtroUsuario_Admininistrador(u));
			pv.center();
			pv.setSizeFull();
			pv.setResizable(false);
			UI.getCurrent().addWindow(pv);
		});
		add.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				if(foroUI.user.amigo_de.contains(u)){
					Eliminar_Amigo();
					add.setCaption("Añadir");
				}
				else {
					Anadir_Amigo();
					add.setCaption("Eliminar");
				}
			}
		});
		
	}
	
	public void Anadir_Amigo() {
		foroUI.db.Insertar_Amigo(usuario.getNombreUsuario(), foroUI.user.getORMID());
		foroUI.db.Crear_Notificacion(usuario.getORMID(), foroUI.user.getNombreUsuario() + " te ha añadido como amigo");
	}

	public void Eliminar_Amigo() {
		foroUI.db.Eliminar_Amigo(usuario.getNombreUsuario(),foroUI.user.getORMID());
		foroUI.db.Crear_Notificacion(usuario.getORMID(), foroUI.user.getNombreUsuario() + " te ha borrado como amigo");
	}
}