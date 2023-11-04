package docker.mapper;

import docker.config.MapperConfig;
import docker.dto.PostRequestDto;
import docker.dto.PostResponseDto;
import docker.model.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface PostMapper {
    PostResponseDto toDto(Post post);

    Post toModel(PostRequestDto request);
}
