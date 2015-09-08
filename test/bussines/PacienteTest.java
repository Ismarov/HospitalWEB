

/**
 * PacienteTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package bussines;

    /*
     *  PacienteTest Junit test case
    */

    public class PacienteTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testobtenerEspecialidad() throws java.lang.Exception{

        bussines.PacienteStub stub =
                    new bussines.PacienteStub();//the default implementation should point to the right endpoint

           bussines.PacienteStub.ObtenerEspecialidad obtenerEspecialidad16=
                                                        (bussines.PacienteStub.ObtenerEspecialidad)getTestObject(bussines.PacienteStub.ObtenerEspecialidad.class);
                    // TODO : Fill in the obtenerEspecialidad16 here
                
                        assertNotNull(stub.obtenerEspecialidad(
                        obtenerEspecialidad16));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartobtenerEspecialidad() throws java.lang.Exception{
            bussines.PacienteStub stub = new bussines.PacienteStub();
             bussines.PacienteStub.ObtenerEspecialidad obtenerEspecialidad16=
                                                        (bussines.PacienteStub.ObtenerEspecialidad)getTestObject(bussines.PacienteStub.ObtenerEspecialidad.class);
                    // TODO : Fill in the obtenerEspecialidad16 here
                

                stub.startobtenerEspecialidad(
                         obtenerEspecialidad16,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends bussines.PacienteCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultobtenerEspecialidad(
                         bussines.PacienteStub.ObtenerEspecialidadResponse result
                            ) {
                
            }

            public void receiveErrorobtenerEspecialidad(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testbuscarHoraAps() throws java.lang.Exception{

        bussines.PacienteStub stub =
                    new bussines.PacienteStub();//the default implementation should point to the right endpoint

           bussines.PacienteStub.BuscarHoraAps buscarHoraAps18=
                                                        (bussines.PacienteStub.BuscarHoraAps)getTestObject(bussines.PacienteStub.BuscarHoraAps.class);
                    // TODO : Fill in the buscarHoraAps18 here
                
                        assertNotNull(stub.buscarHoraAps(
                        buscarHoraAps18));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartbuscarHoraAps() throws java.lang.Exception{
            bussines.PacienteStub stub = new bussines.PacienteStub();
             bussines.PacienteStub.BuscarHoraAps buscarHoraAps18=
                                                        (bussines.PacienteStub.BuscarHoraAps)getTestObject(bussines.PacienteStub.BuscarHoraAps.class);
                    // TODO : Fill in the buscarHoraAps18 here
                

                stub.startbuscarHoraAps(
                         buscarHoraAps18,
                    new tempCallbackN65604()
                );
              


        }

        private class tempCallbackN65604  extends bussines.PacienteCallbackHandler{
            public tempCallbackN65604(){ super(null);}

            public void receiveResultbuscarHoraAps(
                         bussines.PacienteStub.BuscarHoraApsResponse result
                            ) {
                
            }

            public void receiveErrorbuscarHoraAps(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testreservarHoraAps() throws java.lang.Exception{

        bussines.PacienteStub stub =
                    new bussines.PacienteStub();//the default implementation should point to the right endpoint

           bussines.PacienteStub.ReservarHoraAps reservarHoraAps20=
                                                        (bussines.PacienteStub.ReservarHoraAps)getTestObject(bussines.PacienteStub.ReservarHoraAps.class);
                    // TODO : Fill in the reservarHoraAps20 here
                
                        assertNotNull(stub.reservarHoraAps(
                        reservarHoraAps20));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartreservarHoraAps() throws java.lang.Exception{
            bussines.PacienteStub stub = new bussines.PacienteStub();
             bussines.PacienteStub.ReservarHoraAps reservarHoraAps20=
                                                        (bussines.PacienteStub.ReservarHoraAps)getTestObject(bussines.PacienteStub.ReservarHoraAps.class);
                    // TODO : Fill in the reservarHoraAps20 here
                

                stub.startreservarHoraAps(
                         reservarHoraAps20,
                    new tempCallbackN65660()
                );
              


        }

        private class tempCallbackN65660  extends bussines.PacienteCallbackHandler{
            public tempCallbackN65660(){ super(null);}

            public void receiveResultreservarHoraAps(
                         bussines.PacienteStub.ReservarHoraApsResponse result
                            ) {
                
            }

            public void receiveErrorreservarHoraAps(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testobtenerMedicosDeUnaEspecialidad() throws java.lang.Exception{

        bussines.PacienteStub stub =
                    new bussines.PacienteStub();//the default implementation should point to the right endpoint

           bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad obtenerMedicosDeUnaEspecialidad22=
                                                        (bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad)getTestObject(bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad.class);
                    // TODO : Fill in the obtenerMedicosDeUnaEspecialidad22 here
                
                        assertNotNull(stub.obtenerMedicosDeUnaEspecialidad(
                        obtenerMedicosDeUnaEspecialidad22));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartobtenerMedicosDeUnaEspecialidad() throws java.lang.Exception{
            bussines.PacienteStub stub = new bussines.PacienteStub();
             bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad obtenerMedicosDeUnaEspecialidad22=
                                                        (bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad)getTestObject(bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidad.class);
                    // TODO : Fill in the obtenerMedicosDeUnaEspecialidad22 here
                

                stub.startobtenerMedicosDeUnaEspecialidad(
                         obtenerMedicosDeUnaEspecialidad22,
                    new tempCallbackN65716()
                );
              


        }

        private class tempCallbackN65716  extends bussines.PacienteCallbackHandler{
            public tempCallbackN65716(){ super(null);}

            public void receiveResultobtenerMedicosDeUnaEspecialidad(
                         bussines.PacienteStub.ObtenerMedicosDeUnaEspecialidadResponse result
                            ) {
                
            }

            public void receiveErrorobtenerMedicosDeUnaEspecialidad(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    