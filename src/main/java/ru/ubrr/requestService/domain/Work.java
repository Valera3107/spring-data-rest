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
@Table(name = "request_applicant_work")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdDate", "updatedDate", "version" })
public class Work {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "org_inn")
    private String orgInn;

    @Column(name = "org_name")
    private String orgName;

    @Column(name = "org_time")
    private String orgTime;

    @Column(name = "org_phone")
    private String orgPhone;

    @Column(name = "relation_phone")
    private String relationPhone;

    @Column(name = "post_name")
    private String postName;

    @OneToOne
    @JoinColumn(name = "applicant_id")
    private Applicant applicant;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "marriage_state")
    private String marriageState;

    private String post;

    private String branch;

    private Long income;

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
