package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria)  {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliances = applianceDAO.find(criteria);
		
		// you may add your own code here
		//Вызывает поиск у DAO, обрабатывает и возвращает созданный объект (или список объектов), соответствующих поиску

		//Валидатор проверяет адекватность передаваемых критериев.
		//
		return appliances;
	}

}

//you may add your own new classes
