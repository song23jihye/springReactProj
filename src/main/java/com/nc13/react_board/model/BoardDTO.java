package com.nc13.react_board.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@NoArgsConstructor
@Data
public class BoardDTO {
    private Long id;
    private String title;
    private String text;
    private Long writerId;
    private String nickname;
    private Date writtenTime;
    private Date modifiedTime;
}
