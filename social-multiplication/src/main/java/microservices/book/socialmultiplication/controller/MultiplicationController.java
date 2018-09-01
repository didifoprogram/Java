package microservices.book.socialmultiplication.controller;

import microservices.book.socialmultiplication.Multiplication;
import microservices.book.socialmultiplication.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller and @ResponseBody.
@RequestMapping("/multiplications") // Class level setting the root context for all methods.
public class MultiplicationController {

    private final MultiplicationService multiplicationService;

    @Autowired
    public MultiplicationController(MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    @GetMapping("/random") // Equivalent to @RequestMapping(method = RequestMethod.GET)
    Multiplication getRandomMultiplication() {
        return multiplicationService.createRandomMultiplication();
    }
}
