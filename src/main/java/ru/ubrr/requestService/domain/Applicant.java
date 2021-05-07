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
@Table(name = "request_applicant")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdDate", "updatedDate", "version" })
public class Applicant {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private String dp;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "old_full_name")
    private String oldFullName;

    @Column(name = "birth_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date birthDate;

    @OneToOne
    @JoinColumn(name = "request_id")
    private Request request;

    @Hidden
    @OneToOne(mappedBy = "applicant")
    private Document document;

    @Hidden
    @OneToOne(mappedBy = "applicant")
    private Work work;

    @Hidden
    @OneToOne(mappedBy = "applicant")
    private Passport passport;

    private String email;

    private String sex;

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
