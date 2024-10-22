package com.mock_project_102024_nhom02.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PagingResponse<T> {

    int code;
    int currentPage;
    int pageSize;
    String status;
    String accountType;
    String searchValue;
    long totalItem;
    int totalPage;
    T result;
}
