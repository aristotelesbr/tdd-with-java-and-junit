package br.com.aristoteles.service;

import br.com.aristoteles.model.Person;

public class PersonService implements IPersonService {
  @Override
  public Person createPerson(Person person) {
    System.out.println("Person created!");
    return person;
  }
}
