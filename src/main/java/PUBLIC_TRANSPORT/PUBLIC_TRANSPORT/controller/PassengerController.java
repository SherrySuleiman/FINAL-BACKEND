package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.controller;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Passenger;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Station;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {
    @Autowired
    private PassengerRepo passengerRepo;



    @DeleteMapping(value = "/delete/{Pid}")
    public String deletePassenger(@PathVariable Long Pid) {
        Passenger deletePassenger = passengerRepo.findById(Pid).get();
        passengerRepo.delete(deletePassenger);
        return "deleted";
    }

    @GetMapping("/getbyId/{Pid}")
    public Optional<Passenger> getPassenger(@PathVariable Long Pid) {
        return passengerRepo.findById(Pid);
    }

    @PostMapping("/save")
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerRepo.save(passenger);
    }

    @PutMapping("/update/{Pid}")
    public String updatePassenger(@PathVariable Long Pid, @RequestBody Passenger passenger) {
        Passenger updatedPassenger = passengerRepo.findById(Pid).get();
        updatedPassenger.setName(passenger.getName());
        updatedPassenger.setName(passenger.getName());
        updatedPassenger.setAddress(passenger.getAddress());
        updatedPassenger.setDaladala(passenger.getDaladala());
        passengerRepo.save(updatedPassenger);
        return "updated";

    }
    @GetMapping("/list")
    public List<Passenger> getPassenger(){return passengerRepo.findAll();}

}