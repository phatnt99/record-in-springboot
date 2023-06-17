package blog.home.taphng.recordspringboot.mapper;

import blog.home.taphng.recordspringboot.dto.CommentRespRecord;
import blog.home.taphng.recordspringboot.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentRespRecord toDTO(Comment entity);
}
