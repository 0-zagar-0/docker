package docker.controller;

import java.util.List;
import docker.dto.PostRequestDto;
import docker.dto.PostResponseDto;
import docker.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public PostResponseDto save(@RequestBody PostRequestDto request) {
        return postService.save(request);
    }

    @GetMapping
    public List<PostResponseDto> getAll(Pageable pageable) {
        return postService.getAll(pageable);
    }

}
