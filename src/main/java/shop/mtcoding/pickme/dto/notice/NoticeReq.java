package shop.mtcoding.pickme.dto.notice;

import lombok.Getter;
import lombok.Setter;

public class NoticeReq {
    @Getter
    @Setter
    public static class NoticeSaveReqDto {
        private Integer companyId;
        private String noticeTitle;
        private String noticeCareer;
        private String noticePay;
        private String noticeEmploytype;
        private String noticeGrade;
        private String noticeLocation;
        private String noticeContent;
    }

}
