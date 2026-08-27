import java.util.Scanner;

public class Dimensions{
    public static void main(String[] args) {
    for(int a = 1; a <= 60; a++){
        for(int b = a; b <= 60; b++){
            for(int c = b; c<= 60; c++){
                if( a * a + b * b == c * c 
                    && a < b && 
                    b < c && 
                    a + b + c >= 60 && 
                    a + b + c <= 100 ) {
                    System.out.println(a + "^2 +" + b + "^2 " + " = " + c + "^2 ");
  }
      }
   }
}
}
}

// ; //Задача 4. «Резонанс трёх частот» 
// ; Частоты a, b, c находятся от 1 до 60, причём a < b < c. 
// ; Найдите все тройки, где a²+b²=c² и периметр находится от 60 до 100. 
// ; Затем выведите только те тройки, где c-a — простое число. Проверку простоты выполните внутренним циклом без массивов.
