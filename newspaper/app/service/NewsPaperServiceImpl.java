package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewsPaperDTO;
import com.xworkz.newspaper.app.repository.NewsPaperRepository;

public class NewsPaperServiceImpl implements NewsPaperService {
	private NewsPaperRepository newsPaperRepository;

	public NewsPaperServiceImpl(NewsPaperRepository newsPaperRepository) {
		this.newsPaperRepository = newsPaperRepository;
	}

	@Override
	public boolean validateAndSave(NewsPaperDTO dto) {
		System.out.println("invoking validateAndSave in " + this.getClass().getSimpleName());
		if (dto != null) {
			System.out.println("dto is not null");
			String lang = dto.getLang();
			String publisher = dto.getPublisher();
			double price = dto.getPrice();
			int noOfPages = dto.getNo_of_pages();

			if (lang != null && !lang.isEmpty() && lang.length() >= 3 && lang.length() <= 20) {
				System.out.println("lang is valid");
			} else {
				System.err.println("lang is invalid");
				return false;
			}
			if (publisher != null && !publisher.isEmpty() && publisher.length() >= 3 && publisher.length() <= 20) {
				System.out.println("publisher is valid");
			} else {
				System.err.println("publisher is invalid");
				return false;
			}
			if (price > 0 && noOfPages > 0) {
				System.out.println("price and noOfPages is valid");
			} else {
				System.err.println("price and noOfPages is invalid");
				return false;
			}

			this.newsPaperRepository.save(dto);
			return true;
		}
		return false;
	}

}
