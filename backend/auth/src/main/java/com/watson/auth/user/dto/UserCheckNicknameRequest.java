package com.watson.auth.user.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class UserCheckNicknameRequest {

    @NonNull
    private String nickname;

}
