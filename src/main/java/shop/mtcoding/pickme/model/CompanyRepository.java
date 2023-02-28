package shop.mtcoding.pickme.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.pickme.dto.company.CompanyReq.CompanyJoinReqDto;
import shop.mtcoding.pickme.dto.company.CompanyReq.CompanyLoginReqDto;

@Mapper
public interface CompanyRepository {
    public int insert(CompanyJoinReqDto companyJoinReqDto);

    public int updateById(@Param("id") int id, @Param("companyName") String companyName,
            @Param("companyPassword") String companyPassword, @Param("companyEmail") String companyEmail);

    public int deleteById(int id);

    public List<Company> findAll();

    public Company findById(int id);

    public Company findByUsernameAndPassword(CompanyLoginReqDto CompanyLoginReqDto);

}