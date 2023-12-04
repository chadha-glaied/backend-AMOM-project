package com.amal.portabilite.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class SubBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long subBatchId ;
     private Integer quantity;
     private String user;
     private String action;
     private String status;
     @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     private LocalDateTime startDate;

     @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     private LocalDateTime endDate;

     @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     private LocalDateTime insertionDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime modificationDate;

     private String comment;

    @ManyToOne
    @JoinColumn(name = "subBatchHistoryId")
//  @JsonBackReference, @JsonIgnore (alone) or  @JsonIgnoreProperties("subBatches") didn't solve the stackOverFlow error (JSON recursive dependency)
    @JsonIgnore
    @ToString.Exclude
    private SubBatchHistory subBatchHistory;

    @OneToOne
    @JoinColumn(name = "detailId")
    @JsonIgnore
    @ToString.Exclude
    private  Detail detail;




}
