package com.recencysoft.springsecurity.dto.response;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRoleRest{
    private Long id;
    private Long userId;
    private String roleName;
}
