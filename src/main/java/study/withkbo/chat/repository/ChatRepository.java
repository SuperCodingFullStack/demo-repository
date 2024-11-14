package study.withkbo.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.withkbo.chat.entity.ChatRoom;

@Repository
public interface ChatRepository extends JpaRepository<ChatRoom, Long> {
}