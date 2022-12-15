package com.dev.milkbottle.springboot.service.posts;

import com.dev.milkbottle.springboot.domain.posts.PostsRepository;
import com.dev.milkbottle.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;
    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
