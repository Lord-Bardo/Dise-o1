package domain.escuela;

import domain.persona.Alumno;

import java.util.List;

public class Inscripcion {
    Alumno alumno;
    List<Materia>materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

 public boolean aprobada(){
        return this.materias.stream().allMatch(materia -> alumno.tieneAprobadas(materia.getCorrelativas()));
 }

}
