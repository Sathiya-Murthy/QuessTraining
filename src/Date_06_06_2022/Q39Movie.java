package Date_06_06_2022;

public class Q39Movie {
    private String title;
    private String studio;
    private String rating;
     public Q39Movie(String title, String studio, String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Q39Movie(String title, String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public Q39Movie[] getPG(Q39Movie[] movie)
    {
        Q39Movie[] pgMovie=new Q39Movie[movie.length];
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

         Q39Movie mov=new Q39Movie("Casino Royale","Eon Productions", "PG-13");
    }

}

