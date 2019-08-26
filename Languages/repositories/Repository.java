package repositories;

import org.springframework.data.repository.CrudRepository;

import models.Language;

public interface Repository extends CrudRepository<Language, Long> {

}