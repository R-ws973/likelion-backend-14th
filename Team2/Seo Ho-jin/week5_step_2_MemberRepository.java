import java.util.List;

public interface week5_step_2_MemberRepository {

  void save(week5_Member member);

  week5_Member findByName(String name);

  List<week5_Member> findAll();

  boolean existsByName(String name);
}