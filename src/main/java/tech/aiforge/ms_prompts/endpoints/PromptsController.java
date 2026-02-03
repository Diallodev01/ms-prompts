package tech.aiforge.ms_prompts.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/prompts")
public class PromptsController {
    private final PromptsService promptsService;

    public PromptsController(PromptsService promptsService) {
        this.promptsService = promptsService;
    }

    @PostMapping
    public String define(@RequestBody DefinePrompt definePrompt) {
        return promptsService.define(definePrompt);
    }
}
