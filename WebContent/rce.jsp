<!DOCTYPE.jsp>
.jsp>
<head>
	<title>RCE</title>
	<meta charset="utf-8">
</head>
<body>
<!--
	<label for="%%">%%</label>
	<input id="%%" name="%%" />
-->

<div id="contenido">

	<form id="form_rce"> <!-- ## INICIO FORM ## -->
	<div><!-- detalles -->

		<label for="anamnesis">Anamnesis</label>
		<textarea id="anamnesis" name="anamnesis"></textarea>


		<label for="alergias">Alergias</label>
		<textarea id="alergias" name="alergias"></textarea>



		<label for="examen_f">Examen Físico</label>
		<textarea id="examen_f" name="examen_f"></textarea>

		<label for="indicacion_medica">Indicación Médica</label>
		<textarea id="indicacion_medica" name="indicacion_medica"></textarea>

		<!-- -->

		<label for="indicacion_cierre-caso">Indicación cierre caso clínico</label>
		<textarea id="indicacion_cierre-caso" name="indicacion_cierre-caso"></textarea>

		<label for="hipotesis_diag">Hipótesis Diagnostica</label>
		<textarea id="hipotesis_diag" name="hipotesis_diag"></textarea>

		<label for="diagnostico">Diagnóstico</label>
		<textarea id="diagnostico" name="diagnostico"></textarea>

		<label></label>
		<textarea placeholder="Sin detalle GES cita actual" disabled="true"></textarea>

	</div><!-- fin detalles -->

	<hr>

	<div><!-- receta -->
		Receta
		<div>
			Tipo Paciente y Tipo Medicamento
			<div>
				<table>
					<tr>
						<td>Paciente GES:</td>
						<td>
							<input type="radio" name="paci_ges" value=1 /> Si
							<input type="radio" name="paci_ges" value=0 checked /> No
						</td>

						<td>Patología GES:</td>
						<td>
							<input type="radio" name="pat_ges" value=1 /> Si
							<input type="radio" name="pat_ges" value=0 checked /> No
						</td>
					</tr>
					<tr>
						<td>Paciente Crónico:</td>
						<td>
							<input type="radio" name="paci_cron" value=1 /> Si
							<input type="radio" name="paci_cron" value=0 checked /> No
						</td>

						<td>Validez</td>
						<td>???</td>
					</tr>
					<tr>
						<textarea name="receta_texto" placeholder="Texto de la receta"></textarea>
					</tr>
				</table>
			</div>
		</div>
	</div><!-- fin receta -->

	<hr>

	<div><!-- Certificado -->
		<div>
			<table>

				<tr>
					<td>
						Alcoholemia
						<input type="radio" name="alcoholemia" value=1 /> Si
						<input type="radio" name="alcoholemia" value=0 checked /> No
					</td>
					<td>
						V Intrafamiliar
						<input type="radio" name="v_intrafam" value=1 /> Si
						<input type="radio" name="v_intrafam" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Drogas
						<input type="radio" name="drogas" value=1 /> Si
						<input type="radio" name="drogas" value=0 checked /> No
					</td>
					<td>
						Lesiones
						<input type="radio" name="lesiones" value=1 /> Si
						<input type="radio" name="lesiones" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Suicidio
						<input type="radio" name="suicidio" value=1 /> Si
						<input type="radio" name="suicidio" value=0 checked /> No
					</td>
					<td>
						Animal
						<input type="radio" name="animal" value=1 /> Si
						<input type="radio" name="animal" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Otros ML
						<input type="radio" name="otros_ml" value=1 /> Si
						<input type="radio" name="otros_ml" value=0 checked /> No
					</td>
					<td>
						V Genero
						<input type="radio" name="v_genero" value=1 /> Si
						<input type="radio" name="v_genero" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Salud Compatible
						<input type="radio" name="salud_comp" value=1 /> Si
						<input type="radio" name="salud_comp" value=0 checked /> No
					</td>
					<td>
						Atención Diagnóstica
						<input type="radio" name="atencion_diag" value=1 /> Si
						<input type="radio" name="atencion_diag" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Atención Profesional
						<input type="radio" name="atencion_prof" value=1 /> Si
						<input type="radio" name="atencion_prof" value=0 checked /> No
					</td>
					<td>
						Derivación Interna
						<input type="radio" name="derivacion_int" value=1 /> Si
						<input type="radio" name="derivacion_int" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Citación a KNT
						<input type="radio" name="citacion_knt" value=1 /> Si
						<input type="radio" name="citacion_knt" value=0 checked /> No
					</td>
					<td>
						Orden Curación
						<input type="radio" name="orden_curacion" value=1 /> Si
						<input type="radio" name="orden_curacion" value=0 checked /> No
					</td>
				</tr>

				<tr>
					<td>
						Orden Citación
						<input type="radio" name="orden_citacion" value=1 /> Si
						<input type="radio" name="orden_citacion" value=0 checked /> No
					</td>
					<td>
						<!--  -->
					</td>
				</tr>
			</table>
		</div>
	</div> <!-- fin certificado -->

	<hr>

	<div> <!-- actividades -->
		Actividades
		<table>
			<label for="actividades">Seleccionar actividades</label>
			<select id="actividades" name="actividades">
				<!-- <option value=1>Uno</option> -->
			</select>
		</table>
	</div> <!-- fin actividades -->

	<hr>

	<div> <!-- procedimientos -->
		Procedimientos
		<table>
			<label for="procedimientos">Seleccionar procedimientos</label>
			<select id="procedimientos" name="procedimientos">
				<!-- <option value=1>Uno</option> -->
			</select>
		</table>
	</div> <!-- fin procedimientos -->	

	<hr>

	<div><!-- cierre caso -->
		<table>
			<tr>
				<td>
					Tipo de cierre clínico
				</td>
				<td>
				<select name="tipo_cierre_clinico">
					<!-- <option value=1>Uno</option> -->
				</select>
				</td>
			</tr>

			<tr>
				<td>
					Destino
				</td>
				<td>
				<select name="destino">
					<!-- <option value=1>Uno</option> -->
				</select>
				</td>
			</tr>

			<tr>
				<td>
					Fecha de atención
				</td>
				<td>
				<select name="fecha_atencion">
					<!-- <option value=1>Uno</option> -->
				</select>
				</td>
			</tr>

			<tr>
				<td>
					Hora de inicio de atención
				</td>
				<td>
				<input name="hora_ini_atencion" />
				</td>
			</tr>

			<tr>
				<td>
					Fecha de cierre clínico
				</td>
				<td>
				<input name="fecha_cierre_clinico" />
				</td>
			</tr>

			<tr>
				<td>
					Hora cierre clínico
				</td>
				<td>
				<input name="hora_cierre_clinico" />
				</td>
			</tr>

			<tr>
				<td>
					Tiempo control
				</td>
				<td>
				<select name="tiempo_control">
					<!-- <option value=1>Uno</option> -->
				</select>
				</td>
			</tr>
		</table>
	</div><!-- fin cierre caso -->

	<hr>

	<div><!-- cierre administrativo-->
		Realice cierre administrativo al realizar cierre clínico
		<table>
			<tr>
				<td>
					Realizar cierre administrativo
				</td>
				<td>
					<input type="radio" name="cierre_admin" value=1 /> Si
					<input type="radio" name="cierre_admin" value=0 checked /> No			
				</td>
			</tr>
		</table>
	</div><!-- fin cierre administrativo-->

</div>

<div><!-- botones -->

</form> <!-- ## FIN FORM ## -->

<table>
	<tr>
		<td><button id="btn_grabar_sin_cerrar">Grabar sin cerrar caso</button></td>
		<td><button id="btn_grabar_cerrar">Grabar y cerrar el caso</button></td>
		<td><button id="btn_ver_hce">Ver HCE</button></td>
	</tr>
</table>
</div><!-- fin botones -->


</body>
<.jsp>