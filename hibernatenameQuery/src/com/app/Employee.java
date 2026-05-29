package com.app;


@NamedQueries
	(
			{
				@NamedQuery
				(
						name = "findEmpByName",
						query = "from Employee e where e.name = :name "
				
				);
				
				/*
				 * @NamedQuery(
				 * 	name = " ",
				 *  query=" "
				 * 
				 * )
				 * 
				 * */
				
			}
			
	)



public class Employee {

}
