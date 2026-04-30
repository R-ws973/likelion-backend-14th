import java.util.List;

public class week5_MemberService {
  private week5_step1_MemberRepository repository = new week5_step1_MemberRepository();

  public boolean register(week5_Member member) {
    if (repository.existsByName(member.getName())) {
      return false;
    }

    repository.save(member);
    return true;
  }

  public week5_Member searchByName(String name) {
    return repository.findByName(name);
  }

  public List<week5_Member> getAllMembers() {
    return repository.findAll();
  }
}