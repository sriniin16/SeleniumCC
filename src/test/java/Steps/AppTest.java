package Steps;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("This is a test method");
    }

//    @Test
////    public void PalindromeTest()
////    {
////        System.out.println("This is my test method");
////        String s1="madam";
////        StringBuilder s2= new StringBuilder();
////        char[] original= s1.toCharArray();
////        for (int i=s1.length()-1;i>=0;i--)
////        {
////            char reverse= original[i];
////            System.out.println(reverse);
////            s2.append(reverse);
////        }
////        if (s1.equals(s2.toString()))
////        {
////            System.out.println("its a P");
////        }
////        else
////        {
////            System.out.println("Its not a P");
////        }
////    }

//    @Test
//    public void AnagramsTest()
//    {
//        String str1="12345";
//        String str2="iseltn";
//        sort(str1);
//
//    }

    @Test
    public void countOccurences()
    {

    }
    @Test
    public void sortString()
    {
        String str = "zxcah";
        char[] inputarray = str.toCharArray();
        char temp;
        String sorted="";
        for (int i=0; i<inputarray.length;i++)
        {
            for (int j=0; j<inputarray.length;j++)
            {
                if (inputarray[i]<inputarray[j])
                {
                    temp=inputarray[i];
                    inputarray[i]=inputarray[j];
                    inputarray[j]=temp;
                }
            }
        }
        for (int k=0; k<inputarray.length;k++)
        {
            sorted=sorted+inputarray[k];
        }
        System.out.println("sorted is: "+sorted);
    }

    @Test
    public void sortInt()
    {
       int[] array = {4,9,1,3};
       int temp;
       int[] sorted;

        for (int i=0; i<array.length;i++)
        {
            for (int j=0; j<array.length;j++)
            {
                if (array[i]<array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int k=0; k<array.length;k++)
        {
            System.out.println(array[k]);
        }

    }

    @Test
    public void getstrreg()
    {
        String str = "Prime Minister Narendra Modi will address the nation tomorrow at 10 am on the coronavirus lockdown, after requests from states to extend it. The Prime Minister is widely expected to announce an extension of the lockdown till April 30, but with measures to restart the economy.During his meeting with 13 Chief Ministers on Saturday, PM Modi had agreed that a longer lockdown was necessary to fight the highly contagious COVID-19, which has infected over 9,000 in India, but had talked about saving livelihoods as well as lives.There are concerns that India's economy, which was already growing at its slowest pace in six years, will take a severe hit amid the lockdown, with unemployment rising to record levels. The restrictions have put millions of poor people out of work and hit small shops and industries hard.There is a proposal to mark districts as red, orange and green based on the intensity of the Covid 19 infection.Officials say around 400 districts, which are largely unaffected, can be in the green zone where agriculture, construction and manufacturing activities can begin while keeping social distancing in mind.\n" +
                "The suggestion is to continue a complete lockdown or partial restrictions in the districts affected by coronavirus.PM Modi indicated in the four hour meeting that while saving lives is priority, the economy also needs to restart. \"Jaan bhi, jahaan bhi (both life and economy are important),\" he told the Chief Ministers, compared to what he had said three weeks ago while announcing the total nationwide lockdown ";
        ArrayList<String>  array = new ArrayList<String>();
        HashMap<Integer,Integer> mapIndex = new HashMap<Integer,Integer>();
        Pattern pattern = Pattern.compile("(Modi)");
        Matcher match = pattern.matcher(str);
        while (match.find())
        {
            array.add(match.group(1));
            mapIndex.put(match.start(),match.end());
        }
        System.out.println(array);
        for ( int key : mapIndex.keySet())
        {
            System.out.println("start:" + key +","+ "end:" +mapIndex.get(key));
        }
    }

    @Test
    public void getAllCharTypes()
    {
        String str = "1Prime Minister Narendra Modi will address the nation tomorrow at 10 am on the coronavirus lockdown, after requests from states to extend it. The Prime Minister is widely expected to announce an extension of the lockdown till April 30, but with measures to restart the economy.During his meeting with 13 Chief Ministers on Saturday, PM Modi had agreed that a longer lockdown was necessary to fight the highly contagious COVID-19, which has infected over 9,000 in India, but had talked about saving livelihoods as well as lives.There are concerns that India's economy, which was already growing at its slowest pace in six years, will take a severe hit amid the lockdown, with unemployment rising to record levels. The restrictions have put millions of poor people out of work and hit small shops and industries hard.There is a proposal to mark districts as red, orange and green based on the intensity of the Covid 19 infection.Officials say around 400 districts, which are largely unaffected, can be in the green zone where agriculture, construction and manufacturing activities can begin while keeping social distancing in mind.\n" +
                "The suggestion is to continue a complete lockdown or partial restrictions in the districts affected by coronavirus.PM Modi indicated in the four hour meeting that while saving lives is priority, the economy also needs to restart. \"Jaan bhi, jahaan bhi (both life and economy are important),\" he told the Chief Ministers, compared to what he had said three weeks ago while announcing the total nationwide lockdown ";
        char[] array = str.toCharArray();
        System.out.println(array);
        int len = array.length;
        System.out.println("Array Length"+len);
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0; i<len; i++)
        {
            if (Character.isUpperCase(array[i]))
            {
                System.out.println(array[i] + ":\tUppercase");
            } else if (Character.isLowerCase(array[i]))
            {
                System.out.println(array[i] + ":\tLowercase");
            }else if (Character.isDigit(array[i]))
            {
                System.out.println(array[i] + ":\tDigit");
            } else if (Character.isWhitespace(array[i]))
            {
                System.out.println("Whitespace found");
            } else System.out.println("Invalid");
        }
    }

    @Test
    public void pullAllWordsToArray()
    {
        String str = "Prime Minister Narendra Modi will address the nation tomorrow at 10 am on the coronavirus lockdown, after requests from states to extend it. The Prime Minister is widely expected to announce an extension of the lockdown till April 30, but with measures to restart the economy.During his meeting with 13 Chief Ministers on Saturday, PM Modi had agreed that a longer lockdown was necessary to fight the highly contagious COVID-19, which has infected over 9,000 in India, but had talked about saving livelihoods as well as lives.There are concerns that India's economy, which was already growing at its slowest pace in six years, will take a severe hit amid the lockdown, with unemployment rising to record levels. The restrictions have put millions of poor people out of work and hit small shops and industries hard.There is a proposal to mark districts as red, orange and green based on the intensity of the Covid 19 infection.Officials say around 400 districts, which are largely unaffected, can be in the green zone where agriculture, construction and manufacturing activities can begin while keeping social distancing in mind.\n" +
                "The suggestion is to continue a complete lockdown or partial restrictions in the districts affected by coronavirus.PM Modi indicated in the four hour meeting that while saving lives is priority, the economy also needs to restart. \"Jaan bhi, jahaan bhi (both life and economy are important),\" he told the Chief Ministers, compared to what he had said three weeks ago while announcing the total nationwide lockdown ";
//        String str = "Hello World is here";
        String[] strArray = str.split(" ");
        for (int i=0; i<strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }
    }

    @Test
    public void sortAllStrings()
    {

    }



}
