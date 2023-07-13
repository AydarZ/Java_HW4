package HW5;

import java.util.*;

public class hw5 {
    public static void main(String[] args) {
        Map<Integer, String> telBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            List<String> commandList = new ArrayList<>();
            commandList = List.of(command.split(" "));

            if ("ADD".equals(commandList.get(0))) {
                telBook.put(Integer.valueOf(commandList.get(2)), commandList.get(1));
            }

            if ("GET".equals(commandList.get(0))) {
                if (telBook != null) {
                    if (telBook.containsValue(commandList.get(1))) {
                        List<Integer> localList = new ArrayList<>();
                        for (Integer k : telBook.keySet()) {
                            if (telBook.get(k).equals(commandList.get(1))) {
                                localList.add(k);
                            }
                        }
                        System.out.println(localList);
                    } else System.out.println("Запись не найдена");
                } else System.out.println("Справочник пуст");
            }

            if ("REMOVE".equals(commandList.get(0))) {
                if (telBook != null) {
                    if (telBook.containsValue(commandList.get(1))) {
                        List<Integer> localList = new ArrayList<>();
                        for (Integer k : telBook.keySet()) {
                            if (telBook.get(k).equals(commandList.get(1))) {
                                telBook.remove(k);
                            }
                        }
                        System.out.println("Записи удалены");
                    } else System.out.println("Запись не найдена");
                } else System.out.println("Справочник пуст");
            }

            if ("LIST".equals(commandList.get(0))) {
                if (telBook != null) {
                    List<String> values = new ArrayList<>();
                    for (String value : telBook.values()) {
                        if (!values.contains(value)) {
                            values.add(value);
                        }
                    }

                    for (String familiya : values) {
                        List<Integer> keys = new ArrayList<>();
                        for (Integer k : telBook.keySet()) {
                            if (telBook.get(k).equals(familiya)) {
                                keys.add(k);
                            }
                        }
                        System.out.print(familiya + "=" + keys + ", ");

                        keys.clear();
                    }
                    System.out.println();
                } else System.out.println("Справочник пуст");
            }

            if ("EXIT".equals(commandList.get(0))) break;

        }
    }
}
