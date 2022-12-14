package sop_corba;


/**
* sop_corba/ControladorCalificacionIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* s?bado 6 de agosto de 2022 04:44:17 PM COT
*/

public abstract class ControladorCalificacionIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.ControladorCalificacionIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarCalificacion", new java.lang.Integer (0));
    _methods.put ("obtenerAlertasVerdesCorte", new java.lang.Integer (1));
    _methods.put ("obtenerAlertasBienestarCorte", new java.lang.Integer (2));
    _methods.put ("obtenerAlertasRojas", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/ControladorCalificacionInt/registrarCalificacion
       {
         sop_corba.ControladorCalificacionIntPackage.CalificacionDTO objCalificacion = sop_corba.ControladorCalificacionIntPackage.CalificacionDTOHelper.read (in);
         boolean $result = false;
         $result = this.registrarCalificacion (objCalificacion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/ControladorCalificacionInt/obtenerAlertasVerdesCorte
       {
         sop_corba.ControladorCalificacionIntPackage.InformeDTO $result = null;
         $result = this.obtenerAlertasVerdesCorte ();
         out = $rh.createReply();
         sop_corba.ControladorCalificacionIntPackage.InformeDTOHelper.write (out, $result);
         break;
       }

       case 2:  // sop_corba/ControladorCalificacionInt/obtenerAlertasBienestarCorte
       {
         sop_corba.ControladorCalificacionIntPackage.InformeDTO $result = null;
         $result = this.obtenerAlertasBienestarCorte ();
         out = $rh.createReply();
         sop_corba.ControladorCalificacionIntPackage.InformeDTOHelper.write (out, $result);
         break;
       }

       case 3:  // sop_corba/ControladorCalificacionInt/obtenerAlertasRojas
       {
         int $result = (int)0;
         $result = this.obtenerAlertasRojas ();
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ControladorCalificacionInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ControladorCalificacionInt _this() 
  {
    return ControladorCalificacionIntHelper.narrow(
    super._this_object());
  }

  public ControladorCalificacionInt _this(org.omg.CORBA.ORB orb) 
  {
    return ControladorCalificacionIntHelper.narrow(
    super._this_object(orb));
  }


} // class ControladorCalificacionIntPOA
