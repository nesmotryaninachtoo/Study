/*Вам дан список ролей и сценарий пьесы в виде массива строчек.
Каждая строчка сценария пьесы дана в следующем виде:
Роль: текст
Текст может содержать любые символы.
Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
Роль:
i) текст
j) текст2
...
==перевод строки==
i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.

Обратите внимание еще на несколько нюансов:
    1)имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
    2)название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
    3)роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
    4)в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
    5)будьте внимательны, не добавляйте лишних пробелов в конце строк. */

private static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder finalString = new StringBuilder();
    int count = 0;
    for (int i = 0; i < roles.length; i++) {
        String role = roles[i];
        finalString.append(role).append(":\n");
        count = 0;
        for (int j = 0; j < textLines.length; j++) {
            count++;
            if (textLines[j].startsWith(role + ":")) {
                finalString.append(count).append(") ");
                finalString.append(textLines[j].substring(role.length() + 2)).append("\n");
            }
        }
        if (i != roles.length - 1) {
            finalString.append("\n");
        }
    }
    return finalString.toString().trim();
}
