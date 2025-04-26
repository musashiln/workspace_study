package atguigu02.project;

/**
 * ClassName: CustomerView
 * Package: atguigu02.project
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/19 20:35
 * @Version 1.0
 */
public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n---------客户管理系统---------");
            System.out.println("\t 1 添加客户");
            System.out.println("\t 2 修改客户");
            System.out.println("\t 3 删除客户");
            System.out.println("\t 4 客户列表");
            System.out.println("\t 5 退出");
            System.out.println("请选择1-5");

            char key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    private void addNewCustomer(){
        System.out.println("-----添加客户------");
        System.out.println("姓名:");
        String name = CMUtility.readString(4);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(15);
        System.out.println("邮箱：");
        String email = CMUtility.readString(15);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.addCustomer(customer);
        if(flag){
            System.out.println("添加完成");
        }else {
            System.out.println("列表已满，添加失败");
        }
    }

    private void modifyCustomer(){
        System.out.println("---------修改客户--------");
        int index = 0;
        Customer customer = null;
        for(;;){
            System.out.println("请选择修改客户编号：");
            index = CMUtility.readInt();
            if(index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定用户！");
            } else
                break;
        }

        System.out.println("姓名（" + customer.getName() + "):");
        String name = CMUtility.readString(4, customer.getName());
        System.out.println("性别（" + customer.getGender() + "):");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.println("年龄（" + customer.getAge() + "):");
        int age = CMUtility.readInt(customer.getAge());
        System.out.println("电话（" + customer.getPhone() + "):");
        String phone = CMUtility.readString(15, customer.getPhone());
        System.out.println("邮箱（" + customer.getEmail() + "):");
        String email = CMUtility.readString(15, customer.getEmail());

        customer = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.replaceCustomer(index - 1, customer);
        if (flag) {
            System.out.println("----------修改完成--------");
        }else {
            System.out.println("----------无法找到指定用户----------");
        }
    }

    private void deleteCustomer(){
        System.out.println("---------删除客户--------");
        int index = 0;
        Customer customer = null;
        for(;;){
            System.out.println("请选择删除客户编号：");
            index = CMUtility.readInt();
            if(index == -1) {
                return;
            }

            customer = customerList.getCustomer(index - 1);
            if (customer == null) {
                System.out.println("无法找到指定用户！");
            } else
                break;
        }

        System.out.println("确认是否删除(Y/N):");
        char yn = CMUtility.readConfirmSelection();
        if (yn == 'N') {
            return;
        }
        boolean flag = customerList.deleteCustomer(index - 1);
        if (flag) {
            System.out.println("---------删除成功-----------");
        }else {
            System.out.println("无法找到指定用户,删除失败");
        }
    }

    private void listAllCustomer(){
        System.out.println("-----------------------------------客户列表----------------------------");
        Customer[] customers = customerList.getAllCustomer();
        if (customers.length == 0){
            System.out.println("没有客户记录");
        } else {
            System.out.println("number\tname\tgender\tage\tphone\t\t\temail");
            for (int i = 0; i < customers.length; i++) {
                //System.out.println(i + 1 + "\t" + customers[i].getName() + "\t" + customers[i].getGender() + "\t" +
               //         customers[i].getAge() + "\t" + customers[i].getPhone() + "\t\t\t" +
               //         customers[i].getEmail());
                System.out.println((i + 1) + "\t" + customers[i].getDetails());
            }
        }
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
