package adapter.example2;

public class SchoolStudent {

        private String firstName;
        private String surName;

        public SchoolStudent(String firstName, String surName){
            this.firstName = firstName;
            this.surName = surName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSurname() {
            return surName;
        }


}
