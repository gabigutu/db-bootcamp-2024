package com.mobile.design_patterns.builder;

public class User {
    private String firstName;
    private String lastName;
    private int phone;
    private String address;

    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName= builder.lastName;
        this.phone = builder.phone;
        this.address = builder.address;
        // ...
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }

    //getter

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int phone;
        private String address;

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress (String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}