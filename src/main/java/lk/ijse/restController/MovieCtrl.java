package lk.ijse.restController;


import lk.ijse.dto.MoviesDTO;
import lk.ijse.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieCtrl {

    @Autowired
    private MovieService movieService;

    @GetMapping("/all")
    public List<MoviesDTO>getAllCustomer(){
        return movieService.getAllMovie();
    }
}
