package com.example.controller;

import com.example.model.Laptop;
import org.springframework.web.bind.annotation .*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

        List<Laptop> laptops = new ArrayList<>();

        public LaptopController() {
            // sample data
            laptops.add(new Laptop(1, "Dell XPS", 15));
            laptops.add(new Laptop(2, "HP Pavilion", 14));
            laptops.add(new Laptop(3, "Lenovo ThinkPad", 10));
        }

        // GET all laptops
        @GetMapping("/all")
        public List<Laptop> getAll() {
            return laptops;
        }

        // GET one laptop
        @GetMapping("/{index}")
        public Laptop getOne(@PathVariable int index) {
            return laptops.get(index);
        }

        // POST (add new laptop)
        @PostMapping("/add")
        public void addLaptop(@RequestBody Laptop laptop) {
            laptops.add(laptop);
        }

        // PUT (update existing laptop)
        @PutMapping("/update/{index}")
        public void updateLaptop(@PathVariable int index, @RequestBody Laptop laptop) {
            laptops.set(index, laptop);
        }

        // DELETE laptop
        @DeleteMapping("/delete/{index}")
        public void deleteLaptop(@PathVariable int index) {
            laptops.remove(index);
        }
}
