package com.TollPlazaRecords.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.TollPlazaRecords.Entity.Lane;
import com.TollPlazaRecords.Services.LaneService;

@Controller
public class LaneController {
	
	@Autowired
	private LaneService laneService;
	
	@GetMapping("/add-lane")
    public String addLaneForm(@RequestParam("plaza_id") String plazaId, Model model) {
        model.addAttribute("plaza_id", plazaId); // Pass plaza_id to the Thymeleaf template
        return "add-lane"; // Renders add-lane.html
    }
	
	
	@PostMapping("/lane/create")
    public ResponseEntity<?> addLane(@RequestBody Lane lane) {
        Lane savedLane = laneService.addLane(lane);
        if (savedLane != null) {
            return ResponseEntity.ok(savedLane);
        } else {
            return ResponseEntity.status(404).body("Lane not added");
        }
    }

}
