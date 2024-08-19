package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.entity.Company;
import peaksoft.repository.CompanyRepository;

import java.util.List;
@Repository
@Transactional
public class CompanyRepositoryImpl implements CompanyRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveCompany(Company company) {
        entityManager.persist(company);

    }

    @Override
    public List<Company> getAllCompanies() {
        return entityManager.createQuery("select c from Company c", Company.class).getResultList();
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void deleteCompanyById(Long id) {
        entityManager.remove(entityManager.find(Company.class, id));

    }

    @Override
    public void updateCompany(Long id, Company newCompany) {

    }
}
