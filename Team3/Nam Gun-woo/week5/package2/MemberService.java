public class MemberService {
  private final MemberRepository repository;

  public MemberService(MemberRepository repository){
    this.repository = repository;
  }

  //회원가입 운영진
  void joinStaff(String name, String major, int generation, String part, String position){
    System.out.println("--- 디버깅 시작 ---");
    System.out.println("넘어온 이름: [" + name + "]");
    System.out.println("이름의 길이: " + (name != null ? name.length() : "null"));
    System.out.println("--- 디버깅 종료 ---");
    if(repository.isStaff(name)){
      System.out.println("이미 있는 이름입니다.");
      return;
    }
    repository.createStaff(name, major, generation, part, position);
    System.out.println("등록 완료: "+name);
  }
  //회원가입 아기사자
  void joinLion(String name, String major, int generation, String part, int number){
    if(repository.isLion(name)){
      System.out.println("이미 있는 이름입니다.");
      return;
    }
    repository.createLion(name, major, generation, part, number);
    System.out.println("등록 완료: "+name);
  }
  //운영진 전체 멤버 이름 조회
  void searchAllStaff(){
    System.out.println("운영진: "+repository.findAllStaffNames());
  }
  //아기사자 전체 멤버 이름 조회
  void searchAllLion(){
    System.out.println("아기사자: "+repository.findAllLionNames());
  }

  //각 이름 검색
  void searchMember(String name){
    Staff staff = repository.findStaffByname(name);
    Lion lion = repository.findLionByName(name);
    if(staff != null){
      System.out.println("🎯 ===== 검색 결과 =====\n" +
          "👤 역할: 운영진\n" +
          "📌 이름: " + staff.getName() + " | 🎓 전공: " + staff.getMajor() + " | 🔢 기수: " + staff.getGeneration() + " | 💻 파트: " + staff.getPart() + "\n" +
          "👔 직책: " + staff.getPosition());
      staff.SubmissionStatus();
    }else if(lion != null){
      System.out.println("🎯 ===== 검색 결과 =====\n" +
          "👤 역할: 아기사자\n" +
          "📌 이름: " + lion.getName() + " | 🎓 전공: " + lion.getMajor() + " | 🔢 기수: " + lion.getGeneration() + " | 💻 파트: " + lion.getPart() + "\n" +
          "🆔 학번: " + lion.getNumber());
      lion.SubmissionStatus();
    }
  }
}
