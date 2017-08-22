package me.yling.herokutest0822;

import me.yling.herokutest0822.models.FizzBuzz;
import org.springframework.data.repository.CrudRepository;

public interface FizzBuzzRepository extends CrudRepository<FizzBuzz,Long> {
}
