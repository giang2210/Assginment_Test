package com.example.demo.api;

import com.example.demo.entity.Street;
import com.example.demo.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/streets")
public class StreetApi {
    @Autowired
    StreetService streetService;

    @RequestMapping(method = RequestMethod.GET)
    public Page<Street> getList(@RequestParam(defaultValue = "1") int page,
                                @RequestParam(defaultValue = "1") int limit) {
        return streetService.findAll(page, limit);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/search")
    public List<Street> search(String name, Integer district) {
        return streetService.findByStreetAnDistrict(name, district);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Street save(@RequestBody Street street) {
        streetService.save(street);
        return street;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Street getDetail(@PathVariable int id) {
        return streetService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public boolean delete(@PathVariable int id) {
        streetService.deleteById(id);
        return true;
    }

    //@RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    //public Street update(@PathVariable int id, @RequestBody Street updateStreet) {
      //  Street existing = streetService.findById(id).get();
        //existing.setName(updateStreet.getName());
        //existing.setDistrict(updateStreet.getDistrict());
        //existing.setDescription(updateStreet.getDescription());
        //existing.setStatus(updateStreet.getStatus());
        //streetService.save(existing);
       // return updateStreet;
   // }
}
