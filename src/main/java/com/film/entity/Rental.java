package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rental")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer rentalId;

    @Column(name = "rental_date", nullable = false)
    private LocalDateTime rentalDate;

    // FK: rental.inventory_id → inventory.inventory_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_rental_inventory"))
    private Inventory inventory;

    // FK: rental.customer_id → customer.customer_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_rental_customer"))
    private Customer customer;

    // FK: rental.staff_id → staff.staff_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_rental_staff"))
    private Staff staff;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;
<<<<<<< Updated upstream

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public Staff getStaff() {
//        return staff;
//    }
//
//    public void setStaff(Staff staff) {
//        this.staff = staff;
//    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

//    public void setReturnDate(LocalDateTime returnDate) {
//        this.returnDate = returnDate;
//    }

    public LocalDateTime getLastUpdate()
    {
        return lastUpdate;
    }

//    public void setLastUpdate(LocalDateTime lastUpdate)
//    {
//        this.lastUpdate = lastUpdate;
//    }

    public Integer getRentalId()
    {
        return rentalId;
    }

    public void setRentalId(Integer rentalId)
    {
        this.rentalId = rentalId;
    }
}
=======
}
>>>>>>> Stashed changes
