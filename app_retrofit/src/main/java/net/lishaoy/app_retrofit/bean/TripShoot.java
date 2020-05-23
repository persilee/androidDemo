package net.lishaoy.app_retrofit.bean;

import java.util.List;

public class TripShoot {

    @Override
    public String toString() {
        return "TripShoot{" +
                "ResponseStatus=" + ResponseStatus +
                ", abTestResult='" + abTestResult + '\'' +
                ", district=" + district +
                ", userInfo=" + userInfo +
                ", currentTime='" + currentTime + '\'' +
                ", subjectModules=" + subjectModules +
                '}';
    }

    /**
     * ResponseStatus : {"Timestamp":"/Date(1590255915833+0800)/","Ack":"Success","Errors":[],"Extension":[{"Id":"CLOGGING_TRACE_ID","Value":"435903280378379200"},{"Id":"RootMessageId","Value":"921812-0a19b305-441737-2123193"}]}
     * abTestResult : A
     * district : {"districtId":-1,"districtName":"全球","groups":[{"code":"tourphoto_global1","name":"推荐","note":"","type":1},{"name":"关注","type":2},{"code":"text cover&title","name":"视频","note":""},{"code":"WHDKD-whjd","name":"网红打卡地","note":""},{"code":"gncmxd","name":"国内超美小岛","note":""},{"code":"WHDKD-ysjdkd","name":"影视剧打卡地","note":""}]}
     * subjectModules : [{"moduleType":9,"virtualType":0,"subjectOperationThemeItemDto":{"title":"本周话题","themes":[],"styleType":7,"moreTextForH5":"","moreTextForApp":"","moreTextForWx":"","moreTextForMainWx":""}},{"moduleType":9,"virtualType":0,"subjectOperationThemeItemDto":{"title":"热门话题","themes":[{"title":"#香港好拍地","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=157&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=157&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=157&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=157&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":-2,"totalCount":59,"groupCode":"photo-hongkong","groupName":"拍照攻略","detail":"","styleType":0,"articleSortType":0},{"title":"#上海拍照必打卡","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=159&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=159&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=159&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=159&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":-1,"totalCount":87,"groupCode":"photo-shanghai","groupName":"拍照攻略","detail":"","styleType":0,"articleSortType":0},{"title":"#北京拍照攻略","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=161&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=161&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=161&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=161&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":0,"totalCount":44,"groupCode":"photo-guangzhou","groupName":"拍照攻略","detail":"","styleType":0,"articleSortType":0},{"title":"#冬季去哪儿","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=114&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=114&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=114&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=114&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":1,"totalCount":370,"groupCode":"tourphoto_topic_DJ","groupName":"最美冬景","detail":"","styleType":0,"articleSortType":0},{"title":"#东南亚海岛","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=129&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=129&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=129&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=129&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":2,"totalCount":1458,"groupCode":"Island_All","groupName":"度假海岛游","detail":"","styleType":0,"articleSortType":0},{"title":"#旅行特色交通","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=73&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=73&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=73&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=73&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":3,"totalCount":44,"groupCode":"tourphoto_topic_jt","groupName":"特色交通","detail":"","styleType":0,"articleSortType":0},{"title":"#风情小镇","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=72&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=72&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=72&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=72&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":4,"totalCount":71,"groupCode":"tourphoto_topic_town","groupName":"风情小镇","detail":"","styleType":0,"articleSortType":0},{"title":"#全球奇妙节日","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=39&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=39&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=39&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=39&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":6,"totalCount":120,"groupCode":"tourphoto_global_JR","groupName":"在当地过节","detail":"","styleType":0,"articleSortType":0},{"title":"#年度旅行盘点","note":"","image":{},"h5Url":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=105&ishideheader=yes&isHideNavBar=YES","appUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=105&ishideheader=yes&isHideNavBar=YES","wxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=105&ishideheader=yes&isHideNavBar=YES&isMini=1","mainWxUrl":"https://m.ctrip.com/webapp/you/livestream/paipai/operateTopic.html?Id=105&ishideheader=yes&isHideNavBar=YES&isMini=2","sortIndex":7,"totalCount":0,"groupCode":"test","detail":"","styleType":0,"articleSortType":0}],"styleType":8,"moreTextForH5":"","moreTextForApp":"","moreTextForWx":"","moreTextForMainWx":""}}]
     * userInfo : {"nickName":"_CFT0****8519","headPhoto":"https://dimg04.c-ctrip.com/images/t1/headphoto/397/132/243/542067aa29904ae9aca7e88f43eaeb6f_C_180_180.jpg","clientAuth":"C0C9C9B2C59AB58A6D731910C8E448ED","identityType":0}
     * currentTime : 2020-05-24 01:45:15
     */

