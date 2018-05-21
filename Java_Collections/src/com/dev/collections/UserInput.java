package com.dev.collections;

public class UserInput  {

    public static class TextInput {

        StringBuilder sb = new StringBuilder();
        public void add(char ch){

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){

            } else{

               sb.append(ch);
            }

        }

        public String getvalue(){
            return sb.toString();
        }
    }

    public static class NumericInput extends TextInput {

    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();


        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getvalue());
    }
}