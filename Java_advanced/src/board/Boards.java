package board;

import com.mysql.cj.jdbc.Blob;
import lombok.Data;

import java.util.Date;

@Data
public class Boards {

    private String bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
    private String bfilename;
    private Blob bfiledata;
}
