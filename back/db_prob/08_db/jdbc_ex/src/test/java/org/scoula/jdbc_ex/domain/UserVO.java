package org.scoula.jdbc_ex.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class UserVO {
    String id;
    String password;
    String name;
    String role;

}