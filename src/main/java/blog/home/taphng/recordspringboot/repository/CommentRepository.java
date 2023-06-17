package blog.home.taphng.recordspringboot.repository;

import blog.home.taphng.recordspringboot.dto.CommentRespRecord;
import blog.home.taphng.recordspringboot.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {
    <T> List<T> findBy(Class<T> classType);
}
