package policy;

import role.Role;

public class StaffSubmissionPolicy implements SubmissionPolicy{

  @Override
  public String getPolicy(Role role){
    return role.getName() + "님은 운영진 과제 검토 대상입니다";
  }
}
