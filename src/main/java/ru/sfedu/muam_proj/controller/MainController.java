package ru.sfedu.muam_proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.sfedu.muam_proj.model.Pair;
import ru.sfedu.muam_proj.model.User;
import ru.sfedu.muam_proj.model.UsersDate;
import ru.sfedu.muam_proj.service.PairService;
import ru.sfedu.muam_proj.service.UserService;
import ru.sfedu.muam_proj.service.UsersDateService;

import java.util.List;

@Controller
public class MainController {
    private final UserService userService;
    private final PairService pairService;
    private final UsersDateService usersDateService;

    @Autowired
    public MainController(UserService userService, PairService pairService, UsersDateService usersDateService){
        this.userService = userService;
        this.pairService = pairService;
        this.usersDateService = usersDateService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", "redirect:/users");
        return "home";
    }

    // Контроллеры для пользователей
    @GetMapping("/users")
    public String findAllUsers(Model model){
        List<User> users = userService.getAll();
        model.addAttribute("users", users);

        return "user-list";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user){
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteById(id);
        return "redirect:/users";
    }

    // Контроллеры для пар
    @GetMapping("/pairs")
    public String findAllpairs(Model model){
        List<Pair> pairs = pairService.getAll();
        model.addAttribute("pairs", pairs);

        return "pair-list";
    }

    @GetMapping("/pair-create")
    public String createPairForm(Pair pair){
        return "pair-create";
    }

    @PostMapping("/pair-create")
    public String createPair(Pair pair){
        pairService.savePair(pair);
        return "redirect:/pairs";
    }

    @GetMapping("pair-delete/{id}")
    public String deletePair(@PathVariable("id") long id){
        pairService.deleteById(id);
        return "redirect:/pairs";
    }

    // Контроллеры для Dates
    @GetMapping("/Dates")
    public String findAll(Model model){
        List<UsersDate> usersDate = usersDateService.getAll();
        model.addAttribute("usersDate", usersDate);
        return "usersDate-list";
    }

    @GetMapping("/usersDate-create")
    public String createUsersDateForm(UsersDate usersDate){
        return "usersDate-create";
    }

    @PostMapping("/usersDate-create")
    public String createUsersDate(UsersDate usersDate){
        usersDateService.saveDate(usersDate);
        return "redirect:/usersDate";
    }

    @GetMapping("usersDate-delete/{id}")
    public String deleteUsersDate(@PathVariable("id") long id){
        usersDateService.deleteById(id);
        return "redirect:/usersDate";
    }
}
