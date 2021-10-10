import java.util.ArrayList;

import sheffield.EasyReader;
import sheffield.EasyWriter;

public class CycleComputer {
    public static void main(String[] args) {
        EasyReader easyReader = new EasyReader("timings.txt");
        // ArrayList<Double> instantSpeed = new ArrayList<>();
        EasyWriter easyWriter = new EasyWriter("timing_result.txt");

        final double PIE = 3.1415927;
        final double DIAMETER = 0.665;
        final double DISTANCE = PIE * DIAMETER;

        int size = easyReader.readInt();
        double[] times = new double[size];
        // double[] instantSpeeds = new double[size];

        // Start calculating
        int i = 0;
        double maximumSpeed = 0;
        double totalTime = 0;
        while (!easyReader.eof()) {
            double currentTime = easyReader.readDouble();
            times[i] = currentTime;
            totalTime += currentTime;

            double instantSpeed = (DISTANCE / currentTime) * 3.6;
            easyWriter.print(instantSpeed, 3);
            easyWriter.println(" km/h");
            // instantSpeeds[i] = instantSpeed;

            // Check for the maximum speed
            if (instantSpeed > maximumSpeed) {
                maximumSpeed = instantSpeed;
            }

            i ++;
            if (i == size) {
                break;
            }
        }

        easyWriter.print("The maximum speed is: ");
        easyWriter.print(maximumSpeed, 3);
        easyWriter.println(" km/h.");

        easyWriter.print("The total distance is: ");
        easyWriter.print(DISTANCE * size / 1000, 3);
        easyWriter.println(" km.");

        easyWriter.print("The total time taken is: ");
        easyWriter.print(totalTime, 3);
        easyWriter.println(" minutes.");

        easyReader.close();
        easyWriter.close();


    }
}
