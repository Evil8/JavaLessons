package by.task1;
import java.util.Objects;

/**
 * Created by Anton_Khmyzov on 2/17/2017.
 */
public class Customer {

        private int id;
        private String lastName;
        private String firstName;
        private String surName;
        private String address;
        private String creditCardNum;
        private String bankAccNum;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSurName() {
            return surName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCreditCardNum() {
            return creditCardNum;
        }

        public void setCreditCardNum(String creditCardNum) {
            this.creditCardNum = creditCardNum;
        }

        public String getBankAccNum() {
            return bankAccNum;
        }

        public void setBankAccNum(String bankAccNum) {
            this.bankAccNum = bankAccNum;
        }

        public Customer(int id, String lastName, String firstName, String surName,
                        String address, String creditCardNum, String bankAccNum) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.surName = surName;
            this.address = address;
            this.creditCardNum = creditCardNum;
            this.bankAccNum = bankAccNum;
        }

        public void show() {
            System.out.println("ID: " + getId());
            System.out.println("FirstName: " + getFirstName());
            System.out.println("LastName: " + getLastName());
            System.out.println("Address: " + getAddress());
            System.out.println("AccountNumber: " + getBankAccNum());
            System.out.println("CardNumber: " + getCreditCardNum());
        }


        public int cardHashCode() {
            final int prime = 773;
            int result = 1;
            result = prime * result + ((creditCardNum == null) ? 0 : creditCardNum.hashCode());
            return result;
        }


}
