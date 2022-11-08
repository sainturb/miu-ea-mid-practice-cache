package miu.edu.midtest.service;

import lombok.RequiredArgsConstructor;
import miu.edu.midtest.MyCacheable;
import miu.edu.midtest.model.Chat;
import miu.edu.midtest.repository.ChatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatRepository repository;

    @MyCacheable
    public List<Chat> getAll() {
        return repository.findAll();
    }
}
