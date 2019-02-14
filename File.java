class File {
    private Square [] FileValues;//an array containing all the values of that file
    private int uniqueNr;//the files unique identifier (a char)
  
  
    public File(Char unique, Square [] values){
      fileValues = values;
      uniqueNr = unique;
    }
  
    public Square [] fileArr(){//returns the entire file
      return rankValues;
    }
  
    public int whichFile(){//returns the file character
      return uniqueNr;
    }

}