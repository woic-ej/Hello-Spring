package hello.hellospring.domain;

public class Member {
    private Long id;    //데이터를 구분하기위해 시스템에서 사용하는 임의의 값
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
