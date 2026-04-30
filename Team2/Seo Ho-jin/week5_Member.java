public class week5_Member {
  private String role;
  private String name;
  private String major;
  private int generation;
  private String part;
  private String studentId;

  public week5_Member(String role, String name, String major, int generation, String part, String studentId) {
    this.role = role;
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }

  public void printInfo() {
    System.out.println("역할: " + role);
    System.out.println("이름: " + name + " | 전공: " + major + " | 기수: " + generation + " | 파트: " + part);
    System.out.println("학번: " + studentId);
    System.out.println("과제 제출 가능: 가능");
  }
}