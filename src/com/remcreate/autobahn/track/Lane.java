package com.remcreate.autobahn.track;

import com.remcreate.autobahn.vehicle.Auto;

class Lane { 
  float length;
  float position = 0.0f;
  Auto vehicle;

  public Lane(float length){
    this.length = length;
  }

  public float getLength(){
    return length;
  }

  public float getPosition(){
    return position;
  }

  public void setPosition(float position){
    this.position = position;
  }
  
  public Auto getVehicle(){
    return vehicle;
  }

  public void setVehicle(Auto auto){
    this.vehicle = auto;
  }

  public void doMove(){
    if(vehicle != null){
      vehicle.newSpeed();
      setPosition(position + vehicle.getCurrSpeed());
    }
  }

  public boolean isFinished(){
    return position >= length;
  }


}  
