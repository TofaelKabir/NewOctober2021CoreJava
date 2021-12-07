package lec25_java_different_type_of_class;

/*
What is Java Random Class?
-- Random class is part of java.util package.
-- An instance of java Random class is used to generate random numbers.
-- This class provides several methods to generate random numbers of type integer, double, long, float etc.
-- Random number generation algorithm works on the seed value. If not provided, seed value is created from system nano time.
-- If two Random instances have same seed value, then they will generate same sequence of random numbers.
-- Java Random class is thread-safe, however in multi-threaded environment it’s advised to use java.util.concurrent.ThreadLocalRandom class.
-- Random class instances are not suitable for security sensitive applications, better to use java.security.SecureRandom in those cases.
 
 */

public class Info_of_random_class {

}
