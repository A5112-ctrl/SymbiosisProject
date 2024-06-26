package com.RestroManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.RestroManagement.Entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

	Room getRoomByRoomNumber(int roomnumber);
}
