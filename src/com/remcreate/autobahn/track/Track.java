package com.remcreate.autobahn.track;

import com.remcreate.autobahn.vehicle.*;

class Track {
  Lane[] lanes = new Lane[10];
  int state = 0;
  float rlength = 500.0f;
  boolean raceOver = false;

  private Track(){    
    for(int i = 0; i < lanes.length; i++){
      lanes[i] = new Lane(rlength);
    }
  }
  
  public void addAutoToTrack(Auto auto, int lanenumber){
    lanes[lanenumber].setVehicle(auto);
  }
   
  public void doRace(){
    int hour = 0;
    System.out.println("AND THEY'RE OFF ");
    while(! raceOver){
      System.out.println("hour: " + hour);
      for (int i = 0 ; i < lanes.length ; i++){
        Lane currlane = lanes[i];
        currlane.doMove();
	if(currlane.isFinished()){
	  raceOver = true;
	}
        Auto currvehicle = currlane.getVehicle();
	if(currvehicle != null){
          System.out.println( currvehicle.getName() + " is in lane " + i + " at the speed: " + currvehicle.getCurrSpeed() +" mph and has gone a total of " + currlane.getPosition() + " miles");
        }
      }
      hour++;
    }
  }

  public static void main (String[] args){
    Gtr gtr = new Gtr();
    Brz brz = new Brz();
    Frs frs = new Frs();
//    Boat boat = new Boat();
//    Canoe canoe = new Canoe();
    Tractor tractor = new Tractor();
    Zamboni zamboni = new Zamboni();
    Track tinstance = new Track();
    tinstance.addAutoToTrack(gtr, 0);
    tinstance.addAutoToTrack(brz, 1);
    tinstance.addAutoToTrack(frs, 2);
//    tinstance.addAutoToTrack(boat, 3);
//    tinstance.addAutoToTrack(canoe, 4);
    tinstance.addAutoToTrack(tractor, 5);
    tinstance.addAutoToTrack(zamboni, 6);
    tinstance.doRace();
  } 
}

