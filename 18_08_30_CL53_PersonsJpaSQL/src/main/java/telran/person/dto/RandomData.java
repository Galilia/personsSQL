package telran.person.dto;

public class RandomData {

	int n_persons;
	int n_names;
	int cities;
	int n_streets;
	int n_buildings;
	int min_id;
	int min_salary;
	int max_salary;
	int percent_empl;
	int n_gartens;
	
	public RandomData(int n_persons, int n_names, int cities, int n_streets, int n_buildings, int min_id,
			int min_salary, int max_salary, int percent_empl, int n_gartens) {
		super();
		this.n_persons = n_persons;
		this.n_names = n_names;
		this.cities = cities;
		this.n_streets = n_streets;
		this.n_buildings = n_buildings;
		this.min_id = min_id;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
		this.percent_empl = percent_empl;
		this.n_gartens = n_gartens;
	}

	public int getN_persons() {
		return n_persons;
	}

	public void setN_persons(int n_persons) {
		this.n_persons = n_persons;
	}

	public int getN_names() {
		return n_names;
	}

	public void setN_names(int n_names) {
		this.n_names = n_names;
	}

	public int getCities() {
		return cities;
	}

	public void setCities(int cities) {
		this.cities = cities;
	}

	public int getN_streets() {
		return n_streets;
	}

	public void setN_streets(int n_streets) {
		this.n_streets = n_streets;
	}

	public int getN_buildings() {
		return n_buildings;
	}

	public void setN_buildings(int n_buildings) {
		this.n_buildings = n_buildings;
	}

	public int getMin_id() {
		return min_id;
	}

	public void setMin_id(int min_id) {
		this.min_id = min_id;
	}

	public int getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}

	public int getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}

	public int getPercent_empl() {
		return percent_empl;
	}

	public void setPercent_empl(int percent_empl) {
		this.percent_empl = percent_empl;
	}

	public int getN_gartens() {
		return n_gartens;
	}

	public void setN_gartens(int n_gartens) {
		this.n_gartens = n_gartens;
	}
	
	
	
}