    private ResponseStatusBean ResponseStatus;
    private String abTestResult;
    private DistrictBean district;
    private UserInfoBean userInfo;
    private String currentTime;
    private List<SubjectModulesBean> subjectModules;

    public ResponseStatusBean getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(ResponseStatusBean ResponseStatus) {
        this.ResponseStatus = ResponseStatus;
    }

    public String getAbTestResult() {
        return abTestResult;
    }

    public void setAbTestResult(String abTestResult) {
        this.abTestResult = abTestResult;
    }

    public DistrictBean getDistrict() {
        return district;
    }

    public void setDistrict(DistrictBean district) {
        this.district = district;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public List<SubjectModulesBean> getSubjectModules() {
        return subjectModules;
    }

    public void setSubjectModules(List<SubjectModulesBean> subjectModules) {
        this.subjectModules = subjectModules;
    }

    public static class ResponseStatusBean {
        @Override
        public String toString() {
            return "ResponseStatusBean{" +
                    "Timestamp='" + Timestamp + '\'' +
                    ", Ack='" + Ack + '\'' +
                    ", Errors=" + Errors +
                    ", Extension=" + Extension +
                    '}';
        }

        /**
         * Timestamp : /Date(1590255915833+0800)/
         * Ack : Success
         * Errors : []
         * Extension : [{"Id":"CLOGGING_TRACE_ID","Value":"435903280378379200"},{"Id":"RootMessageId","Value":"921812-0a19b305-441737-2123193"}]
         */



        private String Timestamp;
        private String Ack;
        private List<?> Errors;
        private List<ExtensionBean> Extension;

        public String getTimestamp() {
            return Timestamp;
        }

        public void setTimestamp(String Timestamp) {
            this.Timestamp = Timestamp;
        }

        public String getAck() {
            return Ack;
        }

        public void setAck(String Ack) {
            this.Ack = Ack;
        }

        public List<?> getErrors() {
            return Errors;
        }

        public void setErrors(List<?> Errors) {
            this.Errors = Errors;
        }

        public List<ExtensionBean> getExtension() {
            return Extension;
        }

        public void setExtension(List<ExtensionBean> Extension) {
            this.Extension = Extension;
        }

        public static class ExtensionBean {
            /**
             * Id : CLOGGING_TRACE_ID
             * Value : 435903280378379200
             */

            private String Id;
            private String Value;

            public String getId() {
                return Id;
            }

            public void setId(String Id) {
                this.Id = Id;
            }

            public String getValue() {
                return Value;
            }

            public void setValue(String Value) {
                this.Value = Value;
            }
        }
    }

    public static class DistrictBean {
        @Override
        public String toString() {
            return "DistrictBean{" +
                    "districtId=" + districtId +
                    ", districtName='" + districtName + '\'' +
                    ", groups=" + groups +
                    '}';
        }

        /**
         * districtId : -1
         * districtName : 全球
         * groups : [{"code":"tourphoto_global1","name":"推荐","note":"","type":1},{"name":"关注","type":2},{"code":"text cover&title","name":"视频","note":""},{"code":"WHDKD-whjd","name":"网红打卡地","note":""},{"code":"gncmxd","name":"国内超美小岛","note":""},{"code":"WHDKD-ysjdkd","name":"影视剧打卡地","note":""}]
         */



        private int districtId;
        private String districtName;
        private List<GroupsBean> groups;

        public int getDistrictId() {
            return districtId;
        }

        public void setDistrictId(int districtId) {
            this.districtId = districtId;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public List<GroupsBean> getGroups() {
            return groups;
        }

        public void setGroups(List<GroupsBean> groups) {
            this.groups = groups;
        }

        public static class GroupsBean {
            @Override
            public String toString() {
                return "GroupsBean{" +
                        "code='" + code + '\'' +
                        ", name='" + name + '\'' +
                        ", note='" + note + '\'' +
                        ", type=" + type +
                        '}';
            }

            /**
             * code : tourphoto_global1
             * name : 推荐
             * note :
             * type : 1
             */



            private String code;
            private String name;
            private String note;
            private int type;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }

    public static class UserInfoBean {
        @Override
        public String toString() {
            return "UserInfoBean{" +
                    "nickName='" + nickName + '\'' +
                    ", headPhoto='" + headPhoto + '\'' +
                    ", clientAuth='" + clientAuth + '\'' +
                    ", identityType=" + identityType +
                    '}';
        }

        /**
         * nickName : _CFT0****8519
         * headPhoto : https://dimg04.c-ctrip.com/images/t1/headphoto/397/132/243/542067aa29904ae9aca7e88f43eaeb6f_C_180_180.jpg
         * clientAuth : C0C9C9B2C59AB58A6D731910C8E448ED
         * identityType : 0
         */



        private String nickName;
        private String headPhoto;
        private String clientAuth;
        private int identityType;

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getHeadPhoto() {
            return headPhoto;
        }

        public void setHeadPhoto(String headPhoto) {
            this.headPhoto = headPhoto;
        }

        public String getClientAuth() {
            return clientAuth;
        }

        public void setClientAuth(String clientAuth) {
            this.clientAuth = clientAuth;
        }

        public int getIdentityType() {
            return identityType;
        }

        public void setIdentityType(int identityType) {
            this.identityType = identityType;
        }
    }

    public static class SubjectModulesBean {
        @Override
        public String toString() {
            return "SubjectModulesBean{" +
                    "moduleType=" + moduleType +
                    ", virtualType=" + virtualType +
                    ", subjectOperationThemeItemDto=" + subjectOperationThemeItemDto +
                    '}';
        }

        /**
         * moduleType : 9
         * virtualType : 0
         * subjectOperationThemeItemDto : {"title":"本周话题","themes":[],"styleType":7,"moreTextForH5":"","moreTextForApp":"","moreTextForWx":"","moreTextForMainWx":""}
         */



        private int moduleType;
        private int virtualType;
        private SubjectOperationThemeItemDtoBean subjectOperationThemeItemDto;

        public int getModuleType() {
            return moduleType;
        }

        public void setModuleType(int moduleType) {
            this.moduleType = moduleType;
        }

        public int getVirtualType() {
            return virtualType;
        }

        public void setVirtualType(int virtualType) {
            this.virtualType = virtualType;
        }

        public SubjectOperationThemeItemDtoBean getSubjectOperationThemeItemDto() {
            return subjectOperationThemeItemDto;
        }

        public void setSubjectOperationThemeItemDto(SubjectOperationThemeItemDtoBean subjectOperationThemeItemDto) {
            this.subjectOperationThemeItemDto = subjectOperationThemeItemDto;
        }

        public static class SubjectOperationThemeItemDtoBean {
            @Override
            public String toString() {
                return "SubjectOperationThemeItemDtoBean{" +
                        "title='" + title + '\'' +
                        ", styleType=" + styleType +
                        ", moreTextForH5='" + moreTextForH5 + '\'' +
                        ", moreTextForApp='" + moreTextForApp + '\'' +
                        ", moreTextForWx='" + moreTextForWx + '\'' +
                        ", moreTextForMainWx='" + moreTextForMainWx + '\'' +
                        ", themes=" + themes +
                        '}';
            }

            /**
             * title : 本周话题
             * themes : []
             * styleType : 7
             * moreTextForH5 :
             * moreTextForApp :
             * moreTextForWx :
             * moreTextForMainWx :
             */



            private String title;
            private int styleType;
            private String moreTextForH5;
            private String moreTextForApp;
            private String moreTextForWx;
            private String moreTextForMainWx;
            private List<?> themes;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getStyleType() {
                return styleType;
            }

            public void setStyleType(int styleType) {
                this.styleType = styleType;
            }

            public String getMoreTextForH5() {
                return moreTextForH5;
            }

            public void setMoreTextForH5(String moreTextForH5) {
                this.moreTextForH5 = moreTextForH5;
            }

            public String getMoreTextForApp() {
                return moreTextForApp;
            }

            public void setMoreTextForApp(String moreTextForApp) {
                this.moreTextForApp = moreTextForApp;
            }

            public String getMoreTextForWx() {
                return moreTextForWx;
            }

            public void setMoreTextForWx(String moreTextForWx) {
                this.moreTextForWx = moreTextForWx;
            }

            public String getMoreTextForMainWx() {
                return moreTextForMainWx;
            }

            public void setMoreTextForMainWx(String moreTextForMainWx) {
                this.moreTextForMainWx = moreTextForMainWx;
            }

            public List<?> getThemes() {
                return themes;
            }

            public void setThemes(List<?> themes) {
                this.themes = themes;
            }
        }
    }
}
