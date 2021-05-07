package ru.ubrr.requestService.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdDate", "updatedDate", "version" })
public class Address {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "post_code")
    private Long postCode;

    private String region;

    @Column(name = "region_group")
    private String regionGroup;

    private String city;

    @Column(name = "city2")
    private String additionalCity;

    private String street;

    private String house;

    @Column(name = "house2")
    private String additionalHouse;

    private String room;

    @Version
    @Column(name = "version", columnDefinition = "integer DEFAULT 1", nullable = false)
    private Long version = 1L;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private Timestamp createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private Timestamp updatedDate;
}
