package com.MDS2.ForoUal.Backend.Interfaces_BD;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;

public interface i_Usuario_Registrado {

	public Long Insertar_Media(String aUrl);

	public void Dar_Megusta_Mensaje(Long aId);

	public Mensaje Crear_Mensaje(String aTexto, String[] urls, Mensaje respuestaA);

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje);

	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje);

	public Tema Crear_Tema(String aTitulo, String aSubtitulo);

	public Tema[] Cargar_Temas_Registrado(String aSeccion);

	public int Dar_Megusta_Tema(Long aId);

	//public Usuario[] Buscar_Amigo_PorNombre(String aNombre);

	public Usuario[] Buscar_Amigo_PorNombre(String aNombre);

	public boolean Darse_Baja(String aContrasenia, String aNombre);

	public void Editar_Perfil(String aDescripcion, String aEmail, String fotoPerfil, String aNombre_completo);

	public void Eliminar_Amigo(String aNombre);

	public void Insertar_Amigo(String aNombre);

	public void Recuperar_Contrasenia_Perfil(String aNombre, String aContrasenia);
}