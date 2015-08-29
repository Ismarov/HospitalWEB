
/**
 * RceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package bussines;

    /**
     *  RceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerReceta method
            * override this method for handling normal response from obtenerReceta operation
            */
           public void receiveResultobtenerReceta(
                    bussines.RceStub.ObtenerRecetaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerReceta operation
           */
            public void receiveErrorobtenerReceta(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerRce_cierre method
            * override this method for handling normal response from obtenerRce_cierre operation
            */
           public void receiveResultobtenerRce_cierre(
                    bussines.RceStub.ObtenerRce_cierreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerRce_cierre operation
           */
            public void receiveErrorobtenerRce_cierre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCierre_destino method
            * override this method for handling normal response from obtenerCierre_destino operation
            */
           public void receiveResultobtenerCierre_destino(
                    bussines.RceStub.ObtenerCierre_destinoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCierre_destino operation
           */
            public void receiveErrorobtenerCierre_destino(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerProcedimiento method
            * override this method for handling normal response from obtenerProcedimiento operation
            */
           public void receiveResultobtenerProcedimiento(
                    bussines.RceStub.ObtenerProcedimientoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerProcedimiento operation
           */
            public void receiveErrorobtenerProcedimiento(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCertificado method
            * override this method for handling normal response from obtenerCertificado operation
            */
           public void receiveResultobtenerCertificado(
                    bussines.RceStub.ObtenerCertificadoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCertificado operation
           */
            public void receiveErrorobtenerCertificado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerCierre_tipo method
            * override this method for handling normal response from obtenerCierre_tipo operation
            */
           public void receiveResultobtenerCierre_tipo(
                    bussines.RceStub.ObtenerCierre_tipoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerCierre_tipo operation
           */
            public void receiveErrorobtenerCierre_tipo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerDiagnostico method
            * override this method for handling normal response from obtenerDiagnostico operation
            */
           public void receiveResultobtenerDiagnostico(
                    bussines.RceStub.ObtenerDiagnosticoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerDiagnostico operation
           */
            public void receiveErrorobtenerDiagnostico(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerActividad method
            * override this method for handling normal response from obtenerActividad operation
            */
           public void receiveResultobtenerActividad(
                    bussines.RceStub.ObtenerActividadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerActividad operation
           */
            public void receiveErrorobtenerActividad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTiempo_control method
            * override this method for handling normal response from obtenerTiempo_control operation
            */
           public void receiveResultobtenerTiempo_control(
                    bussines.RceStub.ObtenerTiempo_controlResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTiempo_control operation
           */
            public void receiveErrorobtenerTiempo_control(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerRceDeUnPaciente method
            * override this method for handling normal response from obtenerRceDeUnPaciente operation
            */
           public void receiveResultobtenerRceDeUnPaciente(
                    bussines.RceStub.ObtenerRceDeUnPacienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerRceDeUnPaciente operation
           */
            public void receiveErrorobtenerRceDeUnPaciente(java.lang.Exception e) {
            }
                


    }
    