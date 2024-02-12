//Karim Walid Fathy
//ID:120210220
//Section 3

public class Customer {
    private String name;
    private boolean member=false;
    private String memberType;
    
    public Customer(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberType() {
        
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
        member=true;
        
    }
    
    public boolean isMember(){
        return this.member;
    }
    public void setMember(boolean member){
           this.member=member;           
           
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }
    
    
    
}
