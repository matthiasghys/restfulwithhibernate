package be.kapture.restfulwithhibernate.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class ContactTest {

    @Test
    void contact_constructor(){
        assertThat(new Contact());
        assertThat(new Contact(0, "Matthias", "matthias.ghys@gmail.com", "0496736106"));
    }

}
