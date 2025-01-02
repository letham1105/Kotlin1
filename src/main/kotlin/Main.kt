fun main() {
    // Gọi hàm welcome
    welcome()

    // Gọi hàm userInfo để lấy thông tin sinh viên
    userInfo()

    // Gọi hàm departmentDetails để chọn khoa
    val chosenDepartment = departmentDetails()
    println("You have chosen the department: $chosenDepartment")
}

// Hàm để hiển thị thông báo chào mừng
fun welcome() {
    println("Welcome to the University Management System!")
    println("This program will guide you through entering your information and choosing a department.")
    println("---------------------------------------------------")
}

// Hàm để nhập và hiển thị thông tin sinh viên
fun userInfo() {
    print("Enter your full name: ")
    val name = readln()
    print("Enter your student ID: ")
    val studentId = readln()
    print("Enter your GPA: ")
    val GPA = readln()
    print("Enter your Age: ")
    val Age = readln()

    println("\nStudent Information:")
    println("Name: $name")
    println("Student ID: $studentId")
    println("GPA: $GPA" )
    println("Age: $Age")
    println("---------------------------------------------------")
}

// Hàm để hiển thị danh sách các khoa và trả về khoa được chọn
fun departmentDetails(): String {
    val departments = listOf("Computer Science", "Information Technology", "Business Administration", "Electronics Engineering")
    println("Available Departments:")
    for ((index, department) in departments.withIndex()) {
        println("${index + 1}. $department")
    }

    print("Enter the number of the department you want to choose: ")
    val choice = readln().toIntOrNull()

    return if (choice != null && choice in 1..departments.size) {
        departments[choice - 1]
    } else {
        println("Invalid choice. Defaulting to 'Undecided'.")
        "Undecided"
    }
}
