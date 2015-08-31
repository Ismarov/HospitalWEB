package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bussines.RceStub;
import bussines.RceStub.IngresarRce;
import bussines.RceStub.IngresarRceResponse;

/**
 * Servlet implementation class SIngresarRce
 */
public class SIngresarRce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SIngresarRce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id					=	request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
		String encounter_uuid	=	request.getParameter("encounter_uuid");
		String alergias			=	request.getParameter("alergias");
		String anamnesis		=	request.getParameter("anamnesis");
		String motivo			=	request.getParameter("motivo");
		String examen_fisico	=	request.getParameter("examen_fisico");
		String indicador_medico	=	request.getParameter("indicador_medico");
		String indicador_cierre	=	request.getParameter("indicador_cierre");
		String hipotesis		=	request.getParameter("hipotesis");
		String detalle_ges		=	request.getParameter("detalle_ges");
		int horamedica_id		=	request.getParameter("horamedica_id") != null ? Integer.parseInt(request.getParameter("horamedica_id")) : 0;
		int receta_id			=	request.getParameter("receta_id") != null ? Integer.parseInt(request.getParameter("receta_id")) : 0;
		int diagnostico_id		=	request.getParameter("diagnostico_id") != null ? Integer.parseInt(request.getParameter("diagnostico_id")) : 0;
		int procedimiento_id	=	request.getParameter("procedimiento_id") != null ? Integer.parseInt(request.getParameter("procedimiento_id")) : 0;
		int actividad_id		=	request.getParameter("actividad_id") != null ? Integer.parseInt(request.getParameter("actividad_id")) : 0;
		int paciente_id			=	request.getParameter("paciente_id") != null ? Integer.parseInt(request.getParameter("paciente_id")) : 0;
		String lCertificados	=	request.getParameter("lCertificados");
		
		log("receta_id = "+receta_id);
		
		if( /*id != 0 && */receta_id != 0 && paciente_id != 0 && diagnostico_id != 0 && procedimiento_id != 0 && actividad_id != 0){
			if(/*encounter_uuid != null && */alergias != null && anamnesis != null && motivo != null && examen_fisico != null && indicador_medico != null && indicador_cierre != null && hipotesis != null && detalle_ges != null && lCertificados != null ){
				RceStub rse = new RceStub();
				IngresarRce stRce = new IngresarRce();
				stRce.setId(0);
				stRce.setEncounter_uuid("0");
				stRce.setAlergias(alergias);
				stRce.setAnamnesis(anamnesis);
				stRce.setMotivo(motivo);
				stRce.setExamen_fisico(examen_fisico);
				stRce.setIndicador_medico(indicador_medico);
				stRce.setIndicador_cierre(indicador_cierre);
				stRce.setHipotesis(hipotesis);
				stRce.setDetalle_ges(detalle_ges);
				stRce.setHoramedica_id(horamedica_id);
				stRce.setReceta_id(receta_id);
				stRce.setDiagnostico_id(diagnostico_id);
				stRce.setProcedimiento_id(procedimiento_id);
				stRce.setActividad_id(actividad_id);
				stRce.setPaciente_id(paciente_id);
				
				
				lCertificados = lCertificados.replace("[", "");
				lCertificados = lCertificados.replace("]", "");
				lCertificados = lCertificados.replace("%5B", "");
				lCertificados = lCertificados.replace("%5D", "");
				lCertificados = lCertificados.replace("%2C", ",");
				String[] certs = lCertificados.split(",");
				
				int[] icerts = new int[certs.length]; 
				if(!certs.equals("")){
					for (int i = 0; i < certs.length; i++) {
						icerts[i] = Integer.parseInt(certs[i]);
					}
				}
				stRce.setLCertificados(icerts);
							
				IngresarRceResponse res = rse.ingresarRce(stRce);
				response.getWriter().append(res.get_return());
			}
			else{
				log("insertarRce: faltan parametros String");
				response.getWriter().append("null");
			}
		}
		else{
			log("insertarRce: faltan parametros ID");
			
			response.getWriter().append("null");
		}
	}

}
