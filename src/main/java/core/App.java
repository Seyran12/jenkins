package core;


public class App {
    public static void main(String[] args){
        System.out.println("Debit Card and Bad Credit is an anagram? -"+Anagram.validate("Debit Card","Bad Credit"));
        System.out.println("Schoolmaster and The classroom is an anagram?-"+ Anagram.validate("Schoolmaster","The classroom"));
        System.out.println("The Hurricanes and These churn air is an anagram?-" +Anagram.validate("The Hurricanes", "These churn air"));
        System.out.println("Astronomers and No more stars is an anagram?-"+ Anagram.validate("Astronomers", "No more stars"));
       //System.out.println("Oxrenet and Ne Xrena Sebe is an anagram?-" + Anagram.validate("Oxrenet", "Ne Xrena Sebe"));
    }
}
