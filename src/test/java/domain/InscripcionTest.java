package domain;
import domain.escuela.Inscripcion;
import domain.escuela.Materia;
import domain.persona.Alumno;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class InscripcionTest {

    @Test
    public void noTePodesAnotarEnParadigmasSiNoAprobasteAlgoritmos(){
        Alumno jorge = new Alumno(Collections.emptyList());

        List<Materia> correlativas = new java.util.ArrayList<>(Collections.emptyList());
        List<Materia> parametro= new java.util.ArrayList<>(Collections.emptyList());
        List<Materia> materiasA= new java.util.ArrayList<>(Collections.emptyList());


        Materia algoritmos = new Materia(Collections.emptyList());
        Materia paradigmas = new Materia(correlativas);

        correlativas.add(algoritmos);
        parametro.add(paradigmas);

        Inscripcion inscripcionAlgoritmos = new Inscripcion(jorge,parametro);

        Assert.assertFalse(inscripcionAlgoritmos.aprobada());

    }

    @Test
    public void SiTePodesAnotarEnParadigmasSiNoAprobasteAlgoritmos(){
        List<Materia> correlativas = new java.util.ArrayList<>(Collections.emptyList());
        List<Materia> parametro= new java.util.ArrayList<>(Collections.emptyList());
        List<Materia> materiasA= new java.util.ArrayList<>(Collections.emptyList());

        Alumno jorge = new Alumno(materiasA);

        Materia algoritmos = new Materia(Collections.emptyList());
        Materia paradigmas = new Materia(correlativas);

        correlativas.add(algoritmos);
        parametro.add(paradigmas);
        materiasA.add(algoritmos);

        Inscripcion inscripcionAlgoritmos = new Inscripcion(jorge,parametro);

        Assert.assertTrue(inscripcionAlgoritmos.aprobada());
    }
}
