package com.education_wired_.work222;

public class Emploee {
    private String firstName;
    private  String  lastName;
    private  String occupation;
    private  long telePhone;

    private static int numberOfEmploees;

    public static int getNumberOfEmploees() {
        return numberOfEmploees;
    }

    public Emploee() {
        numberOfEmploees++;
    }

    public Emploee(String firstName, String lastName, String occupation, long telePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telePhone = telePhone;
        numberOfEmploees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(long telePhone) {
        this.telePhone = telePhone;
    }


}
