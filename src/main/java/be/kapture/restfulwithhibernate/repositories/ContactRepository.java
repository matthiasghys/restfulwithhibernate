package be.kapture.restfulwithhibernate.repositories;

import be.kapture.restfulwithhibernate.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
