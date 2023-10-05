package controle.equipamentos.domain.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import controle.equipamentos.domain.activity.type.Type.ActivityType;
import controle.equipamentos.utils.InstantUtils;

public class ActivityTest {

  @Test
  public void givenValidParams_whenBuildingNewActivity_thenReturnNewValidActivity() {

    final var aDescription = "A description";
    final var aValue = 3.55f;
    final var aDate = InstantUtils.now();
    final var aType = ActivityType.ENTRADA;

    final var anActivity = Activity.newActivity(aDate, aDescription, aValue, aType);

    assertNotNull(anActivity);
    assertNotNull(anActivity.getId());
    assertTrue(anActivity.getId().length() == 36);
    assertEquals(aDescription, anActivity.getDescription());
    assertEquals(aDate, anActivity.getDate());
    assertEquals(aValue, anActivity.getValue(), 0.001);
    assertEquals(aType, anActivity.getType());
    assertNotNull(anActivity.getCreatedAt());
    assertNotNull(anActivity.getUpdatedAt());

  }
}
