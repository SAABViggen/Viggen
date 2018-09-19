package com.crud.library.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CopyDto {

    private Long id;
    private Long bookId;
    private String status;

    public CopyDto(Long bookId, String status) {
        this.bookId = bookId;
        this.status = status;
    }
}