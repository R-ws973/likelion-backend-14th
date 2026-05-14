package role;

public class Lion extends Role{

  private final String track;

  public Lion(String name, String track) {
    super(name);
    this.track = track;
  }

  public String getTrack() {
    return track;
  }

  @Override
  public String getRoleName(){
    return "아기사자";
  }

  @Override
  public String getInfo(){
    return "[아기사자] 이름: " + getName() + ", 트랙: " + track;
  }
}
