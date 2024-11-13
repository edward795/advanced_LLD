package org.example.Design_Car_Rental_System.product;

import org.example.Design_Car_Rental_System.Reservation;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        this.isBillPaid = false;
    }

    private double computeBillAmount(){
        return 100.0;
    }
}
