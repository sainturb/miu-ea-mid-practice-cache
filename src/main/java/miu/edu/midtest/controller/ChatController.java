package miu.edu.midtest.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.midtest.model.Chat;
import miu.edu.midtest.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/chats")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService service;

    @GetMapping
    public List<Chat> getAll() {
        return service.getAll();
    }
}
