import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        ArrayProcess array1 = new ArrayProcess(3); //в массиве 3 столбца
        array1.transformArray();
        array1.outputArray();
        array1.deleteZeros();
        array1.outputArray();
        array1.createSortedVector();
        array1.randomise();
        array1.outputArray();

        ArrayProcess array2 = new ArrayProcess(); //по умолчанию
        array2.outputArray();

        ArrayProcess array3 = new ArrayProcess(array2);//клон array2
        array3.randomise();
        array3.outputArray();

        array2.outputArray();// проверяю, изменился ли array2

        SentenceProcess sentence1 = new SentenceProcess("Я люблю спать");
        sentence1.findingAmountOfWords();

        SentenceProcess sentence2 = new SentenceProcess();// по умолчанию
        sentence2.findingAmountOfWords();

    }
}

