package com.algorithm.problems.familytree;

import com.sun.tools.javac.jvm.Gen;

import java.util.*;

public class FamilyTreeImplementation {

    public static long count=1;
    private Map<String, Family> familyMap = new HashMap<>();
    private Queue<PersonNode> availableMales = new LinkedList<>();
    private Queue<PersonNode> availableFeMales = new LinkedList<>();

    public static void main(String[] args) {

        PersonNode p1 = new PersonNode(count++, FamilyTreeConstants.Gender.MALE);
        PersonNode p2 = new PersonNode(count++, FamilyTreeConstants.Gender.FEMALE);
        PersonNode p3 = new PersonNode(count++, FamilyTreeConstants.Gender.MALE);
        PersonNode p4 = new PersonNode(count++, FamilyTreeConstants.Gender.FEMALE);
        FamilyTreeImplementation familyTreeImplementation = new FamilyTreeImplementation();
        familyTreeImplementation.marry(p1, p2);
        familyTreeImplementation.marry(p3, p4);
        familyTreeImplementation.addChild(p1.getName()+":"+p2.getName(), false);
        familyTreeImplementation.addChild(p1.getName()+":"+p2.getName(), true);
        familyTreeImplementation.addChild(p1.getName()+":"+p2.getName(), false);
        familyTreeImplementation.addChild(p1.getName()+":"+p2.getName(), true);
        familyTreeImplementation.addChild(p3.getName()+":"+p4.getName(), false);
        familyTreeImplementation.addChild(p3.getName()+":"+p4.getName(), false);
        familyTreeImplementation.addChild(p3.getName()+":"+p4.getName(), false);
        familyTreeImplementation.addChild(p3.getName()+":"+p4.getName(), true);
        familyTreeImplementation.marry(familyTreeImplementation.availableMales.poll(), familyTreeImplementation.availableFeMales.poll());
    }


    public void marry(PersonNode male, PersonNode female) {
        if (availableMales.contains(male)) {
            availableMales.remove(male);
        }
        if (availableFeMales.contains(female)) {
            availableFeMales.remove(female);
        }
        Family family = new Family(male, female);
        familyMap.put(family.getFamilyCode(), family);
    }

    public void addChild(final String familyCode, boolean isMale) {
        PersonNode childNode = isMale ? new PersonNode(count++, FamilyTreeConstants.Gender.MALE) :
                new PersonNode(count++, FamilyTreeConstants.Gender.FEMALE);
        Family family = familyMap.get(familyCode);
        childNode.setParentalFamily(familyCode);
        family.addChild(childNode);
        if(isMale) {
            availableMales.add(childNode);
        } else {
            availableFeMales.add(childNode);
        }
    }
}
