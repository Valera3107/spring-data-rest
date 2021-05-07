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
import java.util.List;
import java.util.UUID;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({"createdDate", "updatedDate", "version"})
public class Request {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private String phone;

    @Column(name = "claim_id")
    private Long claimId;

    @Column(name = "claim_link")
    private String claimLink;

    @Column(name = "type_income")
    private String typeIncome;

    @OneToOne
    @JoinColumn(name = "status_id")
    private DictionaryValue status;

    @Column(name = "status_description")
    private String statusDescription;

    @Hidden
    @OneToOne(mappedBy = "request")
    private Applicant applicant;

    @Hidden
    @OneToOne(mappedBy = "request")
    private Bki bki;

    @Hidden
    @OneToOne(mappedBy = "request")
    private Limit limit;

    @Hidden
    @OneToOne(mappedBy = "request")
    private PredLimit predLimit;

    @Hidden
    @OneToOne(mappedBy = "request")
    private Delivery delivery;

    @Hidden
    @OneToOne(mappedBy = "request")
    private EsiaApplicant esiaApplicant;

    @Hidden
    @OneToMany(mappedBy = "request")
    private List<RequestCall> requestCalls;

    @Hidden
    @OneToMany(mappedBy = "request")
    private List<RequestService> requestServices;

    @Hidden
    @OneToMany(mappedBy = "request")
    private List<RequestSms> requestSms;

    @Column(name = "credit_amount")
    private Long creditAmount;

    @Version
    @Column(name = "version", columnDefinition = "integer DEFAULT 1", nullable = false)
    private long version = 1L;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private Timestamp createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSSZ")
    private Timestamp updatedDate;
}
