package domain.escuela;

import java.util.Collections;
import java.util.List;

public class Materia {
    List<Materia> correlativas;

    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    public void agregarMateria(Materia ... materias){
        Collections.addAll(this.correlativas,materias);
    }
}
