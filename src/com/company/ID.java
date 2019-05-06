package com.company;

public class ID {

        private String name;
        private String middle_initial;
        private String last_name;
        private String email_address;

        public ID() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMiddle_initial() {
            return middle_initial;
        }

        public void setMiddle_initial(String middle_initial) {
            this.middle_initial = middle_initial;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getEmail_address() {
            return email_address;
        }

        public void setEmail_address(String email_address) {
            this.email_address = email_address;
        }


        public String getDescription(){
            return name + middle_initial  + last_name + "\r\n" + email_address;
        }

    }

