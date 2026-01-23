package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // 간략한 equals
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user  = (UserV2) obj;
//        return this.id.equals(user.id);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 user = (UserV2) o;
        return Objects.equals(id, user.id);
    }
}
