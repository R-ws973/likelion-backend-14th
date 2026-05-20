package com.backend14.demo.package2;

import com.backend14.demo.role.Lion;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface MemberRepository {

    public void createOperationLion ();
    public void createStudentLion ();
    public boolean hasLion(String name);
    public void showLions();
    public void showLions(List<Lion> lions);
    public void searchLionByName ();
    public void searchByName(String name);
    public void searchByPart();
    public void showParts();
}