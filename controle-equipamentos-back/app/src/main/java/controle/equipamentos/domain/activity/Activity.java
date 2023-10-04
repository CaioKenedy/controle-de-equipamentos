package controle.equipamentos.domain.activity;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

import controle.equipamentos.domain.activity.type.Type;
import controle.equipamentos.utils.InstantUtils;

public class Activity {

  private String id;
  private Instant date;
  private String description;
  private float value;
  private Type type;
  private Instant createdAt;
  private Instant updatedAt;

  private Activity(final String anID, final Instant aDate, final String aDescription, final float aValue,
      final Type aType, final Instant aCreatedAt, final Instant updatedAt) {
    this.id = anID;
    this.date = aDate;
    this.description = aDescription;
    this.value = aValue;
    this.type = aType;
    this.createdAt = aCreatedAt;

  }

  public static Activity newActivity(final Instant aDate, final String aDescription, final float aValue,
      final Type aType) {
    return new Activity(
        UUID.randomUUID().toString().toLowerCase(),
        aDate,
        aDescription,
        aValue,
        aType,
        InstantUtils.now(),
        InstantUtils.now());

  }

  public static Activity with(final String anId, final Instant aDate, final String aDescription, final float aValue,
      final Type aType, final Instant aCreatedAt, final Instant anUpdatedAt) {
    return new Activity(anId, aDate, aDescription, aValue, aType, aCreatedAt, anUpdatedAt);
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

  public Type getType() {
    return type;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public String toString() {
    return "Activity [id=" + id + ", date=" + date + ", description=" + description + ", value=" + value + ", type="
        + type + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }
}
