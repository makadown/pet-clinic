package com.makadown.petclinic.model;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="specialties")
public class Speciality extends BaseEntity {

    @Column(name="description")
    private String description;
}
