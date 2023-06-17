package blog.home.taphng.recordspringboot.dto;

import jakarta.validation.constraints.NotNull;

public class CommentRequest {
    @NotNull
    private String email;
    private String message;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
