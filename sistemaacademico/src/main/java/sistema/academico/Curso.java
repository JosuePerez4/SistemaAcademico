package sistema.academico;

import java.util.List;
import java.sql.Time;

public class Curso {
    String nombre;
    String descripcion;
    String codigo;
    Materia materia;
    int cupoMaximo;
    int semestre;
    List<Clase> clases;
    List<Calificacion> calificaciones;
    List<Estudiante> estudiantes;

    void crearCurso() {
    }

    void modificarCurso() {
    }

    void eliminarCurso() {
    }

    void inscribirEstudiante(Estudiante estudiante) {
    }

    boolean agregarHorario(Horario horario) {
        return false;
    }

    boolean eliminarHorario(Horario horario) {
        return false;
    }

    List<Horario> listarHorarios() {
        return null;
    }

    List<Estudiante> listarEstudiantes() {
        return null;
    }

    boolean consultarDisponibilidad(String dia, Time hora) {
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public List<Clase> getClases() {
        return clases;
    }

    public void setClases(List<Clase> clases) {
        this.clases = clases;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
