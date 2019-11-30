package Math;

public class Math {
    public static Integer convertToInteger(String value){
        Integer result = Integer.parseInt(value);
        // TODO у вас в сигнатуре метода указано, что он должен возвращать значение Integer для этого нужно использовать ключевое слово return
        // TODO ничего не возвращать мы можем только если у нас void метод
        return result;
    }
    public static String compareInteger(Integer value1, Integer value2){
        // TODO у вас в сигнатуре метода указано, что он должен возвращать значение String для этого нужно использовать ключевое слово return
        // TODO чтобы сравнить 2 значения с помощью метода compareTo(), нужно вызвать этот метод у первого значения, а в качестве параметра
        // TODO передать второе значение. В случае если первое значение больше второго, то result будет = 1, если второе больше первого
        // TODO то result будет = -1. Если они будут равны result будет = 0. Далее в зависимисоти от result мы делаем нужный текст (String)
        int result = value1.compareTo(value2);
        if (result == -1) {
            return "Первое число меньше второго";
        } else if (result == 0) {
            return "Первое число равно второму";
        } else {
            return "Первое число больше второго";
        }
        //compareInteger()compareTo(value1>value2)
    }

    public static void main(String[] args) {
        //TODO проверяем работу метода
        // Рекомендую запустить дебаг режим и шаг за шагом понаблюдать как работает метод compareInteger()
        Integer x1 = 100;
        Integer x2 = 200;
        System.out.println(x1 + " : " + x2 + " - " + compareInteger(x1, x2));
        Integer y1 = 10;
        Integer y2 = 5;
        System.out.println(y1 + " : " + y2 + " - " + compareInteger(y1, y2));
        Integer z1 = 3;
        Integer z2 = 3;
        System.out.println(z1 + " : " + z2 + " - " + compareInteger(z1, z2));
    }
}
