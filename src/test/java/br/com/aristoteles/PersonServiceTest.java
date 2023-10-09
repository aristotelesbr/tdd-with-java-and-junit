package br.com.aristoteles;

import br.com.aristoteles.service.IPersonService;
import br.com.aristoteles.service.PersonService;
import br.com.aristoteles.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {
  Person person;

  @BeforeEach
  void setup() {
    person = new Person(
      "Aristóteles",
      "Costa",
      "aristotelesbr@gmail.com",
      "Wembley - UK"
    );
  }

  @DisplayName("When create a person with null email should throw IllegalArgumentException")
  @Test
  void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentException() {
    // Arrange
    IPersonService service = new PersonService();

    // Act
    person.setEmail(null);

    // Assert
    assertThrows(IllegalArgumentException.class,
      () -> service.createPerson(person),
      () -> "The createPerson() should have thrown IllegalArgumentException."
    );
    assertEquals("Email is required!", assertThrows(IllegalArgumentException.class,
      () -> service.createPerson(person),
      () -> "The createPerson() should have thrown IllegalArgumentException."
    ).getMessage(),
      () -> "The createPerson() should have thrown IllegalArgumentException with the message: Email is required!");
  }

  @DisplayName("When create a person with success, then return a valid person")
  @Test
  void testCreatePerson_WhenSuccess_ShouldReturnValidPerson() {
    // Arrange
    IPersonService service = new PersonService();

    // Act
    Person anyPerson = service.createPerson(person);

    // Assert
    assertEquals(Person.class, anyPerson.getClass(), () -> "The createPerson() should have returned a person.");
    assertEquals(person.getEmail(), anyPerson.getEmail(), () -> "The createPerson() should have returned a person with the same email.");
    assertEquals(person.getAddress(), anyPerson.getAddress(), () -> "The createPerson() should have returned a person with the same address.");
  }

  @DisplayName("When create a person with success, then return a person")
  @Test
  void testCreatePerson_WhenSuccess_ShouldReturnPersonObject() {
    // Arrange
    IPersonService service = new PersonService();

    // Act
    Person anyPerson = service.createPerson(person);

    // Assert
    assertNotNull(anyPerson, () -> "The createPerson() should not have returned null.");
  }

  @DisplayName("When create a person with success, should contains a firstName.")
  @Test
  void testCreatePerson_WhenSuccess_ShouldContainsFirstName() {
    // Arrange
    IPersonService service = new PersonService();

    // Act
    Person anyPerson = service.createPerson(person);

    // Assert
    assertEquals(person.getFirstName(), anyPerson.getFirstName(), () -> "The createPerson() should have returned a person with the same firstName.");
  }

  @DisplayName("When create a person with success, should contains id.")
  @Test
  void testCreatePerson_WhenSuccess_ShouldContainsId() {
    // Arrange
    IPersonService service = new PersonService();

    // Act
    Person anyPerson = service.createPerson(person);

    // Assert
    assertNotNull(anyPerson.getId(), () -> "The createPerson() should have returned a person with the same id.");
    assertEquals(person.getId(), anyPerson.getId(), () -> "The createPerson() should have returned a person with the same id.");
  }
}
