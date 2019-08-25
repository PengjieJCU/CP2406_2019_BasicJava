package week4;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {
    public static void main(String[] args) {
        Lease lease = new Lease();
        lease.setTenantName("PengJie");
        lease.setMonthlyAmount(650);
        lease.setApartmentNumber(8);
        lease.setTermsOfLease(10);
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Your monthly amount is " + lease.getMonthlyAmount());
        System.out.println("Your apartment number is " + lease.getApartmentNumber());
        System.out.println("Your term of lease is " + lease.getTermsOfLease());
        lease.addPetFee();
    }
}