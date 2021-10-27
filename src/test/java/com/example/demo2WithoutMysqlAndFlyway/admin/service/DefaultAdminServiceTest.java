package com.example.demo2WithoutMysqlAndFlyway.admin.service;

import com.example.demo2WithoutMysqlAndFlyway.repository.admin.LogPasRepository;
import com.example.demo2WithoutMysqlAndFlyway.service.admin.AdminService;
import com.example.demo2WithoutMysqlAndFlyway.service.admin.DefaultAdminService;
import com.example.demo2WithoutMysqlAndFlyway.service.registration.LogPasConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.example.demo2WithoutMysqlAndFlyway.admin.prototype.AdminPrtotypeFofUnitTest.aLogPas;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//�������� ��� �� ����� ������ ������ ��� ������ "UsersRepository".
//� "userConverter" ������� ������ ��� ����������� ������� "userService".
public class DefaultAdminServiceTest {

    private LogPasRepository logPasRepository;
    private LogPasConverter logPasConverter;
    private AdminService adminService;

    @BeforeEach
    void setUp() {
        logPasRepository = mock(LogPasRepository.class);
        logPasConverter = new LogPasConverter();
        adminService = DefaultAdminService.builder().logPasRepository(logPasRepository).logPasConverter(logPasConverter).build();
    }

    @Test
    void putLogPasOK(){
        when(logPasRepository.findById(anyInt())).thenReturn(Optional.of(aLogPas()));
        String a = adminService.putLogPas(1, "ADMIN");
        assertThat(a).isEqualTo("OK");
    }

    //��������� ��� ����� �� �����, �.�. � ����������� ������� ����������� ������ ����������
// ��������� ������, ������� ��������� ��� ������
    @Test
    void deleteLogPas() {}
    @Test
    void findAll(){}
}