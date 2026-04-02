package com.example.demo.repository;

import com.example.demo.domain.role.Role;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
  public Role select(String name){
    for(Role role : roles) {
      if(role.getName().equals(name)) {
        return role;
      }
    }
    return null;
  }
  @Override
  public void updateByName(String name, Role member){
    for(Role role : roles) {
      if(role.getName().equals(name)) {
        roles.set(roles.indexOf(role), member);
      }
    }
  }
  @Override
  public boolean deleteByName(String name){
    return roles.removeIf(role -> role.getName().equals(name));
  }
  @Override
  public boolean existsByName(String name){
    boolean flag = false;
    for(Role role : roles) {
      if(role.getName().equals(name)) {
        flag = true;
        break;
      }
    }
    return flag;
  }
}
