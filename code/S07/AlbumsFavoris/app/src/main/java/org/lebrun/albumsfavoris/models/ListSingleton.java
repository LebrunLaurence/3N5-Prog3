package org.lebrun.albumsfavoris.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSingleton {
    private static ListSingleton instance;
    private List<String> nameList = new ArrayList<String>();

    private List<String> randomName = new ArrayList<String>();

    private ListSingleton(){

    }

    public static synchronized ListSingleton getInstance(){
        if (instance == null){
            instance = new ListSingleton();
        }

        return instance;
    }

    public List<String> getNameList(){
        return nameList;
    }

    public List<String> getRandomName(){
        return randomName;
    }

    public void Randomize(){
        Collections.shuffle(randomName);
    }

    public void Up(String item){
        if(nameList.contains(item)){
            int id = nameList.indexOf(item);

            if(id != 0){
                String one = nameList.get(id);
                String two = nameList.get(id - 1);

                nameList.set(id -1,one);
                nameList.set(id,two);
            }
        }

    }

    public void Down(String item){
        if(nameList.contains(item)){
            int id = nameList.indexOf(item);

            if(id != nameList.stream().count() - 1){
                String one = nameList.get(id);
                String two = nameList.get(id + 1);

                nameList.set(id + 1,one);
                nameList.set(id,two);
            }
        }

    }

    public boolean IsSame(){
        for(int i = 0;i < nameList.stream().count();i++){
            if(nameList.get(i) != randomName.get(i)){
                return false;
            }
        }
        return true;
    }
}
