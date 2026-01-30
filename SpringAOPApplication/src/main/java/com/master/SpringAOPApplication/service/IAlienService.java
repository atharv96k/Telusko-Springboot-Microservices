package com.master.SpringAOPApplication.service;

import java.util.List;

import com.master.SpringAOPApplication.model.Alien;

public interface IAlienService {
	Alien registerAlien(Alien alien);
	public List<Alien> getAllAliensInfo();
}
