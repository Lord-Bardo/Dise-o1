package domain.persona;

import domain.escuela.Materia;

import java.util.List;

public class Alumno {
    List<Materia> aprobadas;
    public Alumno(List<Materia> aprobadas) {
        this.aprobadas = aprobadas;
    }

    public boolean tieneAprobadas(List<Materia> correlativas){
        if(correlativas.isEmpty()){
            return true;
        }
        else{
        return this.aprobadas.containsAll(correlativas);
    }
    }
}
