package HashMap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;

class Movie{
  String name;
  String actor;

  Movie(String name,String actor){
    this.name = name;
    this.actor = actor;
  }

  @Override
  public String toString(){
    return "{Movie Name: "+name+", Actor: "+actor+"}";
  }

  @Override
  public boolean equals(Object other){
    if(other==null)
      return false;
    
    Movie movie = (Movie)other;

    if(this.name.equals(movie.name) && this.actor.equals(movie.actor)){
      return true;
    }

    return false;
  }

  @Override
  public int hashCode(){
    return Objects.hash(name,actor);
  }
}
public class MapCustomObject {
  public static void main(String[] args) {
    HashMap<Movie,Integer> map = new HashMap<>();

    map.put(new Movie("SSR","Sai Pallavi"), 101);
    map.put(new Movie("Jersey", "Nani"), 1020);
    map.put(new Movie("Jersey", "Nani"), 1030);
    //both the keys are same but in map key are unique: override the equals() and hashCode()

    Set<Entry<Movie,Integer>> entrySet = map.entrySet();

    for(Entry<Movie, Integer> entry:entrySet){
      System.out.println(entry.getKey()+", "+entry.getValue());
    }
  }
}
