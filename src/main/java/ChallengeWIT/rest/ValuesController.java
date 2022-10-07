package ChallengeWIT.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ValuesController {

    @GetMapping(value = "/sum", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result sum(@RequestParam double a, @RequestParam double b ){
        return new Result(a+b);
    }

    @GetMapping(value = "/subtraction", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result subtraction(@RequestParam double a, @RequestParam double b ){
        return new Result(a-b);
    }

    @GetMapping(value = "/division", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result division(@RequestParam double a, @RequestParam double b ){
        return new Result(a/b);
    }

    @GetMapping(value = "/multiplication", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Result multiplication(@RequestParam double a, @RequestParam double b ){
        return new Result(a*b);
    }

}
