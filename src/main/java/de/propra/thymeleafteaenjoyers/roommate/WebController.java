package de.propra.thymeleafteaenjoyers.roommate;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.yaml.snakeyaml.events.Event;

import java.util.UUID;

@Controller
public class WebController {

    @GetMapping("/")
    public String login() {
        return "Homepage";
    }
    @GetMapping("/Catalog")
    public String catalog(Model model) {
        //:TODO Tabellenbefüllung muss hier gemacht werden >> Roomfactory Reparieren.
        model.addAttribute("rooms", CustomRooms.getCustomRooms());
        return "Catalog";
    }
    @GetMapping("/Booking.html")
    public String booking(Model model, String RoomID) {
        System.out.println("ID:"+RoomID);

        return "Homepage";
    }

    @GetMapping("/rick_astley")
    public String rick_astley() {
        return "dQw4w";
    }
}
