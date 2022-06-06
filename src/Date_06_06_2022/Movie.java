package Date_06_06_2022;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    Movie(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

}

