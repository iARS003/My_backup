package com.film.entity;

<<<<<<< Updated upstream
public class Staff {

}
=======
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "staff")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Integer staffId;

	@Column(name = "first_name", nullable = false, length = 45)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 45)
	private String lastName;

	// FK: staff.address_id → address.address_id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false,
			foreignKey = @ForeignKey(name = "fk_staff_address"))
	private Address address;

	@Lob
	@Column(name = "picture")
	private byte[] picture;

	@Column(name = "email", length = 50)
	private String email;

	// FK: staff.store_id → store.store_id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store_id", nullable = false,
			foreignKey = @ForeignKey(name = "fk_staff_store"))
	private Store store;

	@Column(name = "active", nullable = false)
	private boolean active = true;

	@Column(name = "username", nullable = false, length = 16)
	private String username;

	@Column(name = "password", length = 40)
	private String password;

	@Column(name = "last_update")
	private LocalDateTime lastUpdate;
}
>>>>>>> Stashed changes
