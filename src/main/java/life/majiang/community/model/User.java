package life.majiang.community.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String accountid;
    private String token;
    private Long gmtcreate;
    private Long gmtmodified;
}
