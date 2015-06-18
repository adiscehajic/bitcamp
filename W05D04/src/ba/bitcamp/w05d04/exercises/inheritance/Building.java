package ba.bitcamp.w05d04.exercises.inheritance;

public abstract class Building {

	public String location;
	public Integer population;
	public Integer area;

	public double getPopulationDencity() {
		return (double) population / area;
	}
}
