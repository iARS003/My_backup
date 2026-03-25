package com.film.entity;

<<<<<<< Updated upstream
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
=======
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
>>>>>>> Stashed changes

@Entity
@Table(name = "store")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< Updated upstream
	@Column(name)
}
=======
	@Column(name = "store_id")
	private Integer storeId;

	// FK: store.manager_staff_id → staff.staff_id
	// Circular dependency with Staff: save Staff first (store=null),
	// save Store, then update Staff.store.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manager_staff_id", nullable = false,
			foreignKey = @ForeignKey(name = "fk_store_staff"))
	private Staff managerStaff;

	// FK: store.address_id → address.address_id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false,
			foreignKey = @ForeignKey(name = "fk_store_address"))
	private Address address;

	@Column(name = "last_update")
	private LocalDateTime lastUpdate;

	public Integer getManagerStaffId() {
		return 1;
	}
}
>>>>>>> Stashed changes
