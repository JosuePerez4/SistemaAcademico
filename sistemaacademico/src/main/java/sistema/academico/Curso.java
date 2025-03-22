package sistema.academico;

import java.util.List;
import java.sql.Time;

public class Curso {
    private String nombre;
    private String descripcion;
    private String codigo;
    private Materia materia;
    private int cupoMaximo;
    private int semestre;
    private Clase clase;
    private Calificacion calificacion;
    private Estudiante estudiante;

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

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
