package a24horas.com.a24horas;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by allan on 09/09/2017.
 */

public class HospitalInfo {
    private LatLng latLng;

    private String[] especialidades;

    public HospitalInfo(LatLng latLng, String[] especialidades){
        this.latLng = latLng;
        this.especialidades = especialidades;
    }

    public String[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String[] especialidades) {
        this.especialidades = especialidades;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }
}
