package sistema.academico;

import java.util.Date;
import java.util.List;

public class Matricula {
    private Date fechaMatricula;
    private String estado;
    private Estudiante estudiante;
    private Semestre semestre;
    private Curso cursoInscrito;

    boolean registrarMatricula(Estudiante estudiante, Semestre semestre, List<Curso> cursos) {
        return false;
    }

    boolean cancelarMatricula() {
        return false;
    }

    List<Curso> listarCursosInscritos() {
        return null;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Curso getCursoInscrito() {
        return cursoInscrito;
    }

    public void setCursoInscrito(Curso cursoInscrito) {
        this.cursoInscrito = cursoInscrito;
    }
}
