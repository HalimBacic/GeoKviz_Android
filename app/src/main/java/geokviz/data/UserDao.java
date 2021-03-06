package geokviz.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.List;
import geokviz.User;

@Dao
public interface UserDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertdb(User contacts);

    @Query("Select * from User")
    List<User> getAll() throws Exception;

    @Query("Select * from User where username =:un")
    List<User> getUserAll(String un);

    @Query("Select points from User where username=:un")
    Integer getPoints(String un);

    @Query("Select questions from User where username=:un")
    String getQuestions(String un);
}
