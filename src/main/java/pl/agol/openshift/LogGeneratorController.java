package pl.agol.openshift;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@Slf4j
@RestController
@RequestMapping("/api/logs")
class LogGeneratorController {

    @GetMapping("{lines}")
    void generateLogs(@PathVariable("lines") int linesOfLogs) {

        IntStream.range(0, linesOfLogs).forEach(i -> log.info("This is a very funny log"));
    }
}
