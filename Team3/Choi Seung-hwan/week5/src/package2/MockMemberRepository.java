package package2;

import role.Role;

public class MockMemberRepository implements MemberRepository {
  @Override
  public void Rinsert(Role role){
    System.out.println("등록 완료 : " + role.getName());
  };



  @Override
  public boolean test(String name) {
    boolean flag = true;
    for (int i = 0; i < roles.size(); i++) {
      if (roles.get(i).getName().equals(name)) {
        flag = false;
      }
    }
    return flag;
  }

  @Override
  public void ALlSelect() {
    for (int i = 0; i < roles.size(); i++) {
      System.out.println(i+1+" .["+ roles.get(i).getJob()+"]"+ roles.get(i).getName());
    }
  }
  @Override
  public void select(String name){
    for(int i = 0; i < roles.size(); i++) {
      if(roles.get(i).getName().equals(name)) {
        roles.get(i).Print();
      }
    }
  }
}
