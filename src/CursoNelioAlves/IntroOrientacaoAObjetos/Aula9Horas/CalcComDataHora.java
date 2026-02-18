package CursoNelioAlves.IntroOrientacaoAObjetos.Aula9Horas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcComDataHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-01-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-01-21T21:54:47");
        Instant d06 = Instant.parse("2026-01-21T21:54:11Z");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Agora = "+agora.getDayOfMonth());

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
        LocalDateTime nextHourLocalDateTime = d05.plusHours(1);

        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);
        System.out.println("nextHourLocalDateTime = "+nextHourLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7,ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = "+pastWeekInstant);
        System.out.println("nextWeekInstant = "+nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(),d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime,d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06,pastWeekInstant);

        System.out.println("t1 dias = "+t1.toDays());
        System.out.println("t2 dias = "+t2.toDays());
        System.out.println("t3 dais = "+t3.toDays());
        System.out.println("t4 dais = "+t4.toDays());

    }
}
