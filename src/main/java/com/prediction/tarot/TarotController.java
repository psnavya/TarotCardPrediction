package com.prediction.tarot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/tarot")
public class TarotController {
        private final TarotService tarotService;

        @Autowired
        public TarotController(TarotService tarotService) {
            this.tarotService = tarotService;
        }

        @GetMapping("/draw")
        public TarotCard drawCard() {
            return tarotService.drawCard();
        }
    }
