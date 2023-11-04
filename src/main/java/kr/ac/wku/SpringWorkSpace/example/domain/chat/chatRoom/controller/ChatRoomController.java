package kr.ac.wku.SpringWorkSpace.example.domain.chat.chatRoom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat/room")
public class ChatRoomController {
    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(@PathVariable final long roomId,
                           @RequestParam(defaultValue = "NoName") final String writerName){

        return roomId+"번 채팅방에 "+writerName+"이(가) 들어왔습니다.";
    }

    @GetMapping("/make")
    public String showMake(){
        return "example/domain/chat/chatRoom/make";
    }
}
