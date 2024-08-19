package peaksoft.repository;

import peaksoft.entity.Company;

import java.util.List;

public interface CompanyRepository {
    void saveCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void deleteCompanyById(Long id);
    void updateCompany(Long id,Company newCompany);
}
