package ru.otus.processrunner.jobs;

import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
from location: src/main/java
javac ru/otus/processrunner/jobs/Job.java
java ru.otus.processrunner.jobs.Job
 */
@SuppressWarnings("java:S125")
public class Job {
    private static final Logger logger = LoggerFactory.getLogger(Job.class);

    public static void main(String[] args) {
        String endOfRangeEnvVar = System.getenv("endOfRange");
        /*
                    var sc = new java.util.Scanner(System.in);
                    logger.info("Введите первую строку:");
                    logger.atInfo()
                            .setMessage("Первая строка: {}")
                            .addArgument(sc.nextLine())
                            .log();

                    logger.info("Введите вторую строку:");
                    logger.atInfo()
                        .setMessage("Вторая строка: {}")
                        .addArgument(sc.nextLine())
                        .log();
        */
        logger.info("EndOfRange environment variable: {}\n", endOfRangeEnvVar);
        int endOfRange = endOfRangeEnvVar == null ? 100 : Integer.parseInt(endOfRangeEnvVar);
        IntStream.range(1, endOfRange).forEach(val -> logger.info("{}", val));
    }
}
