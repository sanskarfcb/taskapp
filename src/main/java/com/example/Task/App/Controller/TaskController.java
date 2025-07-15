package com.example.Task.App.Controller;

import com.example.Task.App.Model.Task;
import com.example.Task.App.Repository.Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class TaskController {

    private final Repo repo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", repo.findAll());
        model.addAttribute("task", new Task());
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Task task) {
        repo.save(task);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}