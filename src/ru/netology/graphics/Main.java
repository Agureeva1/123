package ru.netology.graphics;

import ru.netology.graphics.image.BadImageSizeException;
import ru.netology.graphics.image.ColorSchema;
import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;



public class Main {

    public static void main(String[] args) throws Exception {
        TextGraphicsConverter Converter = new TextGraphicsConverter() {
            TextColorSchema ConverterSchema = null;
            @Override
            public String convert(String url) throws IOException, BadImageSizeException {
                return null;
            }

            @Override
            public void setMaxWidth(int width) {

            }

            @Override
            public void setMaxHeight(int height) {

            }

            @Override
            public void setMaxRatio(double maxRatio) {

            }
            @Override
            public void setTextColorSchema(TextColorSchema schema) {
                this.ConverterSchema=schema;
            }
            };

        //TextGraphicsConverter converter = null; // Создайте тут объект вашего класса конвертера


         TextColorSchema DefSchema = new TextColorSchema() {
         char[] ColorSymbol = {'#','$','@','%','*','+','-','\''};
         @Override
         public char convert(int color) {
         return this.ColorSymbol[(color+1)/32];
         }
         };


        //System.out.println(DefSchema.convert(34));
        TextColorSchema SecSchema = new TextColorSchema() {
            char[] ColorSymbol = {'f','g','h','j','k','l',';','\''};
            @Override
            public char convert(int color) {
                System.out.println("Hello");
                return this.ColorSymbol[(color+1)/32];
            }
        };
        //setTextColorSchema(SecSchema);
        //System.out.println(DefSchema.convert(34));
        //setTextColorSchema(first);
        System.out.println(SecSchema.convert(34));
        System.out.println(DefSchema.convert(34));

       // GServer server = new GServer(converter); // Создаём объект сервера
     //   server.start(); // Запускаем

        // Или то же, но с выводом на экран:
        //String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //String imgTxt = converter.convert(url);
        //System.out.println(imgTxt);
        }
    }

