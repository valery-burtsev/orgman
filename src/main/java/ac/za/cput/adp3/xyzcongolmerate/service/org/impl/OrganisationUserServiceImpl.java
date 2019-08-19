package ac.za.cput.adp3.xyzcongolmerate.service.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.impl.OrganisationUserRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.service.org.OrganisationUserService;

import java.util.Set;

public class OrganisationUserServiceImpl implements OrganisationUserService {

    private OrganisationUserRepository organisationUserRepository;
    private static OrganisationUserService organisationUserService = null;

    private OrganisationUserServiceImpl() {
        this.organisationUserRepository = OrganisationUserRepositoryImpl.getOrganisationUserRepository();
    }

    public OrganisationUserService getOrganisationUserService() {
        if (organisationUserService == null) organisationUserService = new OrganisationUserServiceImpl();
        return organisationUserService;
    }

    @Override
    public OrganisationUser create(OrganisationUser organisationUser) {
        return this.organisationUserRepository.create(organisationUser);
    }

    @Override
    public OrganisationUser read(String orgCode, String userEmail) {
        return this.organisationUserRepository.read(orgCode, userEmail);
    }

    @Override
    public OrganisationUser update(OrganisationUser organisationUser) {
        return this.organisationUserRepository.update(organisationUser);
    }

    @Override
    public void delete(String orgCode, String userEmail) {
        this.organisationUserRepository.delete(orgCode, userEmail);
    }

    @Override
    public Set<OrganisationUser> getAll() {
        return this.organisationUserRepository.getAll();
    }
}
