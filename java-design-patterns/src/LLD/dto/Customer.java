package LLD.dto;

import LLD.dto.builders.CustomerBuilder;

public class Customer {

    private String customerId;
    private String name;
    private int age;
    private String dob;
    private String address;
    private String addressProof;
    private String phoneNumber;

    public Customer(CustomerBuilder customerBuilder) {
        this.customerId = customerBuilder.customerId;
        this.name = customerBuilder.name;
        this.age = customerBuilder.age;
        this.dob = customerBuilder.dob;
        this.address = customerBuilder.address;
        this.addressProof = customerBuilder.addressProof;
        this.phoneNumber = customerBuilder.phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(String addressProof) {
        this.addressProof = addressProof;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", addressProof='" + addressProof + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
