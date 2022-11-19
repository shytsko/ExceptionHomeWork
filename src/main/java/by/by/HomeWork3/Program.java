//Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном
// порядке, разделенные пробелом:Фамилия Имя Отчество датарождения номертелефона пол
//Форматы данных:
//  фамилия, имя, отчество - строки
//  дата_рождения - строка формата dd.mm.yyyy
//  номер_телефона - целое беззнаковое число без форматирования
//  пол - символ латиницей f или m.
//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
//вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных,
//чем требуется.
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
//Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
//Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
//пользователю выведено сообщение с информацией, что именно неверно.
//Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну
//строку должны записаться полученные данные, вида
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//Не забудьте закрыть соединение с файлом.
//При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
//**** Пожалуйста, сдавайте ДЗ в виде pull request


package by.by.HomeWork3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Program {

    public static void main(String[] args) {
//        String testData = "Иванович Иванов 01.01.1980 m Иван 12345678";
        String testData = "28.02.1999 Эльвира Учеткина Бронеславовна f 653432";
        int expectedCount = 6;
        int itemsCount = Checker.CheckData(testData, expectedCount);

        if(itemsCount==0) {
            try {
                Contact contact = Parser.ContactParse(testData);
                System.out.println(contact);
                Path file = Paths.get(contact.getLastName()+".contact");
                String fileName = contact.getLastName()+".contact";
                try {
                    Files.write(Paths.get(contact.getLastName()+".contact"),
                            (contact.toString()+'\n').getBytes(StandardCharsets.UTF_8),
                            StandardOpenOption.APPEND, StandardOpenOption.CREATE);
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл!");
                    e.printStackTrace();
                }
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
        else
            System.out.println(String.format("Введено %s данных, чем требуется!", itemsCount>0?"больше":"меньше"));
    }

}
