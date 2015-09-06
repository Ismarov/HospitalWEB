package servlet.rce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.RceStub;
import servicios.RceStub.IngresarRce;
import servicios.RceStub.IngresarRceResponse;

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
		String receta_json		=	request.getParameter("receta_json");
		int diagnostico_id		=	request.getParameter("diagnostico_id") != null ? Integer.parseInt(request.getParameter("diagnostico_id")) : 0;
		String lprocedimientos	=	request.getParameter("lprocedimiento_id");
		String lactividades		=	request.getParameter("lactividad_id");
		int paciente_id		=	request.getParameter("paciente_id") != null ? Integer.parseInt(request.getParameter("paciente_id")) : 0;
		String lCertificados	=	request.getParameter("lCertificados");
		
		
		if( /*id != 0 && */diagnostico_id != 0 && paciente_id != 0 && horamedica_id != 0){
			if(/*encounter_uuid != null && */lprocedimientos != null && lactividades != null && receta_json != null && alergias != null && anamnesis != null && motivo != null && examen_fisico != null && indicador_medico != null && indicador_cierre != null && hipotesis != null && lCertificados != null ){
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
				stRce.setReceta_json(receta_json);
				stRce.setDiagnostico_id(diagnostico_id);
				stRce.setLprocedimiento_id(parseJsonIntArr(lprocedimientos));
				stRce.setLactividad_id(parseJsonIntArr(lactividades));
				stRce.setPaciente_id(paciente_id);
				stRce.setLCertificados(parseJsonIntArr(lCertificados));
							
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
	
	private int[] parseJsonIntArr(String json_str){
		json_str = json_str.replace("[", "");
		json_str = json_str.replace("]", "");
		json_str = json_str.replace("%5B", "");
		json_str = json_str.replace("%5D", "");
		json_str = json_str.replace("%2C", ",");
		String[] s_arr = json_str.split(",");
		
		int[] iarr = new int[s_arr.length];
		
		if(!iarr.equals("")){
			for (int i = 0; i < iarr.length; i++) {
				try{
					iarr[i] = Integer.parseInt(s_arr[i]);
				}
				catch(NumberFormatException ex){
					ex.printStackTrace();
				}
			}
		}
		return iarr;
	} 

}
