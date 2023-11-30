package Oops;

public class Movie {
	private int MovieId;
	private String MovieName;
 	private Double MovieDuration;
	public Double MovieRating;
	public String MovieDirector;
	
	Movie()
	{
		
	}
	Movie(int i,String j,Double k,Double l,String m)
	{
		MovieId=i;//1001
		MovieName=j;//gayathri
		MovieDuration=k;//90
		MovieRating=l;//78
		MovieDirector=m;
	}
	public void setMovieId( int MovieId)
   {
       this.MovieId=MovieId;
       
   }
   public int getMovieId()
   {
       return MovieId;
   }
   public void setMovieName( String MovieName)
   {
       this.MovieName=MovieName;
       
   }
   public String getMovieName()
   {
       return MovieName;
   }
   public void setMovieDuration( Double MovieDuration)
   {
       this.MovieDuration=MovieDuration;
       
   }
   public Double getMovieDuration()
   {
       return MovieDuration;
   }
   public void setMovieRating( Double MovieRating)
   {
   	this.MovieRating=MovieRating;
   }
   public Double getMovieRating()
   { 	
   	return MovieRating; 			
   }
   public void setMovieDirector( String MovieDirector)
   {
   	this.MovieDirector=MovieDirector;
   }
   public String getMovieDirector()
   { 	
   	return MovieDirector; 
   }

		public String toString()
		{
			return "MovieId=:"+MovieId+" \nMovieName=:"+MovieName+"\nMovieDuration=:"+MovieDuration+"\nMovieRating=:"+MovieRating
					+"\nMovieDirector=:"+MovieDirector;
		}
		
	}