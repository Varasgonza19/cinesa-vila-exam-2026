package iesam.cines.domain; //cambiar por la ruta correcta

public class Movie {

    private String id;
    private String duration;
    private String gender;
    private String yearPublication;

    public Movie(String id, String duration, String gender, String yearPublication) {
        this.id = id;
        this.duration = duration;
        this.gender = gender;
        this.yearPublication = yearPublication;
    }


    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id='" + id + '\'' +
                ", duration='" + duration + '\'' +
                ", gender='" + gender + '\'' +
                ", yearPublication='" + yearPublication + '\'' +
                '}';
    }
}
