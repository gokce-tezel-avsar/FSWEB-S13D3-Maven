package org.example.oop;

    public class Person {
        String firstName;
        String lastName;
        int age;
        String gender;
        String email;
        String phoneNumber;

        public Person ( String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
        public Person(String firstName, String lastName, int age, String gender, String email, String phoneNumber) {
            this(firstName, lastName, age); // chaining
            this.gender = gender;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String setHeight(double height){
            return "this.height = (height < 0) ? 0 : height";
        }
        public String setWidth(double width){
            return "this.width = (width < 0) ? 0 : width";
        }


        public int getAge() {
            return age;
        }
        public boolean isTeen() {
            return age >= 13 && age <= 19;
        }



    }
