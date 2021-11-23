
public class Ex6_2_2_FixTheLoops {
	public static void main(String[] args) {
		String[] teams = { "Lions", "Packers", "Bears", "Vikings" };

		// Loop To Fix #1
		System.out.println("Loop 1:");
		for (int i = 0; i < teams.length - 1; i++) {
			System.out.println(teams[i]);
		}
		System.out.println(); // Empty line

		// Loop To Fix #2
		System.out.println("Loop 2:");
		for (int i = 0; i <= teams.length; i++) {
			System.out.println(teams[i]);
		}
		System.out.println(); // Empty line

		// Loop To Fix #3
		System.out.println("Loop 3:");
		for (int i = teams.length; i >= 0; i--) {
			System.out.println(teams[i]);
		}
		System.out.println(); // Empty line

		// Loop To Fix #4
		System.out.println("Loop 4:");
		for (String team : teams) {
			System.out.println(teams[team]);
		}
		System.out.println(); // Empty line

		// Loop To Fix #5
		System.out.println("Loop 5:");
		for (int team : teams) {
			System.out.println(team);
		}
		System.out.println(); // Empty line
	}
}
