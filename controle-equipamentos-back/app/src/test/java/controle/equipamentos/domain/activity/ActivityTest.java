package controle.equipamentos.domain.activity;

import controle.equipamentos.domain.activity.type.Type.ActivityType;
import controle.equipamentos.utils.InstantUtils;

public class ActivityTest {

  public void givenValidParams_whenBuildingNewActivity_thenReturnNewValidActivity() {

    final var aDescription = "A description";
    final var aValue = 3.55f;
    final var aDate = InstantUtils.now();
    final var aType = ActivityType.ENTRADA;

    final var anActivity = Activity.newActivity(null, null, 0, null);

  }
}
