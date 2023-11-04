package docker.service;

import java.util.List;
import docker.dto.PostRequestDto;
import docker.dto.PostResponseDto;
import org.springframework.data.domain.Pageable;

public interface PostService {
    PostResponseDto save(PostRequestDto request);

    List<PostResponseDto> getAll(Pageable pageable);
}
