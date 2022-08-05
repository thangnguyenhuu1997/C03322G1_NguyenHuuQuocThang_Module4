package vn.codegym.case_study.service.contract.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.case_study.model.contract.AttachFacility;
import vn.codegym.case_study.model.contract.Contract;
import vn.codegym.case_study.model.contract.ContractDetail;
import vn.codegym.case_study.repository.contract.ContractRepository;
import vn.codegym.case_study.service.contract.AttachFacilityService;
import vn.codegym.case_study.service.contract.ContractDetailService;
import vn.codegym.case_study.service.contract.ContractService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Autowired
    ContractDetailService contractDetailService;

    @Autowired
    AttachFacilityService attachFacilityService;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<Double> getTotalMoney() {
        List<Double> totalMoneyList = new ArrayList<>();
        List<Contract> contractList = contractRepository.findAll();
        List<ContractDetail> contractDetailList = contractDetailService.findAll();
        List<AttachFacility> attachFacilityList = attachFacilityService.findAll();

        double totalMoney = 0;

        for (int i = 0; i < contractList.size(); i++) {
            for (int j = 0; j < contractDetailList.size(); j++) {
                for (int k = 0; k < attachFacilityList.size(); k++) {
                    if (contractList.get(i).getId() == contractDetailList.get(j).getContract().getId() && contractDetailList.get(j).getAttachFacility().getId() == attachFacilityList.get(k).getId()) {
                        totalMoney = totalMoney + (contractDetailList.get(j).getQuantity() * attachFacilityList.get(k).getCost()) + contractList.get(i).getFacility().getCost();
                    }
                }
            }

            totalMoneyList.add(totalMoney - contractList.get(i).getDeposit());
            totalMoney = 0;
        }


        return totalMoneyList;
    }
}
