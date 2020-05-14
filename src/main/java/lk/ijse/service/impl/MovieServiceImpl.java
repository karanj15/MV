package lk.ijse.service.impl;

import lk.ijse.dto.MoviesDTO;
import lk.ijse.entity.Customer;
import lk.ijse.entity.Movies;
import lk.ijse.repository.MovieRepo;
import lk.ijse.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public List<MoviesDTO> getAllMovie() {
        List<Movies>allMovie=movieRepo.findAll();
        List<MoviesDTO>list=new ArrayList<>();
        for (Movies mo:allMovie){
            list.add(new MoviesDTO(mo.getMid(),mo.getDirector(),mo.getM_name(),mo.getRelese_date(),mo.getShow_time()));
        }
        return list;
    }
}
