package com.ahmete.busbuscard.entity;

import com.ahmete.busbuscard.utility.enums.EGender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String name;
	String surname;
	@Column(unique = true, nullable = false, length = 11, updatable = false)
	String tc;
	@Enumerated(EnumType.STRING)
	EGender gender;
	
}