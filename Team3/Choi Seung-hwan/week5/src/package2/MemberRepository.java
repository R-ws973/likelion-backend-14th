package package2;

import role.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface MemberRepository {


  Scanner sc = new Scanner(System.in);
  List<Role> roles = new ArrayList<>();



  public void Rinsert(Role role);



  public boolean test(String name);


  public void ALlSelect();

  public void select(String name);

  }


