package controle.equipamentos.domain.activity.type;

public class Type {

  public enum ActivityType {
    ENTRADA("entrada"),
    SAÍDA("saida");

    private String value;

    ActivityType(final String aValue) {
      this.value = aValue;
    }

    public String getValue() {
      return this.value;
    }

  }
}
