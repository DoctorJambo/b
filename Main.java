public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");

    System.out.println(result(4));

    String[] plans = {"have brackfest", "go to the university", "go back home"};

    StringBuilder builder = new StringBuilder();
    builder.append("List: ");

    for (int i = 0; i < plans.length; i++) {
      builder.append("\n").append(i + 1 + ") ").append(plans[i]);
    }

    System.out.println(builder);
  }

  public static int result(int value) {
    value = value / 2;
    return value;
  }
}