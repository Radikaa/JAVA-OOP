package telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String call() {
        return null;
    }
/*
    @Override
    public String call() {
        char[] inputArr = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char symbol : inputArr) {
            if (Character.isDigit(symbol)) {
                sb.append(symbol);
            } else {
                sb.append("Invalid number!");
                sb.append(System.lineSeparator());
            }
        }
        if (!sb.equals("Invalid number!")) {
            sb.delete(0, sb.length() - 1);
            sb.append(String.format("Calling... %s%n", number));
        }
        return sb.toString();
    }*/


    @Override
    public String browse() {
        //NO DIGITS
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (hasDigits(url)) {
                sb.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sb.append(String.format("Browsing: %s!%n", url));
            }
        }
        return sb.toString().trim();
    }

    private boolean hasDigits(String url) {
        for (char singleChar : url.toCharArray()) {
            if (Character.isDigit(singleChar)) {
                return true;
            }
        }
        return false;
    }
}