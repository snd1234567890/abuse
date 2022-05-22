package com.snd.abuse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity 
@Table(name="sample")
@Data
@Getter
@Setter
public class sampleEntity {
    @Id
    private Integer id;
  
    @Column(name="name")
    private String name;

    public String getName(){
        return name;
    }
}
