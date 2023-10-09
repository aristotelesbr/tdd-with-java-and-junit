package br.com.aristoteles.service;

import br.com.aristoteles.model.Person;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {
  @Override
  public Person createPerson(Person person) {
    if (person.getEmail() == null || person.getEmail().isBlank()) {
      throw new IllegalArgumentException("Email is required!");
    }

    var id = new AtomicLong().incrementAndGet();
    person.setId(id);

    System.out.println("Person created!");
    return person;
  }
}
