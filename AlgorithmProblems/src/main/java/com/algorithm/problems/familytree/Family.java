package com.algorithm.problems.familytree;

import com.algorithm.problems.linkedlist.deletenode.ListNode;

import java.util.LinkedList;
import java.util.List;

public class Family {

    String familyCode;
    private PersonNode husband;
    private PersonNode wife;

    private List<PersonNode> children;

    public Family(PersonNode husband, PersonNode wife) {
        this.husband = husband;
        this.wife = wife;
        this.familyCode = this.husband.getName()+":"+this.wife.getName();
        children = new LinkedList<>();
    }

    public void addChild(PersonNode child) {
        children.add(child);
    }

    public String getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    public PersonNode getHusband() {
        return husband;
    }

    public void setHusband(PersonNode husband) {
        this.husband = husband;
    }

    public PersonNode getWife() {
        return wife;
    }

    public void setWife(PersonNode wife) {
        this.wife = wife;
    }

    public List<PersonNode> getChildren() {
        return children;
    }

    public void setChildren(List<PersonNode> children) {
        this.children = children;
    }
}
