package com.xworkz.mavjan19.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDto implements Serializable {
     private String createdBy;
     private LocalDateTime createdAt;
     private String updatedBy;
     private LocalDateTime updatedAt;
     
}
