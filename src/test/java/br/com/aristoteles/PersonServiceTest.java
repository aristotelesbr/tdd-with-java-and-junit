package br.com.aristoteles;

import br.com.aristoteles.service.IPersonService;
import br.com.aristoteles.service.PersonService;
import br.com.aristoteles.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonServiceTest {
  @DisplayName("When create a person with success, then return a person")
  @Test
  void testCreatePerson_WhenSuccess_ShouldReturnPersonObject() {
    // Arrange
    IPersonService service = new PersonService();

    Person person = new Person(
      "Aristóteles",
      "Costa",
      "aristotelesbr@gmail.com",
      "Wembley - UK"
    );

    // Act
    Person anyPerson = service.createPerson(person);

    // Assert
    assertNotNull(anyPerson, () -> "The createPerson() should not have returned null.");
  }
}
