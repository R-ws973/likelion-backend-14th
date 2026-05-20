package role;

public class Staff extends Role{

  private final String position;

  public Staff(String name, String position){
    super(name);
    this.position = position;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String getRoleName(){
    return "운영진";
  }

  @Override
  public String getInfo(){
    return "[운영진] 이름: " + getName() + ", 직책: " + position;
  }
}
