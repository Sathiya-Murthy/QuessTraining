package Date_06_06_2022;

public class Movie {
    private String title;
    private String studio;
    private String rating;
     public Movie(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public Movie[] getPG(Movie[] movie)
    {
        Movie[] pgMovie=new Movie[movie.length];
        int index=0;
        for(int i=0 ; i< movie.length;i++)  {
            if(movie[i].rating.equals("PG"))
            {
                pgMovie[index]=movie[i];
                index++;
            }
        }
        return pgMovie;
    }
    public static void main(String[] args) {
        Movie mov=new Movie("Casino Royale","Eon Productions", "PG-13");
    }


}

