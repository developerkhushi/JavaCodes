package com.java.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private String univName;
    private double psp;
    private String batch;
    private int gradYear;
    private String phoneNumber;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
        //
    }


    public static class Builder {
        private String name;
        private int age;
        private String univName;
        private double psp;
        private String batch;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            // validation
            if (this.getAge() < 20) {
                throw new RuntimeException("Age shouldn't be less than 20");
            }
            if (this.getGradYear() > 2023) {
                throw new RuntimeException("Grad year shouldn't be more than 2023");
            }

            return new Student(this);
        }
    }


}
