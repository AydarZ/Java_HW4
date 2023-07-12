package HW4;

import java.util.*;

public class hw4 {
    public static void main(String[] args) {
        /*
Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
4. Если введено exit, то программа завершается

> - ввод в консоль (stdin), < - вывод на консоль (stdout)
> java
> python
> c#
> print
< [c#, python, java]
> revert
> print
< [python, java]
> revert
> revert
> print
< []
> revert -> throw new NoSuchElementException
*/
        Stack<String> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if ("exit".equals(command)){
                break;
            }

            if ("print".equals(command)){
                for (int i = myStack.size()-1; i >= 0; i--) {
                    System.out.print(myStack.get(i) + " ");
                }
                continue;
            }

            if ("revert".equals(command)){
                myStack.pop();
                for (int i = myStack.size()-1; i >= 0; i--) {
                    System.out.print(myStack.get(i) + " ");
                }
                continue;
            }

            myStack.push(command);
        }
    }
}
