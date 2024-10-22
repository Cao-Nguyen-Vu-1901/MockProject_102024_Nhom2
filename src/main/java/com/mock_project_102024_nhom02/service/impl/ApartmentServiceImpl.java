package com.mock_project_102024_nhom02.service.impl;

import com.mock_project_102024_nhom02.repository.ApartmentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

import com.mock_project_102024_nhom02.dto.request.ApartmentRequest;
import com.mock_project_102024_nhom02.dto.response.ApartmentResponse;
import com.mock_project_102024_nhom02.service.ApartmentService;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ApartmentServiceImpl implements ApartmentService {

    ApartmentRepository apartmentRepository;

    @Override
    public ApartmentResponse addApartment(ApartmentRequest apartment) {
        return null;
    }

    @Override
    public List<ApartmentResponse> getAllApartments() {
        return List.of();
    }

    @Override
    public ApartmentResponse getApartmentById(String id) {
        return null;
    }

    @Override
    public ApartmentResponse updateApartment(ApartmentRequest apartmentRequest, String id) {
        return null;
    }

    @Override
    public void deleteApartmentById(String id) {

    }
}
