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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReporteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idReporte;
	public final IntegerExpression mensaje_reporteId;
	public final AssociationExpression mensaje_reporte;
	public final LongExpression usuario_reporteId;
	public final AssociationExpression usuario_reporte;
	public final StringExpression motivo;
	
	public ReporteDetachedCriteria() {
		super(com.MDS2.ForoUal.Backend.ORM.src.Reporte.class, com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria.class);
		idReporte = new LongExpression("idReporte", this.getDetachedCriteria());
		mensaje_reporteId = new IntegerExpression("mensaje_reporte.ID", this.getDetachedCriteria());
		mensaje_reporte = new AssociationExpression("mensaje_reporte", this.getDetachedCriteria());
		usuario_reporteId = new LongExpression("usuario_reporte.ID", this.getDetachedCriteria());
		usuario_reporte = new AssociationExpression("usuario_reporte", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public ReporteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria.class);
		idReporte = new LongExpression("idReporte", this.getDetachedCriteria());
		mensaje_reporteId = new IntegerExpression("mensaje_reporte.ID", this.getDetachedCriteria());
		mensaje_reporte = new AssociationExpression("mensaje_reporte", this.getDetachedCriteria());
		usuario_reporteId = new LongExpression("usuario_reporte.ID", this.getDetachedCriteria());
		usuario_reporte = new AssociationExpression("usuario_reporte", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.MensajeDetachedCriteria createMensaje_reporteCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.MensajeDetachedCriteria(createCriteria("mensaje_reporte"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.UsuarioDetachedCriteria createUsuario_reporteCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.UsuarioDetachedCriteria(createCriteria("usuario_reporte"));
	}
	
	public Reporte uniqueReporte(PersistentSession session) {
		return (Reporte) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reporte[] listReporte(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

