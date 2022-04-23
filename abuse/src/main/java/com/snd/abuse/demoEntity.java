package com.snd.abuse;

@Entity 
@Table(name="テーブル名")
@Data
public class demoEntity {
  @Id
  private Integer id;

  @Column(name="カラム名")
  private String name;
}