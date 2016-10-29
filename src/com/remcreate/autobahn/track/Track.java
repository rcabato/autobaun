package com.remcreate.autobahn.track;

import com.remcreate.autobahn.vehicle.*;

class Track {
  Lane[] lanes = new Lane[10];
  int state = 0;
  float rLength = 500.0f;
  boolean raceOver = false;

  private Track(){    
    for(int i = 0; i < lanes.length; i++){
      lanes[i] = getLane();
    }
  }

  public Lane getLane(){
    return new WaterLane(rLength);
  }
  
  public void addVehicleToTrack(Vehicle vehicle, int lanenumber){
    lanes[lanenumber].setVehicle(vehicle);
  }
   
  public void doRace(){
    int hour = 0;
    System.out.println("AND THEY'RE OFF ");

    while(! raceOver){
      System.out.println("hour: " + hour);
      for (int i = 0 ; i < lanes.length ; i++){
        Lane currlane = lanes[i];
        currlane.doMove();
//        if (currtype != currvehicle.getType) {
//	  System.out.println( currvehicle.getName() + " just crashed and burned");
//	}
	if(currlane.isFinished()){
	  raceOver = true;
	}
        Vehicle currvehicle = currlane.getVehicle();
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
    Canoe canoe = new Canoe();
    Tractor tractor = new Tractor();
    Zamboni zamboni = new Zamboni();
    Track tinstance = new Track();
    tinstance.addVehicleToTrack(gtr, 0);
    tinstance.addVehicleToTrack(brz, 1);
    tinstance.addVehicleToTrack(frs, 2);
    tinstance.addVehicleToTrack(canoe, 4);
    tinstance.addVehicleToTrack(tractor, 5);
    tinstance.addVehicleToTrack(zamboni, 6);
    tinstance.doRace();
  } 
}

