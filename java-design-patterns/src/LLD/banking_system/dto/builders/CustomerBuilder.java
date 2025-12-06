package LLD.banking_system.dto.builders;

import LLD.banking_system.dto.Customer;

public class CustomerBuilder {

    public String customerId;
    public String name;
    public int age;
    public String dob;
    public String address;
    public String addressProof;
    public String phoneNumber;

    public CustomerBuilder setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setAddressProof(String addressProof) {
        this.addressProof = addressProof;
        return this;
    }

    public CustomerBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Customer builder() {
        return new Customer(this);
    }
}
