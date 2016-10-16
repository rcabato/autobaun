class AutoOut{
  public int count = 0;
  private String output = "I ain't sayin shit";

  public String getOutput(){
    count = count + 1;
    return output;
  }
  public void setOutput(String freshoutput){
    output = freshoutput;
  }
  public int getCount(){
    return count;
  }
}
