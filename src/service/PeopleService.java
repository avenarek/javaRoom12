package service;

import model.People;

import java.util.Scanner;

public class PeopleService {

            public People create(){
                Scanner s= new Scanner(System.in);
                System.out.println("Enter Full_name");
                String name=s.next();
                System.out.println("enter number");
                int number= s.nextInt();

                People people= new People();
                people.setFullName(name);
                people.setNumber(number);

                return people;
            }

            public int count1(People [] peoples){
                int count1=0;


                for (int i = 0; i < peoples.length; i++) {
                    if (peoples[i].getNumber()==1){
                        count1++;
                    }
                }
                return count1;

            }

            public int count2(People [] peoples){
                int count2=0;


                for (int i = 0; i < peoples.length; i++) {
                    if (peoples[i].getNumber()==2){
                        count2++;
                    }
                }
                return count2;

            }

        }

