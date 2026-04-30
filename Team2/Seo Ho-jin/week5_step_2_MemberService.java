import java.util.List;

public class week5_step_2_MemberService {

  private final week5_step_2_MemberRepository repository;

  public week5_step_2_MemberService(week5_step_2_MemberRepository repository) {
    this.repository = repository;
  }

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