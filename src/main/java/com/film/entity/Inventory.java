package com.film.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventory")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer inventoryId;

<<<<<<< Updated upstream
//    @ManyToOne
//    @JoinColumn(name = "film_id")
//    private Film film;
//
//    @ManyToOne
//    @JoinColumn(name = "store_id")
//    private Store store;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;

//    public Film getFilm() {
//        return film;
//    }
//
//    public void setFilm(Film film) {
//        this.film = film;
//    }
//
//    public Store getStore() {
//        return store;
//    }
//
//    public void setStore(Store store) {
//        this.store = store;
//    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

//    public void setLastUpdate(LocalDateTime lastUpdate) {
//        this.lastUpdate = lastUpdate;
//    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

}
=======
    // FK: inventory.film_id → film.film_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_inventory_film"))
    private Film film;

    // FK: inventory.store_id → store.store_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_inventory_store"))
    private Store store;

    @Column(name = "last_update", insertable = false, updatable = false)
    private LocalDateTime lastUpdate;
}
>>>>>>> Stashed changes
