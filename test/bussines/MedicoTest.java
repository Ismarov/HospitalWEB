

/**
 * MedicoTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package bussines;

    /*
     *  MedicoTest Junit test case
    */

    public class MedicoTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testbuscarSuDisponibilidadHora() throws java.lang.Exception{

        bussines.MedicoStub stub =
                    new bussines.MedicoStub();//the default implementation should point to the right endpoint

           bussines.MedicoStub.BuscarSuDisponibilidadHora buscarSuDisponibilidadHora8=
                                                        (bussines.MedicoStub.BuscarSuDisponibilidadHora)getTestObject(bussines.MedicoStub.BuscarSuDisponibilidadHora.class);
                    // TODO : Fill in the buscarSuDisponibilidadHora8 here
                
                        assertNotNull(stub.buscarSuDisponibilidadHora(
                        buscarSuDisponibilidadHora8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartbuscarSuDisponibilidadHora() throws java.lang.Exception{
            bussines.MedicoStub stub = new bussines.MedicoStub();
             bussines.MedicoStub.BuscarSuDisponibilidadHora buscarSuDisponibilidadHora8=
                                                        (bussines.MedicoStub.BuscarSuDisponibilidadHora)getTestObject(bussines.MedicoStub.BuscarSuDisponibilidadHora.class);
                    // TODO : Fill in the buscarSuDisponibilidadHora8 here
                

                stub.startbuscarSuDisponibilidadHora(
                         buscarSuDisponibilidadHora8,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends bussines.MedicoCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultbuscarSuDisponibilidadHora(
                         bussines.MedicoStub.BuscarSuDisponibilidadHoraResponse result
                            ) {
                
            }

            public void receiveErrorbuscarSuDisponibilidadHora(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testreservarHoraMedicaControl() throws java.lang.Exception{

        bussines.MedicoStub stub =
                    new bussines.MedicoStub();//the default implementation should point to the right endpoint

           bussines.MedicoStub.ReservarHoraMedicaControl reservarHoraMedicaControl10=
                                                        (bussines.MedicoStub.ReservarHoraMedicaControl)getTestObject(bussines.MedicoStub.ReservarHoraMedicaControl.class);
                    // TODO : Fill in the reservarHoraMedicaControl10 here
                
                        assertNotNull(stub.reservarHoraMedicaControl(
                        reservarHoraMedicaControl10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartreservarHoraMedicaControl() throws java.lang.Exception{
            bussines.MedicoStub stub = new bussines.MedicoStub();
             bussines.MedicoStub.ReservarHoraMedicaControl reservarHoraMedicaControl10=
                                                        (bussines.MedicoStub.ReservarHoraMedicaControl)getTestObject(bussines.MedicoStub.ReservarHoraMedicaControl.class);
                    // TODO : Fill in the reservarHoraMedicaControl10 here
                

                stub.startreservarHoraMedicaControl(
                         reservarHoraMedicaControl10,
                    new tempCallbackN65604()
                );
              


        }

        private class tempCallbackN65604  extends bussines.MedicoCallbackHandler{
            public tempCallbackN65604(){ super(null);}

            public void receiveResultreservarHoraMedicaControl(
                         bussines.MedicoStub.ReservarHoraMedicaControlResponse result
                            ) {
                
            }

            public void receiveErrorreservarHoraMedicaControl(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    