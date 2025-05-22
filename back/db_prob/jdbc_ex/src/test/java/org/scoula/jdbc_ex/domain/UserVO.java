package org.scoula.jdbc_ex.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserVO {
    String id;
    String password;
    String name;
    String role;
}
