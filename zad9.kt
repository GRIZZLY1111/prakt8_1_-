fun main()
{
    try
    {
        val bob: Student = Student()
        for (p in 1..10){
        bob.Infa()
        var j =2
        var i=1
        while(i<j) {
            println("Хотите ли изменить данные нажмите 0 для нет нажмите 1 если хотите изменить все данные и нажмите 2 если хотите изменить что-то конкретное " +
                    "и нажмите 3 если хотите вывести информацию о студенте")
            var x = readln().toInt()
            when (x) {
                0 -> {
                    when(p) {
                        10->{
                            bob.srrost()
                            println("Конец программы")
                        }
                        else-> {
                            println("Конец программы для $p студента")
                            i += 1
                        }
                    }
                }
                1 -> {
                    bob.Izmenenia()
                }
                2 -> {
                    Izmenenie(x)
                }
                3 ->{
                    bob.Infa()
                }
                else -> {
                    println("Такого варианта ответа не существует")
                }
            }
        }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный ввод")
    }
}