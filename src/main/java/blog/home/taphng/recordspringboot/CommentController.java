package blog.home.taphng.recordspringboot;

import blog.home.taphng.recordspringboot.dto.CommentRequest;
import blog.home.taphng.recordspringboot.dto.CommentRequestRecord;
import blog.home.taphng.recordspringboot.dto.CommentRespRecord;
import blog.home.taphng.recordspringboot.entity.Comment;
import blog.home.taphng.recordspringboot.mapper.CommentMapper;
import blog.home.taphng.recordspringboot.repository.CommentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository repository;

    @Autowired
    private CommentMapper mapper;

    @PostConstruct
    public void genData() {
        repository.saveAll(Arrays.asList(
                new Comment(UUID.randomUUID(),"user1@mail.com", "comment from user1", "001"),
                new Comment(UUID.randomUUID(),"user2@mail.com", "comment from user2", "002")
        ));
    }


    @PostMapping("/class")
    public ResponseEntity<?> postComment(@Valid CommentRequest commentRequest) {
        return ResponseEntity.ok(commentRequest);
    }

    @PostMapping("/record")
    public ResponseEntity<?> postComment(@Valid CommentRequestRecord commentRequestRecord) {
        return ResponseEntity.ok(commentRequestRecord);
    }

//    @GetMapping
//    public ResponseEntity<?> getAllCommentUsingModelMapper() {
//        List<Comment> comments = repository.findAll();
//        return ResponseEntity.ok(comments.stream().map(mapper::toDTO).toList());
//    }

    @GetMapping
    public ResponseEntity<?> getAllCommentUsingProjection() {
        List<CommentRespRecord> comments = repository.findBy(CommentRespRecord.class);
        return ResponseEntity.ok(comments);
    }
}
