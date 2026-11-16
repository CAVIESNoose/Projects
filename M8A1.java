import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M8A1
{
    public static void main(String[] args)
    {
        // File names (kept in the project folder)
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        // Pay rules
        final double REGULAR_HOURS = 40.0;
        final double OVERTIME_RATE = 1.5;

        try
        {
            // Open the input file for reading and the output file for writing
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Read and skip the heading row of the input file
            String line = reader.readLine();

            // Write the new column headings to the output file
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            // Read the first data row
            line = reader.readLine();

            // Process each row until the end of the file
            while (line != null)
            {
                // Skip blank lines
                if (!line.trim().isEmpty())
                {
                    // Split the row into its columns
                    String[] columns = line.split(",");

                    // Column 1 stays a String, columns 2 and 3 are parsed to doubles
                    String empId = columns[0];
                    double payRate = Double.parseDouble(columns[1]);
                    double hoursWorked = Double.parseDouble(columns[2]);

                    // Compute the weekly pay, with overtime for hours over 40
                    double weeklyPay;
                    if (hoursWorked > REGULAR_HOURS)
                    {
                        double overtimeHours = hoursWorked - REGULAR_HOURS;
                        weeklyPay = (REGULAR_HOURS * payRate)
                                  + (overtimeHours * payRate * OVERTIME_RATE);
                    }
                    else
                    {
                        weeklyPay = hoursWorked * payRate;
                    }

                    // Build the output line (weekly pay is formatted to 2 decimals with a $)
                    String outputLine = empId + "," + columns[1] + "," + columns[2]
                                      + "," + String.format("$%.2f", weeklyPay);

                    // Write the line to the output file
                    writer.write(outputLine);
                    writer.newLine();
                }

                // Read the next row
                line = reader.readLine();
            }

            // Close both files
            reader.close();
            writer.close();

            System.out.println("Done. Results written to " + outputFile);
        }
        catch (IOException e)
        {
            // The file could not be found, read or written
            System.out.println("File error: " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            // A pay rate or hours value was not a number
            System.out.println("Bad number in the data file: " + e.getMessage());
        }
    }
}