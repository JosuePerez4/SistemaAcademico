package sistema.academico;

import java.util.List;

public class Materia {
    String nombre;
    List<Materia> prerrequisitos;
    String codigo;
    String descripcion;
    int creditos;
    List<String> temario;
    List<Curso> cursos;

    boolean agregarPrerrequisito(Materia materia) {
        return false;
    }

    boolean eliminarPrerrequisito(Materia materia) {
        return false;
    }

    List<Materia> obtenerPrerrequisitos() {
        return null;
    }

    List<String> obtenerTemas() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getPrerrequisitos() {
        return prerrequisitos;
    }

    public void setPrerrequisitos(List<Materia> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<String> getTemario() {
        return temario;
    }

    public void setTemario(List<String> temario) {
        this.temario = temario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
