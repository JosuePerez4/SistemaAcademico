package sistema.academico;
import java.util.Date;
import java.util.List;

public class Estudiante {
    private String programaAcademico;
    private float promedio;
    private boolean beca;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private List<Curso> cursos;

    public void registrarEstudiante() {
        // Lógica para registrar un estudiante
    }

    public void actualizarEstudiante() {
        // Lógica para actualizar un estudiante
    }

    public void eliminarEstudiante() {
        // Lógica para eliminar un estudiante
    }

    public void matricularCurso(Curso curso) {
        // Lógica para matricular un curso
    }

    public boolean cancelarCurso(Curso curso) {
        // Lógica para cancelar un curso
        return true;
    }

    public HistorialAcademico consultarHistorialAcademico() {
        // Lógica para consultar el historial académico
        return new HistorialAcademico();
    }

    public void registrarAsistencia(Asistencia asistencia) {
        // Lógica para registrar asistencia
    }

    public List<Curso> consultarCursos() {
        // Lógica para consultar los cursos inscritos
        return cursos;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(Date fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}

