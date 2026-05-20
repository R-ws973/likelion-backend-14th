package package1;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {
  MemberRepository(){

  }

  Scanner sc = new Scanner(System.in);
  List<Role> roles = new ArrayList<>();



  public void Rinsert(Role role) {
    roles.add(role);
  }

  public boolean test(String name) {
    boolean flag = true;
    for (int i = 0; i < roles.size(); i++) {
      if (roles.get(i).getName().equals(name)) {
        flag = false;
      }
    }
    return flag;
  }


  public void ALlSelect() {
    for (int i = 0; i < roles.size(); i++) {
      System.out.println(i+1+" .["+ roles.get(i).getJob()+"]"+ roles.get(i).getName());
    }
  }

  public void select(String name){
    for(int i = 0; i < roles.size(); i++) {
      if(roles.get(i).getName().equals(name)) {
        roles.get(i).Print();
      }
    }
  }
}

