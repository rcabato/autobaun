package com.remcreate.autobahn.track;

import com.remcreate.autobahn.vehicle.Vehicle;

abstract class Lane { 
  float length;
  float position = 0.0f;
  Vehicle vehicle;
  String laneName;
  public Lane(float length){
    this.length = length;
  }

  public float getLength(){
    return length;
  }

  public float getPosition(){
    return position;
  }
  
  private void setPosition(float position){
    this.position = position;
  }
  
  public Vehicle getVehicle(){
    return vehicle;
  }

  public String getLaneName(){
    return laneName;
  }
  public void setVehicle(Vehicle vehicle){
    this.vehicle = vehicle;
  }

  abstract public void newSpeed();

  public void doMove(){
    if(vehicle != null){
      newSpeed();
      setPosition(position + vehicle.getCurrSpeed());
    }
  }

  public boolean isFinished(){
    return position >= length;
  }
}  
