package com.example.demo.repository;



import com.example.demo.domain.role.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface MemberRepository {


  Scanner sc = new Scanner(System.in);
  List<Role> roles = new ArrayList<>();



  public void Rinsert(Role role);
  public boolean test(String name);
  public void ALlSelect();
  public Role select(String name);

  public void updateByName(String name, Role member);
  public boolean deleteByName(String name);
  public boolean existsByName(String name);

  }


