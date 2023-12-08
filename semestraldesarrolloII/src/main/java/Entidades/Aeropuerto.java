package Entidades;

public class Aeropuerto {
    private int idAeropuerto;
    private String pais;
    private String codigoIata; 

    public Aeropuerto() {

    }

    public Aeropuerto(int idAeropuerto, String pais, String codigoIata) {
        super();
        this.idAeropuerto = idAeropuerto;
        this.pais = pais;
        this.codigoIata = codigoIata;
    }

    public int getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(int idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoIata() {
        return codigoIata;
    }

    public void setCodigoIata(String codigoIata) {
        this.codigoIata = codigoIata;
    }
}

