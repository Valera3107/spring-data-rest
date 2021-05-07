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
@Table(name = "request_pred_limit")
@Data
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "createdDate", "updatedDate", "version" })
public class PredLimit {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "rtmd_id")
    private Long rtmdId;

    @Column(name = "limit_pd")
    private Long limitPd;

    @Column(name = "limit_npd")
    private Long limitNpd;

    @Column(name = "credit_amount_final")
    private Long creditAmountFinal;

    @Column(name = "limit_start_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date limitStartDate;

    @Column(name = "limit_end_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date limitEndDate;

    @OneToOne
    @JoinColumn(name = "request_id")
    private Request request;

    private Double prc;

    private Boolean zp;

    private Long result;

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
