package org.scoula.security.account.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {
    private String username;
    private String password;
    private String email;
    private String reg_date;
    private String update_date;

    private List<AuthVO> authList;  //권한 목록, join 처리 필요
}
