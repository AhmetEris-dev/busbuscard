package com.ahmete.busbuscard.entity;

import com.ahmete.busbuscard.utility.UuidGeneratable;
import com.ahmete.busbuscard.utility.enums.ECardType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tbl_card")
public class Card extends BaseEntity implements UuidGeneratable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(updatable = false, nullable = false, unique = true)
	String uuid;
	Long balance;
	@Enumerated(EnumType.STRING)
	ECardType type;
	
	
}