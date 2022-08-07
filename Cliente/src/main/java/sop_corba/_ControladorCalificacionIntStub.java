package sop_corba;


/**
* sop_corba/_ControladorCalificacionIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* s�bado 6 de agosto de 2022 04:44:17 PM COT
*/

public class _ControladorCalificacionIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba.ControladorCalificacionInt
{

  public boolean registrarCalificacion (sop_corba.ControladorCalificacionIntPackage.CalificacionDTO objCalificacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarCalificacion", true);
                sop_corba.ControladorCalificacionIntPackage.CalificacionDTOHelper.write ($out, objCalificacion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarCalificacion (objCalificacion        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarCalificacion

  public sop_corba.ControladorCalificacionIntPackage.InformeDTO obtenerAlertasVerdesCorte ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtenerAlertasVerdesCorte", true);
                $in = _invoke ($out);
                sop_corba.ControladorCalificacionIntPackage.InformeDTO $result = sop_corba.ControladorCalificacionIntPackage.InformeDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtenerAlertasVerdesCorte (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtenerAlertasVerdesCorte

  public sop_corba.ControladorCalificacionIntPackage.InformeDTO obtenerAlertasBienestarCorte ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtenerAlertasBienestarCorte", true);
                $in = _invoke ($out);
                sop_corba.ControladorCalificacionIntPackage.InformeDTO $result = sop_corba.ControladorCalificacionIntPackage.InformeDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtenerAlertasBienestarCorte (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtenerAlertasBienestarCorte

  public int obtenerAlertasRojas ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtenerAlertasRojas", true);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtenerAlertasRojas (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtenerAlertasRojas

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ControladorCalificacionInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ControladorCalificacionIntStub
