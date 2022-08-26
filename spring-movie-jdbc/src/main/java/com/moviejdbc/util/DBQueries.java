package com.moviejdbc.util;

public class DBQueries {

public static final String  INSERTQUERY="INSERT INTO MOVIE(movie_name,genre,language,movie_id) values(?,?,?,?)";
	
	public static final String  UPDATEQUERY="UPDATE MOVIE SET genre=? where movie_id=?";
	
	public static final String  DELETEQUERY="DELETE FROM MOVIE WHERE movie_id=?";
	
	public static final String SELECTQUERY="SELECT * FROM MOVIE";
	public static final String SELECTBYNAME="SELECT * FROM MOVIE WHERE MOVIE_NAME=?";
	public static final String SELECTBYGENRE="SELECT * FROM MOVIE WHERE GENRE=?";
	public static final String SELECTBYLANGUAGE="SELECT * FROM MOVIE WHERE LANGUAGE=?";
	public static final String SELECTBYID="SELECT * FROM MOVIE WHERE MOVIE_ID=?";
}
