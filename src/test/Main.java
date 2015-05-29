package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        //HashMap<Integer, String> mapAdr = Cart.createMapsAdr("create");
        //HashMap<Integer, String> mapCartMod = Cart.createMapsCartMod();
        //HashMap<Integer, Integer> mapCartPlace = Cart.createMapsCartPlace();
        for(Map.Entry<Integer,Integer> pair : mapCartPlace.entrySet())
        {
        System.out.println("Картридж №: " + pair.getKey() + " Модель: " + mapCartMod.get(pair.getKey()) + " находится: " + mapAdr.get(mapCartPlace.get(pair.getKey())));
        }
        System.out.println("===");
        //System.out.println(Cart.GetPlace("c0002"));
        //System.out.println(Cart.GetModel("c0002"));
        //System.out.println(mapAdr.get("a0003"));
        //System.out.println(Cart.createMaps());

        //========================================= Поиск по модели
        //ArrayList<String> tmp = new ArrayList<String>();
        //tmp = Cart.FindModel("HP 49a");
        //if (tmp.size() != 0) {
        //    for (int i = 0; i < tmp.size(); i++) {
        //        System.out.println("Картридж №: " + tmp.get(i) + " находится: " + mapAdr.get(mapCartPlace.get(tmp.get(i))));
        //    }
        //}
        //System.out.println(getNewIndex(mapAdr));
        //Add("Adr");
        System.out.println(My.test());
    }

    //public static HashMap<String, String> createAdresa()
    //{
    //public static Map<String,String>;

        //return map;
    //}

    public static HashMap<Integer, String> mapAdr = createMapsAdr("create");
    public static HashMap<Integer, String> mapCartMod = createMapsCartMod();
    public static HashMap<Integer, Integer> mapCartPlace = createMapsCartPlace();
    public static HashMap<Integer, String> createMapsAdr(String action) {
        HashMap<Integer, String> mapAdr = new HashMap<Integer, String>();
        if (action.equals("create")) {
            mapAdr.put(1, "Med3");
            mapAdr.put(2, "Vop1");
            mapAdr.put(3, "Vop2");
            mapAdr.put(4, "Vop3");
            mapAdr.put(5, "Vop4");
            mapAdr.put(7, "Vop3");
            mapAdr.put(9, "Vop2");
        }
        return mapAdr;
    }
    public static HashMap<Integer, String> createMapsCartMod() {
        HashMap<Integer,String> mapCartMod = new HashMap<Integer, String>();
        mapCartMod.put(1, "Canon 703");
        mapCartMod.put(2, "HP 49a");
        mapCartMod.put(3, "S 4200");
        mapCartMod.put(4, "Canon E16");
        mapCartMod.put(5, "HP 36a");
        mapCartMod.put(6, "Canon 703");
        mapCartMod.put(7, "HP 49a");
        mapCartMod.put(8, "Canon 703");
        mapCartMod.put(9, "Canon E16");
        mapCartMod.put(10, "HP 36a");
        return mapCartMod;
    }
    public static HashMap<Integer, Integer> createMapsCartPlace() {
        HashMap<Integer,Integer> mapCartPlace = new HashMap<Integer, Integer>();
        mapCartPlace.put(1, 5);
        mapCartPlace.put(2, 4);
        mapCartPlace.put(3, 3);
        mapCartPlace.put(4, 2);
        mapCartPlace.put(5, 1);
        mapCartPlace.put(6, 2);
        mapCartPlace.put(7, 3);
        mapCartPlace.put(8, 1);
        mapCartPlace.put(9, 5);
        mapCartPlace.put(10, 4);
        return mapCartPlace;
    }
    public static String GetPlace(String numCart) {
        return mapAdr.get(mapCartPlace.get(numCart));
    }
    public static String GetModel(String numCart) {
        return mapCartMod.get(numCart);
    }
    public static ArrayList<Integer> FindModel(String modCart) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer,String> pair : mapCartMod.entrySet())
        {
            if (pair.getValue().equals(modCart))
            {
                list.add(pair.getKey()); }
            //System.out.println("Картридж №: " + pair.getKey() + " Модель: " + mapCartMod.get(pair.getKey()) + " находится: " + mapAdr.get(mapCartPlace.get(pair.getKey())));
        }
        return list;
    }
    public static void Add(String Obj) throws Exception {
        String z;
        if (Obj.equals("Adr")) {
            System.out.println("Enter new address:");
            System.out.println(My.RS());
        }
        else if (Obj.equals("Mod"))
        {
            System.out.println("M");
        }
        else {
            System.out.println(Obj);
        }
    }
    public static int getNewIndex(HashMap<Integer, String> hm) {
        int i1 = 1, r = 0;
        for (Map.Entry<Integer,String> pair : hm.entrySet()) {
            if (i1 != pair.getKey()) {
                r = i1;
                break;
            }
            i1++;
        }
        return r;
    }
}