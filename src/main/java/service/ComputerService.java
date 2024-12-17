package service;

import xservice.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    ComputerDto saveComputer(ComputerDto computerDto);
    List<ComputerDto> getComputersByProce(String proce);
}

