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
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "esia_document")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdDate", "updatedDate", "version" })
public class EsiaDocument {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private String type;

    private String series;

    private String number;

    private String institute;

    @Column(name = "entry_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date entryDate;

    @Column(name = "institute_code")
    private String instituteCode;

    @Column(name = "expiry_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date expiryDate;

    @Column(name = "act_no")
    private String actNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String vrfstu;

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
