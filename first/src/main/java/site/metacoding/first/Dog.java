package site.metacoding.first;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component // 특별한 목적없이 IoC에 등록하고 싶을 때 사용
public class Dog {
    // 내가 new하지 않는 이상 메모리에 뜨지 않음, static으로 설정하면 메모리에 뜨겠당
    private String name = "푸들";

    public Dog() {
        System.out.println("Dog가 IoC 컨테이너에 등록되었어요.");
    }
}
