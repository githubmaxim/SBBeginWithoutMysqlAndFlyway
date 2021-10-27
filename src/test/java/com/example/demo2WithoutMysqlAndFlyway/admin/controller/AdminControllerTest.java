package com.example.demo2WithoutMysqlAndFlyway.admin.controller;

import com.example.demo2WithoutMysqlAndFlyway.controller.admin.AdminController;
import com.example.demo2WithoutMysqlAndFlyway.service.admin.AdminService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;

//��� �� ������ ������������ ����������� ������������ ������� ������� ��� ��������

//!!!������ �������� ������, �� �� ���� �������������� �� �������� ��� ������ (status 403).
//!!!��� ����������� ������ Spring Security �����������, �����:
// 1. � ���� ����������� ��������� ��������� ��� ����������� ������� ������ ��� ���� ADMIN,
// 2. ����������������� �������� ������,
// 3. ����� ������������ ����� �������� ��������� � ���������������� �������� ������.
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase
@WebMvcTest(AdminController.class)//@WebMvcTest ������ @SpringBootTest + ������� ������� ��������� ������ ������ ����������� �����
// ��������� ������� @MockBean-�������� ��� ���� �������� � ������������ ��������� ������������. @WebMvcTest ������
// @SpringBootTest, ��� ������� ��������� Unit-������������ (��� ���� ����� ����� ������� ���, �����
// �������� �������� ����������, �������� ��� �����������, ������� � �.�.)
@AutoConfigureMockMvc(addFilters = false)
public class AdminControllerTest {

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private AdminService adminService;


//    @Test
//    //@WithMockUser(username = "user1", password = "pwd", roles = {"ADMIN"})
//    void findAllLogPas() throws Exception {
//        when(adminService.findAll()).thenReturn(Collections.singletonList(aLogPasDto()));
//        mockMvc.perform(get("/admin/findAll"))
//                .andExpect(content().json(objectMapper.writeValueAsString(Collections.singletonList(aLogPasDto()))))
//                .andExpect(status().isOk());
//    }
//
//    @Test
////    @WithMockUser(username = "a", password = "a", roles = {"ADMIN"})
//    void deleteUsers() throws Exception {
//        doNothing().when(adminService).deleteLogPas(aLogPasDto().getId());
//        mockMvc.perform(delete("/admin/delete/{id}", aLogPasDto().getId()))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void putLogPasTest() throws Exception {
//        when(adminService.putLogPas(anyInt(), any())).thenReturn("OK");
//        mockMvc.perform(put("/admin/put/{id}", aLogPasDto().getId())
//                .content(objectMapper.writeValueAsString(aLogPasDto().getRoles()))
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
//    }

    @Test
    void f() throws Exception {    }
}