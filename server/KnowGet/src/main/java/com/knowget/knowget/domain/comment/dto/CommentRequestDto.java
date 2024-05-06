package com.knowget.knowget.domain.comment.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentRequestDto {

    //댓글 내용
    @NotNull
    private String content;
    //유저 아이디
    @NotNull
    private String id;
}
