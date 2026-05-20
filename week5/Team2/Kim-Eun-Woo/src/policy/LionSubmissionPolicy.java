package policy;

import role.Role;

public class LionSubmissionPolicy implements SubmissionPolicy {
  @Override
  public String getPolicy(Role role){
    return role.getName() + "님은 아기사자 과제 제출 대상입니다";
  }

}
