package Dao;

import java.util.Set;

import controle2020.ctrlModel.Commercial;

public interface CommercialDao {

	public Set<Commercial> selectAll();
	public void delete(String matricule);
}
