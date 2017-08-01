package com.sherwin.data;

import com.sherwin.dto.Spitter;

public interface SpitterRepository {
	
	public Spitter save(Spitter spitter);
	public Spitter findByUsername(String username);

}
