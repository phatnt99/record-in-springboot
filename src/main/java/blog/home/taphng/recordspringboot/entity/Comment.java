package blog.home.taphng.recordspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

// just a class to simulate Entity
@Entity
public class Comment {

    @Id
    private UUID id;
    private String email;
    private String message;

    // shouldn't show to client
    private String privateCode;

    public Comment() {
    }

    public Comment(UUID id, String email, String message, String privateCode) {
        this.id = id;
        this.email = email;
        this.message = message;
        this.privateCode = privateCode;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public String getPrivateCode() {
        return privateCode;
    }

    public void setPrivateCode(String privateCode) {
        this.privateCode = privateCode;
    }
}
