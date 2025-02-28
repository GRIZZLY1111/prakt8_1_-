class Student () {

    var name: String = "Мехрдод"
    var dadname: String = "Дилшодович"
    var familia: String = "Солихов"
    var pol: String = "М"
    var gruppa: String = "PR-21"
    var age: Int = 17
    var rost: Int = 182
    var ves: Int = 88
    var vidsporta: String = "Кикбоксинг"

    fun Infa() {
        println("$familia $name $dadname принадлежит по половому признаку к группе $pol, а обучается в группе $gruppa," +
                " ему $age лет рост составляет $rost сантиметра, " +
                "а вес $ves килограмма занимается видом спорта под названием $vidsporta ")
        when{
            (age>17)->{
                println("Данный студент является совершенолетним")
            }
            else->{
                println("Данный студент не является совершенолетним")
            }
        }
    }//Выводит информацию о студенте
    fun srrost() {
        println("Введите число средний рост из какого количества людей вы хотите узнать")
        var x = readln().toInt()
        when(x) {
            0->{
                println("Средний рост среди не был посчитан в связи с тем что вы не вели ни одного человека")
            }
            else->{
            var sum = 0.0
            for (i in 1..x) {
                println("Введите рост $i-ого человека")
                var st = readln().toDouble()
                sum += st.toDouble()
            }
                sum = sum / x
                println("Средний рост среди $x человек = $sum сантиметров")
            }
        }
    }//Выводит средний рост людей пользователя

    fun Izmenenia() {
        try {
            println("Введите фамилию")
            familia = readln()
            println("Введите имя")
            name = readln()
            println("Введите отчество")
            dadname = readln()
            println("Укажите пол")
            pol = readln()
            println("Введите группу")
            gruppa = readln()
            println("Введите дату рождения")
            age = readln().toInt()
            println("Введите рост")
            rost = readln().toInt()
            println("Введите вес")
            ves = readln().toInt()
            println("Введите вид спорта")
            vidsporta = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет все данные студента

    fun Izmeneniefamilii() {
        try {
            println("Введите фамилию")
            familia = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет фамилию студента

    fun Izmeneniename() {
        try {
            println("Введите имя")
            name = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет имя студента

    fun Izmeneniedad() {
        try {
            println("Введите отчество")
            dadname = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет отчество студента

    fun Izmeneniepola() {
        try {
            println("Укажите пол")
            pol = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет пол студента

    fun Izmeneniegruppi() {
        try {
            println("Введите группу")
            gruppa = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет группу в которой обучается студент

    fun Izmenenieage() {
        try {
            println("Введите дату рождения")
            age = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет дату рождения студента

    fun Izmenenierosta() {
        try {
            println("Введите рост")
            rost = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет рост студента

    fun Izmenenievesa() {
        try {
            ves = readln().toInt()
            println("Введите вес")
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет вес студента

    fun Izmenenievidasporta() {
        try {
            println("Введите вид спорта")
            vidsporta = readln()
        } catch (e: NumberFormatException) {
            println("Неверный ввод")
        }
    }//Изменяет вид спорта которым занимается студент
}
fun Izmenenie(_x: Int){
    var x=_x
    println("Нажмите 1 чтобы изменить фамилию, нажмите 2 чтобы изменить имя, нажмите 3 чтобы изменить отчество")
    println("Нажмите 4 чтобы изменить пол, нажмите 5 чтобы изменить группу в которой обучается студент, нажмите 6 чтобы изменить день рождения студента")
    println("Нажмите 7 чтобы изменить рост, нажмите 8 чтобы изменить вес, нажмите 9 чтобы изменить вид спорта которым занимается студент")
    val bob: Student = Student()
    x= readln().toInt()
    when(x){
        (1)->{
            bob.Izmeneniefamilii()
        }
        (2)->{
            bob.Izmeneniename()
        }
        (3)->{
            bob.Izmeneniedad()
        }
        (4)->{
            bob.Izmeneniepola()
        }
        (5)->{
            bob.Izmeneniegruppi()
        }
        (6)->{
            bob.Izmenenieage()
        }
        (7)->{
            bob.Izmenenierosta()
        }
        (8)->{
            bob.Izmenenievesa()
        }
        (9)->{
            bob.Izmenenievidasporta()
        }
    }
}//Оператор выбора что хочет изменить пользователь
