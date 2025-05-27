package org.scoula.travel.domain;


import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class TravelVO {
    private Long no;
    private String district;
    private String title;
    private String description;
    private String address;
    private String phone;
}
