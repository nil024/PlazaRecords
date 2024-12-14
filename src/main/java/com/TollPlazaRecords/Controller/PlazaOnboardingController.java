package com.TollPlazaRecords.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TollPlazaRecords.Entity.Lane;
import com.TollPlazaRecords.Entity.PlazaOnboarding;
import com.TollPlazaRecords.Services.LaneService;
import com.TollPlazaRecords.Services.TollPlazaService;

//@RestController
@Controller
//@RequestMapping("/api")
public class PlazaOnboardingController {
	
	@Autowired
	private TollPlazaService tollPlazaService;
	
	@GetMapping("/add-plaza")
    public String addPlazaForm() {
        return "add-plaza";
    }
	
	@GetMapping("/plaza-list")
    public String PlazaListView() {
        return "plaza-list";
    }
	
	@PostMapping("/plaza/create")
	public ResponseEntity<?> addPlaza(@RequestBody PlazaOnboarding onboarding) {
	    PlazaOnboarding savedPlaza = tollPlazaService.createPlzaza(onboarding);
	    if (savedPlaza != null) {
	        return ResponseEntity.ok(savedPlaza); // Include the created plaza details in the response
	    } else {
	        return ResponseEntity.status(404).body("Plaza not added");
	    }
	}
	
	@GetMapping("/plaza-list-data")
    public ResponseEntity<List<PlazaOnboarding>> getPlazaList() {
        List<PlazaOnboarding> plazas = tollPlazaService.plazaList();
        if (plazas.isEmpty()) {
            return ResponseEntity.noContent().build(); // Returns 204 if no data
        }
        return ResponseEntity.ok(plazas);
    }
	
	
//	@Autowired
//	private LaneService laneService;
//	
//	@GetMapping("/add-lane/{plazaId}")
//    public String addLaneForm(@PathVariable String plazaId, Model model) {
//        Lane lane = new Lane();
//        lane.setPlaza_id(plazaId);  // Auto-populate plaza_id
//        model.addAttribute("lane", lane);
//        model.addAttribute("plazaId", plazaId);  // Pass plazaId to display in the form
//        return "add-lane";
//    }
//	
//	@PostMapping("/lane/create")
//    public ResponseEntity<?> createLane(@RequestBody Lane lane) {
//        Lane savedLane = laneService.addLane(lane);
//        if (savedLane != null) {
//            return ResponseEntity.ok().body(savedLane);
//        } else {
//            return ResponseEntity.status(404).body("Lane not added");
//        }
//    }
	

}
