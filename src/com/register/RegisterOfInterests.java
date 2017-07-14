package com.register;

import com.register.data.Politician;

import java.util.Set;

public class RegisterOfInterests {
    private String fileLocation;
    private Set<Politician> members;

    private RegisterOfInterests(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    RegisterOfInterests createRegisterOfInterests(String fileLocation) {
        return new RegisterOfInterests(fileLocation);
    }

    void populateMembers() {

    }
}
