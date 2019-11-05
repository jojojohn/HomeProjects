package com.algorithm.problems.familytree;

import java.util.List;

public class PersonNode {

    private long name;

    private FamilyTreeConstants.Gender gender;
    private String parentalFamily;
    private String famiy;

    public PersonNode(final long name, final FamilyTreeConstants.Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public long getName() {
        return this.name;
    }

    public void setName(final long name) {
        this.name = name;
    }

    public FamilyTreeConstants.Gender getGender() {
        return this.gender;
    }

    public void setGender(final FamilyTreeConstants.Gender gender) {
        this.gender = gender;
    }

    public String getParentalFamily() {
        return parentalFamily;
    }

    public void setParentalFamily(String parentalFamily) {
        this.parentalFamily = parentalFamily;
    }

    public String getFamiy() {
        return famiy;
    }

    public void setFamiy(String famiy) {
        this.famiy = famiy;
    }
}
