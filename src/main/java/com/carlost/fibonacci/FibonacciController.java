package com.carlost.fibonacci;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fibonacci")
public class FibonacciController {
    /**
     * Determine the n-th fibonacci number
     *
     * @param n position of the fibonacci number requested
     * @return the n-th fibonacci number in the sequence
     */
    @GetMapping("findNumber")
    public ResponseEntity<Integer> findFibonacciNumber(@RequestParam int n) {
        return ResponseEntity.ok(fibonacci(n));
    }

    /**
     * Recursively find the Fibonacci number at the position in the sequence
     *
     * @param position requested position of fibonacci sequence (i.e. 8th number in sequence)
     * @return fibonacci number at position (i.e. 21)
     */
    private int fibonacci(int position) {
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
