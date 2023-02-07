import models.Address;
import services.AddressService;
import services.SalaryService;

import java.util.List;
import java.util.stream.Collectors;

public class Utilities {

    public List<Address> getAddressByCity(AddressService addressservice, String city) {
        List<Address> allAddress = addressservice.getAllAddresses();
        List<Address> filteraddress = allAddress.stream().filter(x -> x.getCity().equals(city)).collect(Collectors.toList());
        return filteraddress;
    }

    public List<Integer> getSalariesAbove(SalaryService salaryservices, int cutoff) {
        List<Integer> salaries = salaryservices.getSalaries();
        List<Integer> filteredSalaries = salaries.stream().filter(x -> x > cutoff).collect(Collectors.toList());

        return filteredSalaries;
    }
}
