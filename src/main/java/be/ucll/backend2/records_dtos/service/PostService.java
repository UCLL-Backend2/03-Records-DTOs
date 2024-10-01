package be.ucll.backend2.records_dtos.service;

import be.ucll.backend2.records_dtos.controller.dto.ShortPostDto;
import be.ucll.backend2.records_dtos.model.Post;
import be.ucll.backend2.records_dtos.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Optional<Post> getPostWithId(long id) {
        return postRepository.findById(id);
    }

    public List<ShortPostDto> getAllPosts() {
        return postRepository.findAllProjectedBy();
    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }
}
