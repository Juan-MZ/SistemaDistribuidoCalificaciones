package sop_corba.ControladorCalificacionIntPackage;


/**
* sop_corba/ControladorCalificacionIntPackage/CalificacionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interface.idl
* s�bado 6 de agosto de 2022 04:44:17 PM COT
*/

public final class CalificacionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int codigoEstudiante = (int)0;
  public String nombreEstudiante = null;
  public int corte = (int)0;
  public float calificacion = (float)0;

  public CalificacionDTO ()
  {
  } // ctor

  public CalificacionDTO (int _codigoEstudiante, String _nombreEstudiante, int _corte, float _calificacion)
  {
    codigoEstudiante = _codigoEstudiante;
    nombreEstudiante = _nombreEstudiante;
    corte = _corte;
    calificacion = _calificacion;
  } // ctor

} // class CalificacionDTO
