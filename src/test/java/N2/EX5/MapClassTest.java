package N2.EX5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapClassTest {

    MapClass mapClass = new MapClass();

    @Test
    void shouldContainKeyAdded() {
        mapClass.newMap.put(3,"String");
        assertThat(mapClass.newMap).containsKey(3);
    }

}