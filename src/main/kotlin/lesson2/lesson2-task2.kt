package lesson2

fun main () {
    val employees = 50
    val employeeSalary = 30000
    val interns = 20
    val internSalary = 20000

    val salaryExpenses = employees * employeeSalary
    val salaryExpensesAll = interns * internSalary + salaryExpenses
    val salaryAverage = salaryExpensesAll / (employees + interns)

    println(salaryExpenses)
    println(salaryExpensesAll)
    println(salaryAverage)
}