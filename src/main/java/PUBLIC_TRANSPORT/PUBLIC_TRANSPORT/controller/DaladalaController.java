package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.controller;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Daladala;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Officer;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Station;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository.DaladalaRepo;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository.OfficerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Daladala")
public class DaladalaController {
    @Autowired
    private DaladalaRepo daladalaRepo;

    @DeleteMapping(value = "/delete/{Did}")
    public String deleteDaladala(@PathVariable Long Did) {
        Daladala deleteDaladala = daladalaRepo.findById(Did).get();
        daladalaRepo.delete(deleteDaladala);
        return "deleted";

    }

    @GetMapping("/getbyId/{Did}")
    public Optional<Daladala> getOfficer(@PathVariable Long Did) {
        return daladalaRepo.findById(Did);
    }

    @PostMapping("/save")
    public Daladala createDaladala(@RequestBody Daladala daladala) {
        return daladalaRepo.save(daladala);
    }

    @PutMapping("/update/{Did}")
    public String updateDaladala(@PathVariable Long Did, @RequestBody Daladala daladala) {
        Daladala updatedDaladala = daladalaRepo.findById(Did).get();
        updatedDaladala.setName(daladala.getName());
        updatedDaladala.setOfficer(daladala.getOfficer());
        updatedDaladala.setStation(daladala.getStation());
        daladalaRepo.save(updatedDaladala);
        return "updated";

    }
    @GetMapping("/list")
    public List<Daladala> getDaladala(){return daladalaRepo.findAll();}
}
