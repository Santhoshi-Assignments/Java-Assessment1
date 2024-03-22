package org.example.question1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Map<Employee, Address> employeeAddressMap = createSampleData();

        Employee emp2 = new Employee(4, "Alice");
        getAddress(employeeAddressMap, emp2);

        Set<String> distinctCities = getDistinctCities(employeeAddressMap);
        System.out.println("Distinct cities in ascending order: " + distinctCities);
    }

    public static Map<Employee, Address> createSampleData() {
        Map<Employee, Address> employeeAddressMap = new HashMap<>();
        // Add sample data
        employeeAddressMap.put(new Employee(1, "John"), new Address(101, "Main St", "New York", 10001));
        employeeAddressMap.put(new Employee(2, "Alice"), new Address(202, "Park Ave", "Los Angeles", 90001));
        employeeAddressMap.put(new Employee(3, "Bob"), new Address(303, "Broadway", "Chicago", 60601));
        return employeeAddressMap;
    }

    public static void getAddress(Map<Employee, Address> map, Employee employee) {
        Address address = map.getOrDefault(employee, null);
        if (address != null) {
            System.out.println("Address for " + employee + ": " + address);
        } else {
            System.out.println("Employee " + employee + " does not exist.");
        }
    }

    public static Set<String> getDistinctCities(Map<Employee, Address> map) {
        Set<String> distinctCities = new TreeSet<>();
        for (Address address : map.values()) {
            distinctCities.add(address.toString());
        }
        return distinctCities;
    }
}