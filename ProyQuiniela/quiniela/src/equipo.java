public class equipo {
    String nombre;
    Double ranking;

    public equipo(String nombre, Double ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public equipo(String nombre) {
        this.nombre = nombre;
        this.ranking = -1.00;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getRanking() {
        return ranking;
    }


}
