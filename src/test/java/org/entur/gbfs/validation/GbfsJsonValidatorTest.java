package org.entur.gbfs.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class GbfsJsonValidatorTest {
    @Test
    void testEmptyDeliveryMapValidation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);
        Map<String, InputStream> deliveryMap = new HashMap<>();
        ValidationResult result = validator.validate(deliveryMap);
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV1_0Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v1.0/gbfs.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v1.0/system_hours.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("1.0", result);

        Assertions.assertEquals("1.0", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV1_1Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v1.1/gbfs.json"));
        deliveryMap.put("gbfs_versions", getFixture("fixtures/v1.1/gbfs_versions.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v1.1/system_hours.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("1.1", result);

        Assertions.assertEquals("1.1", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV2_0Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.0/gbfs.json"));
        deliveryMap.put("gbfs_versions", getFixture("fixtures/v2.0/gbfs_versions.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v2.0/system_hours.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("2.0", result);

        Assertions.assertEquals("2.0", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV2_1Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.1/gbfs.json"));
        deliveryMap.put("gbfs_versions", getFixture("fixtures/v2.1/gbfs_versions.json"));
        deliveryMap.put("system_information", getFixture("fixtures/v2.1/system_information.json"));
        deliveryMap.put("vehicle_types", getFixture("fixtures/v2.1/vehicle_types.json"));
        deliveryMap.put("station_information", getFixture("fixtures/v2.1/station_information.json"));
        deliveryMap.put("station_status", getFixture("fixtures/v2.1/station_status.json"));
        deliveryMap.put("free_bike_status", getFixture("fixtures/v2.1/free_bike_status.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v2.1/system_hours.json"));
        deliveryMap.put("system_calendar", getFixture("fixtures/v2.1/system_calendar.json"));
        deliveryMap.put("system_regions", getFixture("fixtures/v2.1/system_regions.json"));
        deliveryMap.put("system_pricing_plans", getFixture("fixtures/v2.1/system_pricing_plans.json"));
        deliveryMap.put("system_alerts", getFixture("fixtures/v2.1/system_alerts.json"));
        deliveryMap.put("geofencing_zones", getFixture("fixtures/v2.1/geofencing_zones.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("2.1", result);

        Assertions.assertEquals("2.1", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV2_2Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.2/gbfs.json"));
        deliveryMap.put("gbfs_versions", getFixture("fixtures/v2.2/gbfs_versions.json"));
        deliveryMap.put("system_information", getFixture("fixtures/v2.2/system_information.json"));
        deliveryMap.put("vehicle_types", getFixture("fixtures/v2.2/vehicle_types.json"));
        deliveryMap.put("station_information", getFixture("fixtures/v2.2/station_information.json"));
        deliveryMap.put("station_status", getFixture("fixtures/v2.2/station_status.json"));
        deliveryMap.put("free_bike_status", getFixture("fixtures/v2.2/free_bike_status.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v2.2/system_hours.json"));
        deliveryMap.put("system_calendar", getFixture("fixtures/v2.2/system_calendar.json"));
        deliveryMap.put("system_regions", getFixture("fixtures/v2.2/system_regions.json"));
        deliveryMap.put("system_pricing_plans", getFixture("fixtures/v2.2/system_pricing_plans.json"));
        deliveryMap.put("system_alerts", getFixture("fixtures/v2.2/system_alerts.json"));
        deliveryMap.put("geofencing_zones", getFixture("fixtures/v2.2/geofencing_zones.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("2.2", result);

        Assertions.assertEquals("2.2", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testSuccessfulV2_3Validation() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.3/gbfs.json"));
        deliveryMap.put("gbfs_versions", getFixture("fixtures/v2.3/gbfs_versions.json"));
        deliveryMap.put("system_information", getFixture("fixtures/v2.3/system_information.json"));
        deliveryMap.put("vehicle_types", getFixture("fixtures/v2.3/vehicle_types.json"));
        deliveryMap.put("station_information", getFixture("fixtures/v2.3/station_information.json"));
        deliveryMap.put("station_status", getFixture("fixtures/v2.3/station_status.json"));
        deliveryMap.put("free_bike_status", getFixture("fixtures/v2.3/free_bike_status.json"));
        deliveryMap.put("system_hours", getFixture("fixtures/v2.3/system_hours.json"));
        deliveryMap.put("system_calendar", getFixture("fixtures/v2.3/system_calendar.json"));
        deliveryMap.put("system_regions", getFixture("fixtures/v2.3/system_regions.json"));
        deliveryMap.put("system_pricing_plans", getFixture("fixtures/v2.3/system_pricing_plans.json"));
        deliveryMap.put("system_alerts", getFixture("fixtures/v2.3/system_alerts.json"));
        deliveryMap.put("geofencing_zones", getFixture("fixtures/v2.3/geofencing_zones.json"));

        ValidationResult result = validator.validate(deliveryMap);

        printErrors("2.3", result);

        Assertions.assertEquals("2.3", result.getSummary().getVersion());
        Assertions.assertEquals(0, result.getSummary().getErrorsCount());
    }

    @Test
    void testMissingRequiredFile() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.2/gbfs.json"));

        ValidationResult result = validator.validate(deliveryMap);

        Assertions.assertTrue(result.getFiles().get("system_information").isRequired());
        Assertions.assertFalse(result.getFiles().get("system_information").isExists());
    }

    @Test
    void testMissingNotRequiredFile() {
        GbfsJsonValidator validator = new GbfsJsonValidator(false, true);

        Map<String, InputStream> deliveryMap = new HashMap<>();
        deliveryMap.put("gbfs", getFixture("fixtures/v2.2/gbfs.json"));

        ValidationResult result = validator.validate(deliveryMap);

        Assertions.assertFalse(result.getFiles().get("vehicle_types").isRequired());
        Assertions.assertFalse(result.getFiles().get("vehicle_types").isExists());
    }

    private InputStream getFixture(String name) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(name);
        return inputStream;
    }

    private void printErrors(String version, ValidationResult result) {
        result.getFiles().entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .filter(entry -> entry.getValue().getErrorsCount() > 0)
                .forEach(entry -> {
                    System.out.println("Version " + version + " - File: " + entry.getKey());
                    System.out.println(entry.getValue().getError().toJSON().toString(2));
                });
    }
}
