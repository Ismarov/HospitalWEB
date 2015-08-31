
/**
 * PacienteCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package bussines;

    /**
     *  PacienteCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PacienteCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PacienteCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PacienteCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for reservarHoraAps method
            * override this method for handling normal response from reservarHoraAps operation
            */
           public void receiveResultreservarHoraAps(
                    bussines.PacienteStub.ReservarHoraApsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reservarHoraAps operation
           */
            public void receiveErrorreservarHoraAps(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buscarHoraAps method
            * override this method for handling normal response from buscarHoraAps operation
            */
           public void receiveResultbuscarHoraAps(
                    bussines.PacienteStub.BuscarHoraApsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buscarHoraAps operation
           */
            public void receiveErrorbuscarHoraAps(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerHorasPaciente method
            * override this method for handling normal response from obtenerHorasPaciente operation
            */
           public void receiveResultobtenerHorasPaciente(
                    bussines.PacienteStub.ObtenerHorasPacienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerHorasPaciente operation
           */
            public void receiveErrorobtenerHorasPaciente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerMedicosDeUnaEspecialidad method
            * override this method for handling normal response from obtenerMedicosDeUnaEspecialidad operation
            */
           public void receiveResultobtenerMedicosDeUnaEspecialidad(
                    bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerMedicosDeUnaEspecialidad operation
           */
            public void receiveErrorobtenerMedicosDeUnaEspecialidad(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerEspecialidad method
            * override this method for handling normal response from obtenerEspecialidad operation
            */
           public void receiveResultobtenerEspecialidad(
                    bussines.PacienteStub.ObtenerEspecialidadResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerEspecialidad operation
           */
            public void receiveErrorobtenerEspecialidad(java.lang.Exception e) {
            }
                


    }
    