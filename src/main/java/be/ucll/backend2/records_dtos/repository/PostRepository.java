package be.ucll.backend2.records_dtos.repository;

import be.ucll.backend2.records_dtos.controller.dto.ShortPostDto;
import be.ucll.backend2.records_dtos.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<ShortPostDto> findAllProjectedBy();
}