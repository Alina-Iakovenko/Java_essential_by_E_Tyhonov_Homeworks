package task3;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        // Replace with your birthdate
        LocalDate birthDate = LocalDate.of(1983, 1, 5);

        // Calculate time elapsed since birthdate
        Period period = calculateTimeElapsed(birthDate);
        Duration duration = calculateDurationElapsed(birthDate);

        // Print the time elapsed in a user-friendly format
        System.out.println(formatTimeElapsed(period, duration));
    }

    // Calculate years, months, and days elapsed since the given date
    private static Period calculateTimeElapsed(LocalDate fromDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(fromDate, currentDate);
    }

    // Calculate hours, minutes, and seconds elapsed since the given date
    private static Duration calculateDurationElapsed(LocalDate fromDate) {
        LocalDateTime currentTime = LocalDateTime.now();
        return Duration.between(fromDate.atStartOfDay(), currentTime);
    }

    // Format the time elapsed into a user-friendly string
    private static String formatTimeElapsed(Period period, Duration duration) {
        long years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        return String.format(
                "You've lived for %d years, %d months, %d days, %d hours, %d minutes, and %d seconds",
                years, months, days, hours, minutes, seconds
        );
    }
}

