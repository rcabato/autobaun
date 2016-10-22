import java.util.Random;

class Auto{
  private int speed = 0;
  private String name = "NAME ME BRO";
  protected float currSpeed = 0.0f;
  private Random rnd = new Random();

  public int getSpeed(){
    return speed;
  }
  public String getName(){
    return name;
  }

  public float getCurrSpeed(){
    return currSpeed;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setSpeed(int speed){
    this.speed = speed;
  }

  public void newSpeed(){
    this.currSpeed = rnd.nextInt(this.speed);
  }

}
