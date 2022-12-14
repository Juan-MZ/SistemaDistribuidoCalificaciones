package sop_corba.ControladorAlertaIntPackage;


/**
* sop_corba/ControladorAlertaIntPackage/AlertaDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* s?bado 6 de agosto de 2022 04:44:17 PM COT
*/

abstract public class AlertaDTOHelper
{
  private static String  _id = "IDL:sop_corba/ControladorAlertaInt/AlertaDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.ControladorAlertaIntPackage.AlertaDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.ControladorAlertaIntPackage.AlertaDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "codigoEstudiante",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "corte",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "color",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba.ControladorAlertaIntPackage.AlertaDTOHelper.id (), "AlertaDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sop_corba.ControladorAlertaIntPackage.AlertaDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.ControladorAlertaIntPackage.AlertaDTO value = new sop_corba.ControladorAlertaIntPackage.AlertaDTO ();
    value.codigoEstudiante = istream.read_long ();
    value.corte = istream.read_long ();
    value.color = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.ControladorAlertaIntPackage.AlertaDTO value)
  {
    ostream.write_long (value.codigoEstudiante);
    ostream.write_long (value.corte);
    ostream.write_string (value.color);
  }

}
