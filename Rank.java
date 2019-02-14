class Rank {
    private Square [] RankValues;//an array containing all the values of that rank
    private int uniqueNr;//the ranks unique identifier (an int)
  
  
    public Rank(int unique, Square [] values){
      rankValues = values;
      uniqueNr = unique;
    }
  
    public Square [] rankArr(){//returns the entire rank
      return rankValues;
    }
  
    public int whichRank(){//returns the rank number
      return uniqueNr;
    }

}