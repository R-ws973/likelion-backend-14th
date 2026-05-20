package package2;

import role.Role;

import java.util.ArrayList;
import java.util.List;

public class MemoryMemberRepository implements MemberRepository {
  List<Role> roles = new ArrayList<>();
  @Override
  public void Rinsert(Role role) {
    roles.add(role);
  }
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
