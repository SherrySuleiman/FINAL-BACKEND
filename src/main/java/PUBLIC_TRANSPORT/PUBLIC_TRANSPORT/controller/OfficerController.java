package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.controller;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Officer;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository.OfficerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins ="*",allowedHeaders = "*")
@RequestMapping("/Officer")
public class OfficerController {
    @Autowired
    private OfficerRepo officerRepo;
    @DeleteMapping(value = "/delete/{Oid}")
    public String deleteOfficer(@PathVariable Long Oid) {
        Officer deleteOfficer = officerRepo.findById(Oid).get();
        officerRepo.delete(deleteOfficer);
        return "deleted";

    }
    @GetMapping("/getbyId/{Oid}")
    public Optional<Officer> getOfficer(@PathVariable Long Oid) {
        return officerRepo.findById(Oid);
    }
    @PostMapping("/save")
    public Officer createOfficer(@RequestBody Officer officer) {
        return officerRepo.save(officer);
    }
    @PutMapping("/update/{Oid}")
    public String updateOfficer(@PathVariable Long Oid, @RequestBody Officer officer) {
        Officer updatedOfficer = officerRepo.findById(Oid).get();
        updatedOfficer.setName(officer.getName());
        updatedOfficer.setAddress(officer.getAddress());
        updatedOfficer.setPhone(officer.getPhone());
        officerRepo.save(updatedOfficer);
        return "updated";

    }
    @GetMapping("/list")
    public List<Officer> getOfficer(){return officerRepo.findAll();}

}
