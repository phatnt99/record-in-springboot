package blog.home.taphng.recordspringboot.dto;

import jakarta.validation.constraints.NotNull;

public record CommentRequestRecord(
        @NotNull String email,
        String message
) { }
