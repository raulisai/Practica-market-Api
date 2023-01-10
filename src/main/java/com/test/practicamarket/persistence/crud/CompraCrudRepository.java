package com.test.practicamarket.persistence.crud;

import com.test.practicamarket.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {

}
