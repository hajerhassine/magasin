package tn.esprit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Rayon;
import tn.esprit.service.RayonService;

@RestController
public class RayonRestController {

	@Autowired
	RayonService rayonService;
	
	//http://localhost:8081/SpringMVC/servlet/retrieveallrayons
	@GetMapping("/retrieveallrayons")
	public List<Rayon> getRayons() {
	List<Rayon> listRayons = rayonService.retrieveAllRayon();
	return listRayons;
	}
	
	//http://localhost:8081/SpringMVC/servlet/retrieveRayon/1
	@GetMapping("/retrieveRayon/{rayonId}")
	public Rayon retrieveRayon(@PathVariable("rayonId") Long rayonId) {
	return  rayonService.retrieveRayon(rayonId);
	}
	
	//http://localhost:8081/SpringMVC/servlet/addRayons
	@PostMapping("/addRayons")
	@ResponseBody
	public Rayon addRayon(@RequestBody Rayon r)
	{
	Rayon rayon = rayonService.addRayon(r);
	return rayon;
	}
	
	
	//http://localhost:8081/SpringMVC/servlet/modifyRayon 
	@PutMapping("/modifyRayon")
	@ResponseBody
	public Rayon modifyRayon(@RequestBody Rayon rayon) {
	return rayonService.updateRayon(rayon);
	}
	
	
	//http://localhost:8081/SpringMVC/servlet/removeRayon/2
	@DeleteMapping("/removeRayon/{rayonId}")
	@ResponseBody
	public void removeRayon(@PathVariable("rayonId") Long rayonId) {
	rayonService.deleteRayon(rayonId);
	}
}
