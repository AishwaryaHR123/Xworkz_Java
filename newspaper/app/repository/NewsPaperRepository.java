package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;

public interface NewsPaperRepository {
	int TOTAL_ITEMS=10;
	void save(NewsPaperDTO dto);

}
