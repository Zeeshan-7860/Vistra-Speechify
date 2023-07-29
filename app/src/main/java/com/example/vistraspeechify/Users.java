package com.example.vistraspeechify;

public class Users {
        private String name;
        private String phone;
        private String address;
        private String email;

        private String password;

        // Default constructor (required for Firestore)
        public Users() {
        }

        public Users(String name, String phone, String address, String email, String password) {
            this.name = name;
            this.phone = phone;
            this.address = address;
            this.email = email;
            this.password = password;
        }

        // Getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


