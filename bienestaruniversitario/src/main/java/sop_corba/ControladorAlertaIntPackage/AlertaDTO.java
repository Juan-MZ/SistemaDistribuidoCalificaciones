package sop_corba.ControladorAlertaIntPackage;


/**
* sop_corba/ControladorAlertaIntPackage/AlertaDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* s�bado 6 de agosto de 2022 04:44:17 PM COT
*/

public final class AlertaDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int codigoEstudiante = (int)0;
  public int corte = (int)0;
  public String color = null;

  public AlertaDTO ()
  {
  } // ctor

  public AlertaDTO (int _codigoEstudiante, int _corte, String _color)
  {
    codigoEstudiante = _codigoEstudiante;
    corte = _corte;
    color = _color;
  } // ctor

} // class AlertaDTO
