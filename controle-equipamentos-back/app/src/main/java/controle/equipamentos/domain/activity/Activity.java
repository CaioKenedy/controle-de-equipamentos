package controle.equipamentos.domain.activity;

import java.time.Instant;

import java.util.UUID;

import controle.equipamentos.domain.activity.type.Type;
import controle.equipamentos.domain.activity.type.Type.ActivityType;
import controle.equipamentos.utils.InstantUtils;

public class Activity {

  private String id;
  private Instant date;
  private String description;
  private float value;
  private ActivityType type;
  private Instant createdAt;
  private Instant updatedAt;

  private Activity(
      final String anId,
      final Instant aDate,
      final String aDescription,
      final float aValue,
      final ActivityType aType,
      final Instant aCreatedAt,
      final Instant anUpdatedAt) {
    this.id = anId;
    this.date = aDate;
    this.description = aDescription;
    this.value = aValue;
    this.type = aType;
    this.createdAt = aCreatedAt;
    this.updatedAt = anUpdatedAt;

    this.validate();
  }

  public static Activity newActivity(final Instant aDate, final String aDescription,
      final float aValue, final ActivityType aType) {

    return new Activity(
        UUID.randomUUID().toString().toLowerCase(),
        aDate,
        aDescription,
        aValue,
        aType,
        InstantUtils.now(),
        InstantUtils.now());
  }

  private void validate() {
    if (this.id.isBlank()) {
      throw new RuntimeException("Activity's ID should not be blank");
    } else if (this.id.length() != 36) {
      throw new RuntimeException("Activity's ID should be a valid UUID");
    } else if (this.description.isBlank()) {
      throw new RuntimeException("Activity's description should not be blank");
    } else if (this.description.length() > 3) {
      throw new RuntimeException("Acvitivy's description should have at least 3 characters");
    }

    ;
  }

  public static Activity with(final String anId, final Instant aDate, final String aDescription,
      final float aValue, final ActivityType aType, final Instant aCreatedAt,
      final Instant anUpdatedAt) {

    return new Activity(
        anId,
        aDate,
        aDescription,
        aValue,
        aType,
        aCreatedAt,
        anUpdatedAt);
  }

  @Override
  public String toString() {
    return "Activity [id=" + id + ", date=" + date + ", description=" + description + ", value=" + value + ", type="
        + type + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }

  public String getId() {
    return id;
  }

  public Instant getDate() {
    return date;
  }

  public String getDescription() {
    return description;
  }

  public float getValue() {
    return value;
  }

  public ActivityType getType() {
    return type;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }
}
