
/**
 * DirectorCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package bussines;

    /**
     *  DirectorCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DirectorCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DirectorCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DirectorCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerBox method
            * override this method for handling normal response from obtenerBox operation
            */
           public void receiveResultobtenerBox(
                    bussines.DirectorStub.ObtenerBoxResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerBox operation
           */
            public void receiveErrorobtenerBox(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPorcentajeOcupacionMedico method
            * override this method for handling normal response from obtenerPorcentajeOcupacionMedico operation
            */
           public void receiveResultobtenerPorcentajeOcupacionMedico(
                    bussines.DirectorStub.ObtenerPorcentajeOcupacionMedicoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPorcentajeOcupacionMedico operation
           */
            public void receiveErrorobtenerPorcentajeOcupacionMedico(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPorcentajeOcupacionBox method
            * override this method for handling normal response from obtenerPorcentajeOcupacionBox operation
            */
           public void receiveResultobtenerPorcentajeOcupacionBox(
                    bussines.DirectorStub.ObtenerPorcentajeOcupacionBoxResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPorcentajeOcupacionBox operation
           */
            public void receiveErrorobtenerPorcentajeOcupacionBox(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedicoMasSolicitado method
            * override this method for handling normal response from obtenerMedicoMasSolicitado operation
            */
           public void receiveResultobtenerMedicoMasSolicitado(
                    bussines.DirectorStub.ObtenerMedicoMasSolicitadoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicoMasSolicitado operation
           */
            public void receiveErrorobtenerMedicoMasSolicitado(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerPacientesMasAtendido method
            * override this method for handling normal response from obtenerPacientesMasAtendido operation
            */
           public void receiveResultobtenerPacientesMasAtendido(
                    bussines.DirectorStub.ObtenerPacientesMasAtendidoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerPacientesMasAtendido operation
           */
            public void receiveErrorobtenerPacientesMasAtendido(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedico method
            * override this method for handling normal response from obtenerMedico operation
            */
           public void receiveResultobtenerMedico(
                    bussines.DirectorStub.ObtenerMedicoResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedico operation
           */
            public void receiveErrorobtenerMedico(java.lang.Exception e) {
            }
                


    }
    