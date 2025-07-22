package com.vaishnavi.practice.java21feature.String;

public class StringSensorDataExample {
        public static void main(String[] args) {

            // Sensor values
            String sensorName = "DHT22";
            double temperature = 28.6;
            double humidity = 65.4;

            // Format data using formatted()
            String summary = "Sensor: %s\nTemperature: %.1f°C\nHumidity: %.1f%%"
                    .formatted(sensorName, temperature, humidity);

            System.out.println("Sensor Summary:");
            System.out.println(summary);

            // Visual output using repeat()
            System.out.println("\nTemperature Bar: " + "#".repeat((int) temperature));
            System.out.println("Humidity Bar:    " + "*".repeat((int) (humidity / 2)));

            // Multiline report using stripIndent()
            String report = """
                Sensor Report:
                    - Name: %s
                    - Temp: %.1f°C
                    - Humidity: %.1f%%
                    - Status: \\nAll readings normal.\\nNo alert.\\n
                """.stripIndent().formatted(sensorName, temperature, humidity);

            System.out.println("\nFormatted Report (with stripIndent):");
            System.out.println(report);

            // Decode escape sequences in status
            String statusRaw = "\\nAll readings normal.\\nSystem stable.";
            String decodedStatus = statusRaw.translateEscapes();
            System.out.println("Decoded Status:");
            System.out.println(decodedStatus);
        }
    }


