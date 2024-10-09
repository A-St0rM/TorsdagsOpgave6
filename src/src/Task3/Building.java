package Task3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms;
    private int numberOfFloor;


    public Building(ArrayList<Room> rooms, int numberOfFloor) {
        this.rooms = rooms;
        this.numberOfFloor = numberOfFloor;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms){
        this.rooms = rooms;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}