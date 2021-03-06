/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorCriteria extends AbstractORMCriteria {
	public final LongExpression ID;
	public final StringExpression email;
	public final StringExpression nombreUsuario;
	public final StringExpression fotoPerfil;
	public final StringExpression descripcion;
	public final StringExpression contrasenia;
	public final BooleanExpression marcado;
	public final BooleanExpression baneado;
	public final LongExpression IDusuario;
	public final StringExpression nombreReal;
	public final BooleanExpression esModerador;
	public final CollectionExpression reportes_usuario;
	public final CollectionExpression amigo_de;
	public final CollectionExpression pertenece;
	public final CollectionExpression usuarios;
	public final CollectionExpression es_creado;
	public final CollectionExpression notificacion_usuario;
	public final CollectionExpression megusta;
	public final CollectionExpression megusta_tema;
	public final LongExpression idAdmin;
	public final CollectionExpression es_creada;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		ID = new LongExpression("ID", this);
		email = new StringExpression("email", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		fotoPerfil = new StringExpression("fotoPerfil", this);
		descripcion = new StringExpression("descripcion", this);
		contrasenia = new StringExpression("contrasenia", this);
		marcado = new BooleanExpression("marcado", this);
		baneado = new BooleanExpression("baneado", this);
		IDusuario = new LongExpression("IDusuario", this);
		nombreReal = new StringExpression("nombreReal", this);
		esModerador = new BooleanExpression("esModerador", this);
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		pertenece = new CollectionExpression("ORM_pertenece", this);
		usuarios = new CollectionExpression("ORM_usuarios", this);
		es_creado = new CollectionExpression("ORM_es_creado", this);
		notificacion_usuario = new CollectionExpression("ORM_notificacion_usuario", this);
		megusta = new CollectionExpression("ORM_megusta", this);
		megusta_tema = new CollectionExpression("ORM_megusta_tema", this);
		idAdmin = new LongExpression("idAdmin", this);
		es_creada = new CollectionExpression("ORM_es_creada", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession());
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria createEs_creadaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria(createCriteria("ORM_es_creada"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria createReportes_usuarioCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria(createCriteria("ORM_reportes_usuario"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria createAmigo_deCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria createPerteneceCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria(createCriteria("ORM_pertenece"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria createUsuariosCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria(createCriteria("ORM_usuarios"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria createEs_creadoCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria(createCriteria("ORM_es_creado"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria createNotificacion_usuarioCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria(createCriteria("ORM_notificacion_usuario"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria createMegustaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria(createCriteria("ORM_megusta"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria createMegusta_temaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria(createCriteria("ORM_megusta_tema"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

