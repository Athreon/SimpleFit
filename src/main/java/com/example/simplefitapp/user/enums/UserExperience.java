package com.example.simplefitapp.user.enums;

public enum UserExperience {

    BEGINNER ("Beginner"),
    ADVANCED ("Advanced"),
    GYMRAT ("Gymrat");

    final String displayName;

    UserExperience(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
