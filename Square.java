class Square {
    Char file;
    int rank;
    Rank retRank;
    File retFile;
    public Square (Char file, int ranks){
        file = this.file;
        rank = this.rank;
    }
    public Char whichFile(){
        return file;
    }

    public int whichRank(){
        return rank;
    }

    
    public void assignFile(File file){//tar en rad som parameter, og tilordner det dene ruten
        retFile = file;
    }

    public File retFile(){//returnerer raden denne ruten tilhorer
        return retFile;
    }

    public void assignRank(Rank rank){
        retRank = rank;
    }
    public Rank retRank(){//returnerer kolonenen denne ruten tilhorer
    return retRank;
  }
}