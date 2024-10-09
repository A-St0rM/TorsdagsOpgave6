package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(4,4);
        Room room2 = new Room(2,4);
        Room room3 = new Room(1,2);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building apartment = new Building(rooms,3);

        int totalLamps = countLampsInBuilding(apartment);
        System.out.println(totalLamps);
        int totalWindows = countWindowsInBuilding(apartment);
        System.out.println(totalWindows);

        int totalRooms = countRoomsInBuilding(apartment);
        System.out.println(totalRooms);

        boolean isNormal = isNormal(apartment);
        System.out.println(isNormal);
    }

    public static int countLampsInBuilding(Building building){
        int totalLamps = 0;
        for(Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building building){
        int totalWindows = 0;
        for(Room room : building.getRooms()){
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building building){
       return building.getRooms().size();
    }

    public static boolean isNormal(Building building){
        if(building.getNumberOfFloor() >= building.getRooms().size()){

            return true;

        }
        return false;
    }
}
