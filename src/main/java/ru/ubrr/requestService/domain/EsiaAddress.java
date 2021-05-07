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
@Table(name = "esia_address")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties( { "createdDate", "updatedDate", "version" })
public class EsiaAddress {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "address_str")
    private String addressStr;

    @Column(name = "post_code")
    private String postCode;

    private String type;

    private String country;

    private String region;

    private String flat;

    @Column(name = "region_group")
    private String regionGroup;

    private String city;

    private String district;

    private String settlement;

    private String street;

    @Column(name = "addition_area")
    private String additionArea;

    @Column(name = "addition_area_street")
    private String additionAreaStreet;

    @Column(name = "house_num")
    private String houseNum;

    private String building;

    private String frame;

    @Column(name = "fias_code")
    private String fiasCode;

    @OneToOne
    @JoinColumn(name = "applicant_id")
    private EsiaApplicant esiaApplicant;

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
