package model;import java.time.LocalDate;/** * 1. Create a new Java project and try modeling a domain you’re comfortable with. It could be * something like: Sports, Business, Mathematics, Online Shopping, etc. For example, if you modeled online shopping, you might create classes to represent: * Customer, Product, Order, etc. * These classes would likely have properties and you may think of a few methods that might make sense for them too. There is no example code for this. */public class VideoGame {    private String title;    private String genre;    private String system;    private LocalDate releaseDate;    public VideoGame(String title, String genre, String system, LocalDate releaseDate) {        this.title = title;        this.genre = genre;        this.system = system;        this.releaseDate = releaseDate;    }    public String getTitle() {        return title;    }    public void setTitle(String title) {        this.title = title;    }    public String getGenre() {        return genre;    }    public void setGenre(String genre) {        this.genre = genre;    }    public String getSystem() {        return system;    }    public void setSystem(String system) {        this.system = system;    }    public LocalDate getReleaseDate() {        return releaseDate;    }    public void setReleaseDate(LocalDate releaseDate) {        this.releaseDate = releaseDate;    }    @Override    public String toString() {        return "VideoGame{" +                "title='" + title + '\'' +                ", genre='" + genre + '\'' +                ", system='" + system + '\'' +                ", releaseDate=" + releaseDate +                '}';    }}