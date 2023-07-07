package PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.controller;

import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.model.Station;
import PUBLIC_TRANSPORT.PUBLIC_TRANSPORT.repository.StationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Station")
public class StationController {
    @Autowired
    private StationRepo stationRepo ;
    @DeleteMapping(value = "/delete/{Sid}")
    public String deleteStation(@PathVariable Long Sid){
        Station deleteStation=stationRepo.findById(Sid).get();
        stationRepo.delete(deleteStation);
        return "deleted";
    }


    @GetMapping("/getbyId/{Sid}")
    public Optional<Station> getStation(@PathVariable Long Sid) { return stationRepo.findById(Sid);}

    @PostMapping("/save")
    public  Station createStation(@RequestBody Station station){ return stationRepo.save(station);}

    @PutMapping("/update/{Sid}")
    public String updateStation(@PathVariable Long Sid,@RequestBody Station station){
        Station updatedStation=stationRepo.findById(Sid).get();
        updatedStation.setLocation(station.getLocation());
        updatedStation.setName(station.getName());
        updatedStation.setRoadname(station.getRoadname());
        stationRepo.save(updatedStation);
        return "updated";

    }



    @GetMapping("/list")
    public List<Station>getStation(){return stationRepo.findAll();}

}
