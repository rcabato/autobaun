class Track {
  Auto[] autos;
  
  int state = 0;

  private Track(){
    autos = new Auto[] {
      new Gtr(),
      new Frs(),
      new Brz(),
      new Boat(),
      new Canoe(),
      new Tractor(),
      new Zamboni()
    };
  }

  public String getOutput(){
    return autos[state].getOutput();
  }

  public int getCount(){
    return autos[state].getCount();
  }

  public void switchAuto(){
    state = (state + 1) % autos.length;
  }

  public void hazWheel(){
    if(autos[state] instanceof AttrWheel){
      AttrWheel drift = (AttrWheel) autos[state];
      drift.hazWheel();
    }
  }

  public String getName(){ 
    return autos[state].getClass().getName();
  }

  public static void main (String[] args){
  Track afinstance = new Track();
    for (int i = 0 ; i < 14 ; i++){
      System.out.println("Old MacDonald had a farm: A " + afinstance.getName() + " says: " + afinstance.getOutput() + ". talkativeness = " + afinstance.getCount());
      afinstance.hazWheel();
      afinstance.switchAuto();
    }
  }  
}

