package docker.service;

import java.util.List;
import docker.dto.PostRequestDto;
import docker.dto.PostResponseDto;
import docker.mapper.PostMapper;
import docker.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public PostResponseDto save(PostRequestDto request) {
        return postMapper.toDto(postRepository.save(postMapper.toModel(request)));
    }

    @Override
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postRepository.findAll().stream()
                .map(postMapper::toDto)
                .toList();
    }
}
