package co.unicauca.repositorios;

import java.util.ArrayList;

import sop_corba.ControladorAlertaIntPackage.AlertaDTO;

public class AlertaRepository implements AlertaRepositoryInt {

    private ArrayList<AlertaDTO> listaAlertas;

    public AlertaRepository() {
        this.listaAlertas = new ArrayList<>();
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
