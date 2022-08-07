package co.unicauca.servidor.repositorios;

import java.util.ArrayList;

import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public class AlertaRepository implements AlertaRepositoryInt {

    private ArrayList<AlertaDTO> listaAlertas;

    public AlertaRepository() {
        this.listaAlertas = new ArrayList<>();
    }

    @Override
    public boolean crearAlerta(AlertaDTO alerta) {
        boolean bandera = false;

        bandera = this.listaAlertas.add(alerta);

        return bandera;
    }

    /**
     * @return ArrayList<AlertaDTO> return the listaAlertas
     */
    public ArrayList<AlertaDTO> getListaAlertas() {
        return listaAlertas;
    }

    /**
     * @param listaAlertas the listaAlertas to set
     */
    public void setListaAlertas(ArrayList<AlertaDTO> listaAlertas) {
        this.listaAlertas = listaAlertas;
    }

    @Override
    public ArrayList<AlertaDTO> obtenerListaAlertas() {
        return getListaAlertas();
    }

}
