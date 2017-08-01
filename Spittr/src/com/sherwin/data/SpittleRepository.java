package com.sherwin.data;

import java.util.List;

import com.sherwin.dto.Spittle;

public interface SpittleRepository {
	
	List<Spittle> findSpittles(long max, int count);
	
	Spittle findOne(long spittleId);

}
