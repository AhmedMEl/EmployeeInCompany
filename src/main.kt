fun main(){

    var empWeb=WebDeveloper("ali",55,500000.0)
    empWeb.hisJob("Web Developer")
    empWeb.webSite()

    var empIos=IOSDeveloper("ahmed",30,400000.0)
    empIos.hisJob("IOS Developer")
    empIos.iosApp()

    var empAndroid=AndroidDeveloper("saleh",25,100000.0)
    empAndroid.hisJob("Android Developer")
    empAndroid.androidApp()
}

open class Employee(var name :String,var age:Int ,var salary: Double){
    var job:String="Employee"
    fun hisJob(job:String){
        this.job=job
    }

}

class WebDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    fun webSite(){
        println("you are $name,your are $age years,your job is $job and you have $salary $ salary")
    }
}


class AndroidDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    fun androidApp(){
        println("you are $name,your are $age years,your job is $job and you have $salary $ salary")
    }
}


class IOSDeveloper(name: String,age: Int,salary: Double):Employee(name,age,salary) {
    fun iosApp(){
        println("you are $name,your are $age years,your job is $job and you have $salary $ salary")    }
}
