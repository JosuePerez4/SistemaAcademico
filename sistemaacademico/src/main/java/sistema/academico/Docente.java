package sistema.academico;
import java.util.List;

public class Docente {
    private String especialidad;
    private int cargaHoraria;
    private String tituloProfesional;
    private String aniosExperiencia;
    private String tipoContrato;
    private List<Curso> cursos;

    public void registrarDocente() {
        // Lógica para registrar un docente
    }

    public void actualizarDocente() {
        // Lógica para actualizar un docente
    }

    public void eliminarDocente(Docente docente) {
        // Lógica para eliminar un docente
    }

    public void asignarCurso(Curso curso) {
        // Lógica para asignar un curso
    }

    public void crearEvaluacion(Evaluacion evaluacion) {
        // Lógica para crear una evaluación
    }

    public List<Curso> consultarCursos() {
        // Lógica para consultar los cursos asignados
        return cursos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}

